package com.example.demo.domain.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.repository.entity.PostEntity;
import com.example.demo.domain.repository.mapper.PostMapper;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class PostRepository {

	/** SampleCodeMapperのマッパーです。 */
	private final PostMapper postMapper;

	/**
	 * 投稿取得のアレです。
	 * @return
	 */
	public List<PostEntity> getAllPosts(){

		List<PostEntity> responses = postMapper.getAllPosts();

		return responses;
	}
}
