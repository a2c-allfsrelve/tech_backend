package com.example.demo.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.repository.PostRepository;
import com.example.demo.domain.repository.entity.PostEntity;

import lombok.RequiredArgsConstructor;

/**
 * サンプルコードのサービスクラスです。
 * @author Atsushi
 *
 */
@Service
@RequiredArgsConstructor
public class PostService {

	private final PostRepository postRepository;

	/**
	 *
	 * 投稿取得のサービスです。
	 * @return 投稿と投稿者
	 */
	public List<PostEntity> getAllPosts(){

		List<PostEntity> responses = postRepository.getAllPosts();

		return responses;
	}

}
