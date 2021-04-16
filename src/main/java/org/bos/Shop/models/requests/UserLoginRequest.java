package org.bos.Shop.models.requests;

import lombok.Data;

public @Data class UserLoginRequest {
	
	private String email;
	private String password;

}
