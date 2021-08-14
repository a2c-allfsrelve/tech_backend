package com.example.demo.domain.repository.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class PostsResponseEntity {

	@JsonProperty("posts")
	private List<PostEntity> postsRespons;

}
