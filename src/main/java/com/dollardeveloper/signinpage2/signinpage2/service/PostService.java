package com.dollardeveloper.signinpage2.signinpage2.service;

import com.dollardeveloper.signinpage2.signinpage2.model.Post;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PostService {

    List<Post> getAllPosts();

    List<Post> findLatest3();

    Post findById(Long id);

    Post create(Post post);

    Post edit(Post post);

    void deleteById(Long id);



}
