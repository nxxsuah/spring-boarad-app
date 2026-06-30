package kr.co.sboard.repository;

import kr.co.sboard.entity.Article;
import kr.co.sboard.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    int countUserByUserid(String userid);
    int countUserByNick(String nick);
    int countUserByEmail(String email);
    int countUserByHp(String hp);
}
