package com.blogcodemichellibrito.codeblog.service;

import com.blogcodemichellibrito.codeblog.model.Post;

import java.util.List;

public interface CodeblogService {
    List<Post> findAll();

    Post findById(Long id);

    Post save(Post post);


}
