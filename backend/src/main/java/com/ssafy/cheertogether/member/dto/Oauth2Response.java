package com.ssafy.cheertogether.member.dto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Oauth2Response {
	private boolean isNewMember;
	private String token;
	private String email;
}
