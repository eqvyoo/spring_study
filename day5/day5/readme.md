day5/day5/src/main/resources/application.properties 파일에 아래와 같이 설정을 추가해줘야 합니다.

# MySQL 설정
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# DB Source URL
spring.datasource.url=jdbc:mysql://127.0.0.1:3306/sys?serverTimezone=UTC&characterEncoding=UTF-8

# DB username
spring.datasource.username=root

# DB password
spring.datasource.password=비밀번호

# true 설정 시 실행되는 쿼리문 로그로 확인 가능
spring.jpa.show-sql=true

# DDL(create, alter, drop) 자동 실행 기능
spring.jpa.hibernate.ddl-auto=update

# JPA의 구현체인 Hibernate가 동작하면서 발생한 SQL의 가독성을 높여준다.
spring.jpa.properties.hibernate.format_sql=true

# JPA 데이터베이스 플랫폼 지정 (현재 MYSQL InnoDB를 사용중)
spring.jpa.database-platform=org.hibernate.dialect.MySQL5InnoDBDialect
