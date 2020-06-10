package kr.co.assemble.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.assemble.dao.BoardDAO;
import kr.co.assemble.dto.BoardDTO;
import kr.co.assemble.dto.Groupboard_Memberinfo_FileDTO;

@Controller
public class BoardController {


	@Autowired
	BoardDAO dao;

	public void setDao(BoardDAO dao) {
		this.dao = dao;
	}


	//글쓰기 폼
	@RequestMapping(value = "/write")
	public String writeForm() {
		return "board/write";
	}
	
	
	//글쓰기 완료 페이지
	@RequestMapping(value = "/writeOk")
	public String writeOk(
			@RequestParam(value = "grNum") int grNum,
			@RequestParam(value = "cgNum") int cgNum,
			@RequestParam(value = "memNum") int memNum,
			@RequestParam(value = "contents") String contents,
			@RequestParam(value = "fileStatus") int status, Model model) {
		
		BoardDTO dto = new BoardDTO();
		
		dto.setGroupno(grNum);
		dto.setCategoryno(cgNum);
		dto.setMemberno(memNum);
		dto.setBoardcontents(contents);
		dto.setFilestatus(status);
		dao.write(dto);
		
		System.out.println("not file : " + status);
		
		model.addAttribute("contents", contents);
		
		return "board/wall";
	}
	
	
	//그룹별 게시글 조회
	@RequestMapping(value = "/wall")
	public String boardlist(
			@RequestParam(value = "groupno") int groupno, Model model){
		
		List<Groupboard_Memberinfo_FileDTO>list = dao.boardlist(groupno);
			
		model.addAttribute("list", list);
		
		return "board/wall";
	}
	
	
	//게시글 수정을 위한 bno로 해당 게시글 정보 조회
	@RequestMapping(value = "/selectBoard")
	public String selectbno(
			@RequestParam(value = "bno") int bno, Model model) {
		System.out.println(bno);
		
		List<BoardDTO> list = dao.selectOne(bno);
		model.addAttribute("list", list);
		
		return "board/modify";
	}
	
	
	//게시글 수정
	@RequestMapping(value = "/modify")
	public String modifyBoard(
			@RequestParam(value = "bno") int bno,
			@RequestParam(value = "contents") String contents,
			@RequestParam(value = "groupno") int groupno, Model model) {
		
		BoardDTO dto = new BoardDTO();
		dto.setBno(bno);
		dto.setBoardcontents(contents);
		
		dao.updateBoard(dto);

				
		model.addAttribute("dto", dto);
		model.addAttribute("groupno", groupno);
		
		return "redirect:/wall";
	}
	
	
	//게시글 삭제 - 파일이랑 연결되있으면 파일에도 bno넘겨서 삭제(트리거 걸어놓음)
	@RequestMapping(value = "/deleteBoard")
	public String deleteBoard(
			@RequestParam(value = "bno") int bno,
			@RequestParam(value = "groupno") int groupno, Model model) {
		
		dao.deleteBoard(bno);
		model.addAttribute("groupno", groupno);
		
		return "redirect:/wall";
	}
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//내가 속한 그룹의 전체 게시글 출력
	@RequestMapping(value = "/myfeed")
	public String selectMyGroup(
			@RequestParam(value = "memberno") int memberno, Model model) {
		
		//멤버 넘버 세션에서 받아오기.
		List<BoardDTO> list = dao.selectMyFeed(memberno);
		model.addAttribute("list", list);
		
		return "board/myFeed";
	}

	
	
	
	
	
	
	
}