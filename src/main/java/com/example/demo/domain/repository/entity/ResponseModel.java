package com.example.demo.domain.repository.entity;


import com.example.demo.controller.model.ErrorInfo;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * 全部のレスポンスで共通して使うEntityクラス。
 * dataとerrorのどちらかが返される。
 *
 * @author Atsushi
 * @param <T>
 */
@Data
@Builder
@AllArgsConstructor //全フィールドに対する初期化値を引数にとるコンストラクタを勝手に生成
@JsonInclude(JsonInclude.Include.NON_NULL) //nullの場合にキー名ごと表示させなくする
public class ResponseModel<T> {
	private T data;
	private ErrorInfo error;
}
