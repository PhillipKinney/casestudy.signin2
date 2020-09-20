package com.dollardeveloper.signinpage2.signinpage2.repository;

import com.dollardeveloper.signinpage2.signinpage2.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>{

}
