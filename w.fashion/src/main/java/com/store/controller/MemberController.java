package com.store.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.store.service.MemberService;
import com.store.vo.MemberVO;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	/* 로그인 화면으로 이동 */
	@GetMapping(value = "/login")
	public String loginForm() {
		
		return "member/login.tiles";
	}
	
	/* 회원가입 화면으로 이동 */
	@GetMapping(value = "/join")
	public String joinForm() {
		
		return "member/join.tiles";
	}
	
	/* 회원 목록 조회 -- 관리자 */
	@GetMapping(value = "/list")
	public String list(Model model) {
		model.addAttribute("memberList", memberService.getMemberList());
		
		return "member/list.tiles2";
	}
	
	/* 회원 가입 후 로그인 화면으로 이동 */
	@PostMapping(value = "/register")
	public String register(MemberVO member) {
		memberService.registerMember(member);
		
		return "redirect:/member/login";
	}
}
