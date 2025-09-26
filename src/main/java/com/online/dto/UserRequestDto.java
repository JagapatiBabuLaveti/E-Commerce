package com.online.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class UserRequestDto {
	private String id;
	@Schema(name = "User", description = "Represents a user in the system")
	private String name;
	private String email;
	private String password;
	private Long contactId;

}
