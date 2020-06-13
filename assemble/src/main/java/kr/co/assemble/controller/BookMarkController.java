package kr.co.assemble.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.assemble.dao.BookMarkDAO;
import kr.co.assemble.dto.BookMarkDTO;

@Controller
public class BookMarkController {
	@Autowired
	BookMarkDAO dao;

	
	public void setDao(BookMarkDAO dao) {
		this.dao = dao;
	}
	
	
	@RequestMapping(value = "/bookMark")
	public String bookMark(
			@RequestParam(value = "bno") int bno,
			@RequestParam(value = "groupno") int groupno,
			@RequestParam(value = "memberno") int memberno, Model model) {
		
		
		BookMarkDTO dto = new BookMarkDTO();
		dto.setBno(bno);
		dto.setGroupno(groupno);
		dto.setMemberno(memberno);
		
		//현재 세션의 멤버넘버
		dto.setMark_memno(1);
		
		//북마크 테이블에 존재하는지 확인
		int n = dao.existsMark(dto);
		
		if(n==0) {
			//존재하지 않는 데이터면 입력
			dao.bookmark(dto);
		}else if(n==1) {
			//존재하는 데이터면 삭제
			dao.deleteMark(dto);
		}
		
		
		model.addAttribute("groupno", groupno);
		
		return "redirect:/wall";		
	}
	
	
	
	
	
	
	
}
