package com.example.demo.domain.repository.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

/**
 * サンプルコードの型を定義するやつらです。
 *
 * @author Atsushi
 */
@Data
@ToString(callSuper = true)
@Accessors(chain = true) //setterをつなげて書ける
@NoArgsConstructor //デフォルトコンストラクタを勝手に生成
@AllArgsConstructor
public class PostEntity {

	//投稿者名
	@JsonProperty("name")
	private String name;

	//投稿
	@JsonProperty("post")
	private String post;

}
