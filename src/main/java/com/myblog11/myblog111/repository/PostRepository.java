package com.myblog11.myblog111.repository;

import com.myblog11.myblog111.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long> {
}
