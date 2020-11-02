package com.store.vo;

import java.util.Date;

import lombok.Data;

@Data
public class MemberVO {
	private long mno;
	private String userid;
	private String username;
	private String userpw;
	private String email;
	private String phone;
	private String zip;
	private String address1;
	private String address2;
	private Date regdate;
	private String auth;
}
