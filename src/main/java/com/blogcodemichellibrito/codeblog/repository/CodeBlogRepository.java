package com.blogcodemichellibrito.codeblog.repository;

import com.blogcodemichellibrito.codeblog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CodeBlogRepository extends JpaRepository<Post, Long> {
}
