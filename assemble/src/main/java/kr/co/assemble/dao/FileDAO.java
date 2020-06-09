package kr.co.assemble.dao;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.assemble.dto.FileDTO;

@Repository
public class FileDAO {
	
	@Autowired
	SqlSession ss;
	

	//파일 최신 번호 가져오기
	public int filenewly() {
		return ss.selectOne("filenoNewly");
	}
	
	//트리거로 추가된 파일의 업데이트
	public void updateFile(FileDTO dto) {
		ss.update("updateFile", dto);
	}
	
	public String fileName(int bno) {
		return ss.selectOne("selectfileOne", bno);
	}
	
}
