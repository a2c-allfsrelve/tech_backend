package com.example.demo.constants;

/**
 * メッセージコードのインターフェースだよ。
 * enumのGetterを外から叩けるようにしています。
 * メッセージを取得するときにこれを使うことで、メッセージそのものが直接いじられないですむっていうのがあるよ。
 * @author Atsushi
 *
 */
public interface MessageCodeInterface {

	//メッセージコードを取得
	public String getCode();
}
