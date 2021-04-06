# SpringBoot_WebApplication

# 스프링 부트와 JPA를 이용한 쇼핑웹 어플리케이션 구현하기

----
+ < Dependencies >      
  + Spring Web Starter
  + Thymeleaf
  + Spring Data JPA
  + H2 Database
  + Lombok
  + devtools 라이브러리 사용시, html 파일 하나만 Recompile 가능
    
----
 + < Basic Setting >
    + Setting -> Annotation Processor -> CHECK Enable annotation processing
-------

API 연동은 PostMan 활용

-----
< Annotation >

+ @JsonIgnore : json 객체 넘길때 내부 정보 노출 하지 않기 위해 엔티티에서 설정
