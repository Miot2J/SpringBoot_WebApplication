package jpabook.jpashop.domain;

import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
public class Address {

    private String city;
    private String street;
    private String zipcode;

    //JPA에서 빈 생성자를 프록시등에 활용하기 위해 요구한다. 하지만 값 타입을 변경 불가능하게 만드는게 좋으므로 Protected로 제약을 두자!
    protected Address() {
    }

    //생성시에만 값이 들어오고 변경 할 수 없게 만든다.
    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }
}
