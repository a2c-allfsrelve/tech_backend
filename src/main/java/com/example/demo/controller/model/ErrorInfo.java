package com.example.demo.controller.model;

import com.example.demo.constants.SampleCodeBook;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * エラーレスポンスクラスです。
 * @author Atsushi
 *
 */
@Data
@AllArgsConstructor
public class ErrorInfo {

	//エラーコード
	private String code;

	//エラーメッセージ
	private String message;

	/**
	 * エラーレスポンスを生成します。
	 * @param messageCode
	 * @param message
	 */
	public ErrorInfo(SampleCodeBook.MessageCode messageCode, String message) {
		this.code = messageCode.getCode();
		this.message = message;
	}
}
