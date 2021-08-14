package com.example.demo.constants;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 各種コードの定義
 * @author Atsushi
 *
 */
public class SampleCodeBook {

	@AllArgsConstructor
	@Getter //https://qiita.com/scallop722/items/e91db97658d90b6df1e8 参照
	public enum MessageCode implements MessageCodeInterface{
		ERROR1("エラーの見本です。"), ERROR2("エラーの見本2です。");

		private String code;
	}
}
