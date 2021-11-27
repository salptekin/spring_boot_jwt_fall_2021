package com.techproed.spring_boot_jwt_fall_2021;

public class AuthenticationResponse {

	private final String JWT;

	public AuthenticationResponse(String JWT) {
		this.JWT = JWT;
	}

	public String getJWT() {
		return JWT;
	}
	
}
