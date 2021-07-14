package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.repository.entity.PostEntity;
import com.example.demo.domain.service.PostService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor //finalなフィールドを初期化するコンストラクタが生成される。勝手にね。
public class PostRestController {

	private final PostService postService;

	@GetMapping("/posts")
	public List<PostEntity> getAllPosts(){

		List<PostEntity> response = postService.getAllPosts();

		return response;
	}

}
