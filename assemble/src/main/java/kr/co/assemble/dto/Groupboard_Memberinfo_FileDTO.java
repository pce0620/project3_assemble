package kr.co.assemble.dto;

public class Groupboard_Memberinfo_FileDTO {
	private int memberno;
	private String mi_memname;
	private String mi_memid;
	private int bno;
	private int groupno;
	private int categoryno;
	private String boarddate;
	private String boardcontents;
	private int boardlike;
	private int boardhate;
	private int requestboolean;
	private int boardnotice;
	private String fileName;
	private int reqstatus;
	
	public Groupboard_Memberinfo_FileDTO() {}

	public Groupboard_Memberinfo_FileDTO(int memberno, String mi_memname, String mi_memid, int bno, int groupno,
			int categoryno, String boarddate, String boardcontents, int boardlike, int boardhate, int requestboolean,
			int boardnotice, String fileName, int reqstatus) {
		super();
		this.memberno = memberno;
		this.mi_memname = mi_memname;
		this.mi_memid = mi_memid;
		this.bno = bno;
		this.groupno = groupno;
		this.categoryno = categoryno;
		this.boarddate = boarddate;
		this.boardcontents = boardcontents;
		this.boardlike = boardlike;
		this.boardhate = boardhate;
		this.requestboolean = requestboolean;
		this.boardnotice = boardnotice;
		this.fileName = fileName;
		this.reqstatus = reqstatus;
	}

	public int getMemberno() {
		return memberno;
	}

	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}

	public String getMi_memname() {
		return mi_memname;
	}

	public void setMi_memname(String mi_memname) {
		this.mi_memname = mi_memname;
	}

	public String getMi_memid() {
		return mi_memid;
	}

	public void setMi_memid(String mi_memid) {
		this.mi_memid = mi_memid;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public int getGroupno() {
		return groupno;
	}

	public void setGroupno(int groupno) {
		this.groupno = groupno;
	}

	public int getCategoryno() {
		return categoryno;
	}

	public void setCategoryno(int categoryno) {
		this.categoryno = categoryno;
	}

	public String getBoarddate() {
		return boarddate;
	}

	public void setBoarddate(String boarddate) {
		this.boarddate = boarddate;
	}

	public String getBoardcontents() {
		return boardcontents;
	}

	public void setBoardcontents(String boardcontents) {
		this.boardcontents = boardcontents;
	}

	public int getBoardlike() {
		return boardlike;
	}

	public void setBoardlike(int boardlike) {
		this.boardlike = boardlike;
	}

	public int getBoardhate() {
		return boardhate;
	}

	public void setBoardhate(int boardhate) {
		this.boardhate = boardhate;
	}

	public int getRequestboolean() {
		return requestboolean;
	}

	public void setRequestboolean(int requestboolean) {
		this.requestboolean = requestboolean;
	}

	public int getBoardnotice() {
		return boardnotice;
	}

	public void setBoardnotice(int boardnotice) {
		this.boardnotice = boardnotice;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public int getReqstatus() {
		return reqstatus;
	}

	public void setReqstatus(int reqstatus) {
		this.reqstatus = reqstatus;
	}
	
	
	
	
	
	
}
