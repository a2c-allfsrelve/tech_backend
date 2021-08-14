package com.example.demo.domain.service;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.example.demo.constants.SampleCodeBook;
import com.example.demo.constants.SampleException;
import com.example.demo.domain.repository.PostRepository;
import com.example.demo.domain.repository.entity.PostEntity;
import com.example.demo.domain.repository.entity.PostsResponseEntity;

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
	public PostsResponseEntity getAllPosts(){

		List<PostEntity> posts = postRepository.getAllPosts();
		PostsResponseEntity response = new PostsResponseEntity();

		/**
		 * 取得したリストをレスポンス型に詰め込む
		 * 多分これはここでやるのでいいとおもう。
		 */
		response.setPostsRespons(posts);


		int a = 1;
		if(a == 1) {
			throw new SampleException(HttpStatus.NOT_FOUND,
				SampleCodeBook.MessageCode.ERROR1, "ログコード！");
		}

		return response;
	}

}
