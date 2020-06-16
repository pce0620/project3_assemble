package kr.co.assemble.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.assemble.dao.ComposedDAO;
import kr.co.assemble.dto.ComposedDTO;

@Controller
public class ComposedController {
	
	@Autowired
	ComposedDAO dao;
	
	
	//참여 폼
	@RequestMapping(value = "/attend")
	public String inviteMem() {
		return "composed/invite";
	}
	
	
	//속해있지않다면 참여가되고 속해있다면 나가기가됨
	@RequestMapping(value = "/attendOk")
	public String inviteMemOk(
			@RequestParam(value = "groupno") int groupno,
			@RequestParam(value = "memberno") int memberno, Model model) {
		
		ComposedDTO dto = new ComposedDTO();
		
		dto.setGroupno(groupno);
		dto.setMemberno(memberno);
		
		int n = dao.composedGroup(dto);
		
		System.out.println(n);
		
		if(n == 0) {
			dao.attendGroup(dto);			
		}else if(n == 1) {
			dao.deleteGroup(dto);
		}
		
		model.addAttribute("n", n);
		return "composed/inviteOk";
	}

	
	
	
	
	
}
