package com.order.order.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDto {
	
	private String id;
	private String password;
	private boolean admin;
	private String address;
	private String phone;
}
