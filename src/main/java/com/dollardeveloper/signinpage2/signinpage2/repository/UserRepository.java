package com.dollardeveloper.signinpage2.signinpage2.repository;

import com.dollardeveloper.signinpage2.signinpage2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
