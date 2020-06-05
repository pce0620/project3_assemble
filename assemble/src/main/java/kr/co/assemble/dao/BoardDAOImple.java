package kr.co.assemble.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.assemble.dto.BoardDTO;

@Repository
public class BoardDAOImple implements BoardDAO{

	@Autowired
	private SqlSession ss;
	
	
	public void setSs(SqlSession ss) {
		this.ss = ss;
	}
	

	//글쓰기
	@Override
	public void write(BoardDTO dto) {
		ss.insert("writeBoard", dto);
	}
	
	//그룹별 전체조회
	@Override
	public List<BoardDTO> boardlist(int groupno) {
		
		List<BoardDTO> list = ss.selectList("selectGroupBoard", groupno);
		
		return list;
	}

	//글 수정
	@Override
	public void updateBoard(BoardDTO dto) {
		ss.update("updateBoard", dto);
	}
	
	//bno로 전체조회
	@Override
	public List<BoardDTO> selectOne(int bno) {
		
		List<BoardDTO> list = ss.selectOne("selectOneBno", bno);
		
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
}
