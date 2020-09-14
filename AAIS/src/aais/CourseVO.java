package aais;

public class CourseVO {
	private String courseNum;
	private String courseChargeProfNum;
	private String progressDepNum;
	private String courseName;
	private float receivedCredits;
	private int courseTime;
	private String lecRoom;
	
	public CourseVO() {
		
	}
	
	public CourseVO(String courseNum, String courseChargeProfNum, String progressDepNum, String courseName
			, float receivedCredits, int courseTime, String lecRoom) {
		this.courseNum = courseNum;
		this.courseChargeProfNum = courseChargeProfNum;
		this.progressDepNum = progressDepNum;
		this.courseName = courseName;
		this.receivedCredits = receivedCredits;
		this.courseTime = courseTime;
		this.lecRoom = lecRoom;
	}
	
	public String getCourseNum() {
		return courseNum;
	}
	
	public String getcourseChargeProfNum() {
		return courseChargeProfNum;
	}
	
	public String getProgressDepNum() {
		return progressDepNum;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public float getReceivedCredits() {
		return receivedCredits;
	}
	
	public int getCourseTime() {
		return courseTime;
	}
	
	public String getLecRoom() {
		return lecRoom;
	}
	
	public String toString() {
		return "Course [courseNum= " + courseNum + ", courseChargeProfNum=" + courseChargeProfNum + ", progressDepNum=" + progressDepNum +
				", courseName=" + courseName + ", receivedCredits=" + receivedCredits + ", courseTime=" + courseTime + ", lecRoom=" + lecRoom + "[";
	}
}
