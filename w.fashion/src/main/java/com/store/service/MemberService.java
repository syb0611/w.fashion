package com.store.service;

import java.util.List;

import com.store.vo.MemberVO;

public interface MemberService {

	public List<MemberVO> getMemberList();

	public void registerMember(MemberVO member);

	
}
