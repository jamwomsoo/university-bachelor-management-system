package aais;

public class DepartmentVO {
	private String depNum;
	private String depName;
	private int depPhoneNum;
	
	public DepartmentVO() {
		
	}
	
	public DepartmentVO(String depNum, String depName, int depPhoneNum) {
		super();
		this.depNum = depNum;
		this.depName = depName;
		this. depPhoneNum = depPhoneNum;
	}
	
	public String getDepNum() {
		return depNum;
	}
	
	public String getDepName() {
		return depName;
	}
	
	public int getDepPhoneNum() {
		return depPhoneNum;
	}
	
	@Override
	public String toString() {
		return "Department [depNum=" + depNum + ", depName=" + depName + ", depPhoneNum=" + depPhoneNum + "]";
	}
}
