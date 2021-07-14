package com.example.demo.domain.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.repository.entity.PostEntity;

/**
 * 投稿取得のインターフェイスを提供します。
 * @author Atsushi
 *
 */
@Mapper
public interface PostMapper {

	/**
	 * 投稿取得のインターフェースを提供します。
	 * @return
	 */
	List<PostEntity> getAllPosts();
}
