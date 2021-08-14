package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.repository.entity.PostsResponseEntity;
import com.example.demo.domain.repository.entity.ResponseModel;
import com.example.demo.domain.service.PostService;

import lombok.RequiredArgsConstructor;


@RestController
@RequiredArgsConstructor //finalなフィールドを初期化するコンストラクタが生成される。勝手にね。
public class PostRestController {

	/** @RequiredArgsConstructorのおかげでフィールドとして宣言するだけでコンストラクタが生成されます。 */
	private final PostService postService;

	/**
	 * すべての投稿と投稿者名を取得します。
	 * @return
	 */
	@GetMapping("/posts")
	public ResponseModel<PostsResponseEntity> getAllPosts(){

		PostsResponseEntity postsRes = postService.getAllPosts();

		ResponseModel<PostsResponseEntity> response = new ResponseModel<PostsResponseEntity>(
				postsRes, null);

		return response;
	}

}
