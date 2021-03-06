package kr.co.assemble.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.assemble.dto.BoardDTO;
import kr.co.assemble.dto.Groupboard_Memberinfo_FileDTO;

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

	//글 수정
	@Override
	public void updateBoard(BoardDTO dto) {
		ss.update("updateBoard", dto);
	}
	
	//bno로 전체조회
	@Override
	public List<BoardDTO> selectOne(int bno) {
		
		List<BoardDTO> list = ss.selectList("selectOneBno", bno);
		
		return list;
	}
	
	//myfeed 조회 (내가 속한 모든 그룹의 글 가져오기)
	@Override
	public List<BoardDTO> selectMyFeed(int memberno) {
		
		List<BoardDTO> list = ss.selectList("myGroupBoard", memberno);
		
		return list;
	}

	//글삭제
	@Override
	public void deleteBoard(int bno) {
		ss.delete("deleteBoard", bno);
	}
	
	
	// 그룹별 글 출력
	@Override
	public List<Groupboard_Memberinfo_FileDTO> boardlist(int groupno) {
		
		List<Groupboard_Memberinfo_FileDTO> list = ss.selectList("selectGroupBoard", groupno);

		return list;
	}

	//요청 글쓰기
	@Override
	public void insertRequest(BoardDTO dto) {
		ss.insert("insertRequest", dto);
	}

	
	
	//////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	//공지사항 등록, 취소
	@Override
	public void updateNotice(BoardDTO dto) {
		ss.update("updateNotice", dto);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
