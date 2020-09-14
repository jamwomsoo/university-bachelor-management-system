package aais;

public class AttendVO {
	private String attendStuNum;
	private String attendCourseNum;
	private String attendProfNum;
	private int attendanceScore;
	private int midScore;
	private int finScore;
	private int etcScore;
	private int totalScore;
	private String grade;
	
	public AttendVO() {
		
	}
	
	public AttendVO(String attendStuNum, String attendCourseNum, String attendProfNum,
			int attendanceScore, int midScore, int finScore, int etcScore, int totalScore, String grade) {
		this.attendStuNum = attendStuNum;
		this.attendCourseNum = attendCourseNum;
		this.attendProfNum = attendProfNum;
		this.attendanceScore = attendanceScore;
		this.midScore = midScore;
		this.finScore = finScore;
		this.etcScore = etcScore;
		this.totalScore = totalScore;
		this.grade = grade;
	}
	
	public String getAttendStuNum() {
		return attendStuNum;
	}
	
	public String getAttendCourseNum() {
		return attendCourseNum;
	}
	
	public String getAttendProfNum() {
		return attendProfNum;
	}
	
	public int getAttendanceScore() {
		return attendanceScore;
	}
	
	public int getMidScore() {
		return midScore;
	}
	
	public int getFinScore() {
		return finScore;
	}
	
	public int getEtcScore() {
		return etcScore;
	}
	
	public int getTotalScore() {
		return totalScore;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public String toString() {
		return "Attend [attendStuNum= " + attendStuNum + ", attendCourseNum="+ attendCourseNum + ", attendProfNum=" + attendProfNum +
				", attendancescore=" + attendanceScore + ", midScore=" + midScore + ", finScore=" + finScore + ", etcScore=" + etcScore +
				", totalScore=" + totalScore + ", grade=" + grade + "]";
	}
}