package kr.co.assemble.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.assemble.dao.MyWriteDAO;
import kr.co.assemble.dto.MyWriteDTO;

@Controller
public class MyWriteController {
	
	@Autowired
	MyWriteDAO dao;
	
	@RequestMapping(value = "")
	public String myWrite(
			@RequestParam(value = "memberno") int memberno, Model model) {
		
		MyWriteDTO dto = new MyWriteDTO();
		dto.setMemberno(memberno);
		List<MyWriteDTO> list = dao.myWrite(dto);
		
		model.addAttribute("list", list);
		model.addAttribute("memberno", memberno);		
		
		return null;
	}
	
}
