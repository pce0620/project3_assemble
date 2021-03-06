package kr.co.assemble.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.assemble.dto.CategoryDTO;

@Repository
public class CategoryDAOImple implements CategoryDAO {

	@Autowired
	private SqlSession ss;	
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}

	//카테고리 생성
	@Override
	public void insertCategory(CategoryDTO dto) {
		ss.insert("insertCategory", dto);
	}

	//전체 카테고리 조회
	@Override
	public List<CategoryDTO> selectCategory(CategoryDTO dto) {
		
		List<CategoryDTO> list = ss.selectList("categoryGroup", dto);
		
		return list;
	}

	//카테고리 이름변경
	@Override
	public void updateName(CategoryDTO dto) {
		ss.update("updateCategoryName", dto);
	}
	
	//내가 속한 카테고리 조회
	@Override
	public List<CategoryDTO> myCategory(CategoryDTO dto) {
		List<CategoryDTO> list = ss.selectList("myCategory", dto);
		return list;
	}
	

}
