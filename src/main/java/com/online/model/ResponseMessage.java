package com.online.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
public class ResponseMessage {
	@NonNull
	private Integer statusCode;
	@NonNull
	private String status;
	@NonNull
	private String message;
	@NonNull
	private Object data;
//	@NonNull
	private List<?> list;
}
