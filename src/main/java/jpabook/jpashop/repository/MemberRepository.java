package jpabook.jpashop.repository;

import jpabook.jpashop.domain.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class MemberRepository {

//    //엔티티 매니져를 스프링이 생성한 엔티티 매니져에 주입한다.
//    @PersistenceContext // Spring data Jpa가 @Autowired를 지원하고 Lombok이 @RequiredArgsConstructor 를 지원한다
    private final EntityManager em;

    public void save(Member member) {
        em.persist(member);
    }

    public Member findOne(Long id) {
        return em.find(Member.class, id);
    }

    public List<Member> findAll() {

        return em.createQuery("select m from  Member  m", Member.class)
                 .getResultList();
    }

    public List<Member> findByName(String name) {
        return em.createQuery("select m from Member m where m.name = :name",Member.class)
                .setParameter("name",name)
                .getResultList();
    }
}
