package kr.co.assemble.dto;

public class AssembleGroupDTO {
	private String assemblename;
	private String groupname;
	private int groupno;
	private int categoryno;
	
	public AssembleGroupDTO() {}

	public AssembleGroupDTO(String assemblename, String groupname, int groupno, int categoryno) {
		super();
		this.assemblename = assemblename;
		this.groupname = groupname;
		this.groupno = groupno;
		this.categoryno = categoryno;
	}

	public String getAssemblename() {
		return assemblename;
	}

	public void setAssemblename(String assemblename) {
		this.assemblename = assemblename;
	}

	public String getGroupname() {
		return groupname;
	}

	public void setGroupname(String groupname) {
		this.groupname = groupname;
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

	
	

	
}
