package kr.co.assemble.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.assemble.dao.CategoryDAO;
import kr.co.assemble.dto.CategoryDTO;

@Controller
public class CategoryController {
	
	@Autowired
	CategoryDAO cdao;
	
	public CategoryController(CategoryDAO cdao) {		
		this.cdao = cdao;
	}

	//카테고리 생성폼으로
	@RequestMapping(value = "/makeCategory")
	public String makeCategory() {		
		
		return "category/inputCategory";
	}
	
	
	//카테고리 생성 OK
	@RequestMapping(value = "/makeCategoryOk")
	public String makecategoryOk(
			@RequestParam(value = "cgName")String name, Model model) {
		
		CategoryDTO dto = new CategoryDTO();
		
		//멤버 넘버 세션에서 받아오기
		dto.setMemberno(2);
		dto.setCategoryname(name);
		
		
		cdao.insertCategory(dto);
		model.addAttribute("dto", dto);
		
		return "category/inputCategoryOk";
		
	}
	
	
	
	//카테고리 전체 조회
	@RequestMapping(value = "/categoryList")
	public String categoryList(Model model) {
		
		CategoryDTO dto = new CategoryDTO();
		dto.setAssemblename("abc");
		
		List<CategoryDTO> list = cdao.selectCategory(dto);
		model.addAttribute("list", list);
				
		return "category/categoryForm";
	}
	
	
	
	//카테고리 이름 변경
	@RequestMapping(value = "/changeCategoryName")
	public String changeName(
			@RequestParam(value = "categoryno") int categoryno,
			@RequestParam(value = "categoryname") String categoryname, Model model) {
		System.out.println(categoryno);
		System.out.println(categoryname);
		
		CategoryDTO dto = new CategoryDTO();
		dto.setCategoryno(categoryno);
		dto.setCategoryname(categoryname);
		
		cdao.updateName(dto);
		
		
		return "redirect:/categoryList";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
