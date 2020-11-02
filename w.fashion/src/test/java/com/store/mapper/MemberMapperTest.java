package com.store.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.store.vo.MemberVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class MemberMapperTest {
	
	@Setter(onMethod_ = @Autowired)
	private MemberMapper memberMapper;
	
	//@Test
	public void testGetMemberList() {
		memberMapper.getMemberList().forEach(member -> log.info(member));
	}
	
	//@Test
	public void testRegisterMember() {
		MemberVO member = new MemberVO();
		member.setUserid("ccc");
		member.setUsername("ccc");
		member.setUserpw("0000");
		member.setEmail("");
		member.setPhone("");
		member.setZip("");
		member.setAddress1("");
		member.setAddress2("");
		member.setAuth("1");
		memberMapper.registerMember(member);
	}
	
	//@Test
	public void testGetMemberInfo() {
		MemberVO member = new MemberVO();
		member.setUserid("admin");
		member.setUserpw("0000");
		member = memberMapper.getMemberInfo(member);
		
		log.info(member);
	}
	
	@Test
	public void testDeleteMember() {
		MemberVO member = new MemberVO();
		member.setUserid("aaa");
		
		log.info("DELETE count : " + memberMapper.deleteMember(member));
	}
}
