package kr.co.assemble.dao;

import java.util.List;

import kr.co.assemble.dto.CategoryDTO;

public interface CategoryDAO {
	// 카테고리'만' 생성 - 그룹번호는 0으로 입력
	public void insertCategory(CategoryDTO dto);

	//전체 카테고리 조회
	public List<CategoryDTO> selectCategory(CategoryDTO dto);
	
	//카테고리 이름 변경
	public void updateName(CategoryDTO dto);
	
	//내가 속한 어셈블에 내가 속한 카테고리만 출력
	public List<CategoryDTO> myCategory(CategoryDTO dto);
	
}
