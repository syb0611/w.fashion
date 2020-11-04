package com.store.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.store.vo.MemberVO;

@Mapper
public interface MemberMapper {

	//회원 목록 가져오기
	public List<MemberVO> getMemberList();
	
	//회원 등록
	public void registerMember(MemberVO member);
	
	//회원 정보 가져오기
	public MemberVO getMemberInfo(MemberVO member);
	
	//회원 삭제
	public int deleteMember(MemberVO member);
}
