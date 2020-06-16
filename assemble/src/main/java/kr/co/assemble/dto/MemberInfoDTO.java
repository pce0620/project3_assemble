package kr.co.assemble.dto;

public class MemberInfoDTO {
	private String memid;
	private String memname;
	
	public MemberInfoDTO() {}

	public MemberInfoDTO(String memid, String memname) {
		super();
		this.memid = memid;
		this.memname = memname;
	}

	public String getMemid() {
		return memid;
	}

	public void setMemid(String memid) {
		this.memid = memid;
	}

	public String getMemname() {
		return memname;
	}

	public void setMemname(String memname) {
		this.memname = memname;
	}
	
	
	
	
}
