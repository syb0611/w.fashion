package com.store.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.store.mapper.MemberMapper;
import com.store.vo.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	@Override
	public List<MemberVO> getMemberList() {
		
		return memberMapper.getMemberList();
	}

	@Override
	public void registerMember(MemberVO member) {
		memberMapper.registerMember(member);
	}

}
