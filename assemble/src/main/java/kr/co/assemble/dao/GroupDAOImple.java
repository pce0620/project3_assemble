package kr.co.assemble.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.assemble.dto.AssembleGroupDTO;
import kr.co.assemble.dto.GroupDTO;

@Repository
public class GroupDAOImple implements GroupDAO{
	
	@Autowired
	SqlSession ss;
	
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}

	//그룹 생성 - 생성과 동시에 무조건 미분류그룹(카테고리1번)으로 들어감
	@Override
	public void insertGroup(GroupDTO dto) {
		ss.insert("insertGroup", dto);
	}

	//그룹 카테고리 변경
	@Override
	public void updateOne(GroupDTO dto) {
		ss.update("updateGroupCategory", dto);
	}
	
	//그룹 이름변경
	@Override
	public void updateName(GroupDTO dto) {
		ss.update("updateGroupName", dto);		
	}

	//그룹번호 전체 조회
	@Override
	public List<AssembleGroupDTO> selectGroup() {
		return ss.selectList("selectAllGroup");
	}

	//카테고리별 그룹조회
	@Override
	public List<GroupDTO> grouplist(int categoryno) {
		return ss.selectList("selectCategoryGroup", categoryno);
	}
	
	
	
	
	
}
