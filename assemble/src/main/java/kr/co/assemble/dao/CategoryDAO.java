package kr.co.assemble.dao;

import java.util.List;

import kr.co.assemble.dto.CategoryComposedDTO;
import kr.co.assemble.dto.CategoryDTO;

public interface CategoryDAO {
	// 카테고리'만' 생성 - 그룹번호는 0으로 입력
	public void insertCategory(CategoryDTO dto);

	//전체 카테고리 조회
	public List<CategoryComposedDTO> selectCategory(CategoryComposedDTO dto);
	
	//카테고리 이름 변경
	public void updateName(CategoryDTO dto);
	
	
}
