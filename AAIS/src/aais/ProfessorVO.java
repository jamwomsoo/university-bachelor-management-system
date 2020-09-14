package aais;

public class ProfessorVO{
	private String profNum;
	private String profAffDepNum;
	private String profName;
	private String profSSNum;
	private String profAddress;
	private int profPhoneNum;
	private String profEmail;
	
	public ProfessorVO() {
		
	}
	
	public ProfessorVO(String profNum, String profAffDepNum, String profName, String profSSNum,
			String profAddress, int profPhoneNum, String profEmail) {
		super();
		this.profNum = profNum;
		this.profAffDepNum = profAffDepNum;
		this.profName = profName;
		this.profSSNum = profSSNum;
		this.profAddress = profAddress;
		this.profPhoneNum = profPhoneNum;
		this.profEmail = profEmail;
	}
	
	public String getProfNum() {
		return profNum;
	}
	
	public String getProfAffDepNum() {
		return profAffDepNum;
	}
	
	public String getProfName() {
		return profName;
	}
	
	public String getProfSSNum() {
		return profSSNum;
	}
	
	public String getProfAddress() {
		return profAddress;
	}
	
	public int getProfPhoneNum() {
		return profPhoneNum;
	}
	
	public String getProfEmail() {
		return profEmail;
	}
	
	@Override
	public String toString() {
		return "Professor [profNum=" + profNum + ", profAffDepNum=" + profAffDepNum + ", profName=" + profName +
				", profSSNum" + profSSNum + ", profAddress=" + profAddress + ", profPhoneNum=" + profPhoneNum + ", profEmail=" + profEmail + "]";
	}
}
