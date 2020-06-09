package kr.co.assemble.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.assemble.dao.RecommentDAO;
import kr.co.assemble.dto.RecommentDTO;

@Controller
public class RecommentController {

	@Autowired
	RecommentDAO dao;

	public RecommentDAO getDao() {
		return dao;
	}
	
	@RequestMapping(value = "/insertComment")
	public String reco(
			@RequestParam(value = "bno") int bno,
			@RequestParam(value = "groupno") int groupno,
			@RequestParam(value = "categoryno") int categoryno,
			@RequestParam(value = "contents") String contents,
			@RequestParam(value = "memberno") int memberno, Model model) {
		
		RecommentDTO dto = new RecommentDTO();
		dto.setBno(bno);
		dto.setGroupno(groupno);
		dto.setCategoryno(categoryno);
		dto.setRecontents(contents);
		dto.setMemberno(memberno);
		
		//멤버세션으로 id 조회해서 댓글작성자에 현재 세션의 id 집어넣기
		dto.setReid("1234");
		
		dao.insertComment(dto);
		model.addAttribute("dto", dto);
		
		return "recomment/recomment";
	}
	
	
}
