package kr.co.assemble.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.assemble.dto.BookMarkDTO;

@Repository
public class BookMarkDAO {
	
	@Autowired
	SqlSession ss;

	public void setSs(SqlSession ss) {
		this.ss = ss;
	}
	
	//북마크에 존재하는지 확인
	public int existsMark(BookMarkDTO dto) {
		return ss.selectOne("existsMark", dto);
	}
	
	//북마크 하기
	public void bookmark(BookMarkDTO dto){
		ss.insert("bookmark", dto);
	}
	
	//북마크 삭제
	public void deleteMark(BookMarkDTO dto) {
		ss.delete("deleteMark", dto);
	}
	
}
