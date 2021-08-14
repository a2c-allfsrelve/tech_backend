package com.example.demo.constants;

import java.util.Objects;

import org.springframework.http.HttpStatus;

import lombok.Getter;

/**
 * 深夜にノリで独自で例外クラスつくってみたよ。
 * → RuntimeExceptionを継承して例外を生成した。この引数2つのRuntimeExceptionについてはググってみてね。
 * @author Atsushi
 *
 */
@Getter
public class SampleException extends RuntimeException {

	//HTTPレスポンスステータス
	private HttpStatus httpstatus;

	//エラーコード
	private MessageCodeInterface errorCode;

	//ログコードのクラスは時間があるときに実装するね。
	private String logCode;

	/**
	 * 独自例外を生成
	 * @param httpStatus
	 * @param logCode
	 */
	public  SampleException(HttpStatus httpStatus,
		MessageCodeInterface errorCode, String logCode) {
		this(httpStatus, null, errorCode, logCode);

	}

	/**
	 * 独自例外を生成
	 * @param httpStatus
	 * @param cause
	 * @param errorCode
	 * @param logCode
	 */
	public SampleException(HttpStatus httpStatus,
		Throwable cause, MessageCodeInterface errorCode, String logCode) {
		super(createMessage(errorCode), cause);
		this.httpstatus = httpStatus;
		this.errorCode = errorCode;
		this.logCode = logCode;
	}

	//nullチェックと簡単なエラーコードの整形
	private static String createMessage(MessageCodeInterface code) {
		String codeStr = Objects.isNull(code) ? "" : code.getCode();
		return "error[" + codeStr + "]";
	}


}
