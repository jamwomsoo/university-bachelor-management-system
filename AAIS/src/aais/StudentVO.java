package aais;

public class StudentVO{
   private String stuNum;
   private String chargeProfNum;
   private String stuAffDepNum;
   private String stuName;
   private String stuSSNum;
   private String stuAddress;
   private int stuPhoneNum;
   private String stuEmail;
   private int curGrade;
   private int curSem;
   
   public StudentVO() {
	   
   }
   
   public StudentVO(String stuNum, String chargeProfNum, String stuAffDepNum, String stuName,
		   String stuSSNum, String address, int phoneNum, String email, int curGrade, int curSem) {
	   super();
	   this.stuNum = stuNum;
	   this.chargeProfNum = chargeProfNum;
	   this.stuAffDepNum = stuAffDepNum;
	   this.stuName = stuName;
	   this.stuSSNum = stuSSNum;
	   this.stuAddress = address;
	   this.stuPhoneNum = phoneNum;
	   this.stuEmail = email;
	   this.curGrade = curGrade;
	   this.curSem = curSem;
   }
   
   public String getStuNum() {
	   return stuNum;
   }
   
   public String getChargeProfNum() {
	   return chargeProfNum;
   }
   
   public String getAffDepNum() {
	   return stuAffDepNum;
   }
   
   public String getStuName() {
	   return stuName;
   }
   
   public String getStuSSNum() {
	   return stuSSNum;
   }
   
   public String getStuAddress() {
	   return stuAddress;
   }
   
   public int getStuPhoneNum() {
	   return stuPhoneNum;
   }
   
   public String getStuEmail() {
	   return stuEmail;
   }
   
   public int getCurGrade() {
	   return curGrade;
   }
   
   public int getCurSem() {
	   return curSem;
   }
   
   @Override
   public String toString() {
	   return "Student [stuNum=" + stuNum + ", chargeProfNum=" + chargeProfNum + 
			   ", stuffDepNum=" + stuAffDepNum + ", stuName=" + stuName + ", stuSSNum=" + stuSSNum +
			   ", stuAddress=" + stuAddress + ", stuPhoneNum=" + stuPhoneNum + ", stuEmail=" + stuEmail +
			   ", curGrade=" + curGrade + ", curSem=" + curSem + "]";
   }
}