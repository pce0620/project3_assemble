package kr.co.assemble.dto;

public class BookMarkDTO {
	private int bno;
	private int groupno;
	private int memberno;
	private int mark_memno;
	
	public BookMarkDTO() {}

	public BookMarkDTO(int bno, int groupno, int memberno, int mark_memno) {
		super();
		this.bno = bno;
		this.groupno = groupno;
		this.memberno = memberno;
		this.mark_memno = mark_memno;
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

	public int getMemberno() {
		return memberno;
	}

	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}

	public int getMark_memno() {
		return mark_memno;
	}

	public void setMark_memno(int mark_memno) {
		this.mark_memno = mark_memno;
	}

	
	
	
	
}
