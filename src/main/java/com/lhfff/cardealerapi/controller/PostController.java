package com.lhfff.cardealerapi.controller;

import com.lhfff.cardealerapi.model.Post;
import com.lhfff.cardealerapi.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
	private final PostRepository postRepository;
	
	@Autowired
	public PostController(@Qualifier("PostRepository") PostRepository postRepository) {
		this.postRepository = postRepository;
	}
	
	@GetMapping("getPosts")
	public List<Post> getAll() {
		return postRepository.findAll();
	}
}
