package com.blogcodemichellibrito.codeblog.service.serviceImpl;

import com.blogcodemichellibrito.codeblog.model.Post;
import com.blogcodemichellibrito.codeblog.repository.CodeBlogRepository;
import com.blogcodemichellibrito.codeblog.service.CodeblogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeblogServiceImpl implements CodeblogService {
    @Autowired
    CodeBlogRepository repo;

    @Override
    public List<Post> findAll() {
        return repo.findAll();
    }

    @Override
    public Post findById(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return repo.save(post);
    }
}
