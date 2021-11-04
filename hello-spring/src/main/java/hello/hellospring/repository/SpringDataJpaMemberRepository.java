package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    @Override
    Optional<Member> findByName(String name); // findByName 이라는 인터페이스 이름만으로 JPQL이 자동으로 작성
    // JPQL: select m from Member m where m.name = ?
}
