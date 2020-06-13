package kr.co.assemble.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.assemble.dto.ComposedDTO;

@Repository
public class ComposedDAO {
	
	@Autowired
	SqlSession ss;
	
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}
	
	//그룹에 속해있나 여부 판단
	public int composedGroup(ComposedDTO dto) {
		return ss.selectOne("existsGroup", dto);
	}
	
	//그룹참여
	public void attendGroup(ComposedDTO dto) {
		ss.insert("attend", dto);
	}
	
	//그룹에서 빠지기
	public void deleteGroup(ComposedDTO dto) {
		ss.delete("deleteComposed", dto);
	}

	
	
	
	
	
	
}
