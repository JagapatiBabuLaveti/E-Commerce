package com.online.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
public class UserRequestDto {
	@NonNull
	private String name;
	@NonNull
	private String email;
	@NonNull
	private String password;
	@NonNull
	private Long contactId;

}
