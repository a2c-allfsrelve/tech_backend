package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.constants.SampleException;
import com.example.demo.domain.repository.entity.ResponseModel;

import lombok.extern.slf4j.Slf4j;


/**
 * コントローラからthrowされるExceptionをハンドルするクラス
 */
@RestControllerAdvice
@Slf4j
public class ControllerExceptionHandler {

	public ResponseEntity<ResponseModel<Object>> handleSampleException(
		final SampleException e){


		return null;

	}

}