package com.myblog11.myblog111.service.impl;

import com.myblog11.myblog111.entity.Post;
import com.myblog11.myblog111.payload.PostDto;
import com.myblog11.myblog111.repository.PostRepository;
import com.myblog11.myblog111.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(com.myblog11.myblog111.repository.PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto create(PostDto postDto) {
        Post post=new Post();
        post.setTitle(postDto.getTitle());
        post.setDescription(postDto.getDescription());
        post.setContent(postDto.getContent());
        Post savedPost =postRepository.save(post);

        PostDto dto =new PostDto();
        dto.setTitle(savedPost.getTitle());
        dto.setDescription(savedPost.getDescription());
        dto.setContent(savedPost.getContent());
        return null;
    }
}
