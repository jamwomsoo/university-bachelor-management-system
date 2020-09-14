package aais;

import java.sql.*;
import java.util.*;

public class DatabaseConnect {
	private Connection conn = null;
	private PreparedStatement pstmt;

	private static final String USERNAME = "s15010938";
	private static final String PASSWORD = "kss1218";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:ORCL";

	public DatabaseConnect() {
		/*
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			System.out.println("DB Connection OK!");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("DB Driver Error!");
		}catch(SQLException se) {
			se.printStackTrace();
			System.out.println("DB Connection Error!");
			
		}
		*/	
	}
	
	public ArrayList<StudentVO> selectStudent(String condition) {
		String sql = "select * from Student ";
		sql+=condition;
		pstmt = null;
		ArrayList<StudentVO> arrStudentVO = new ArrayList<StudentVO>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				StudentVO tempStudentVO = new StudentVO(
						 rs.getString("stuNum"),
						 rs.getString("chargeProfNum"),
						 rs.getString("stuAffDepNum"),
						 rs.getString("stuName"),
						 rs.getString("stuSSNum"),
						 rs.getString("stuAddress"),
						 rs.getInt("stuPhoneNum"),
						 rs.getString("stuEmail"),
						 rs.getInt("curGrade"),
						 rs.getInt("curSem"));
				arrStudentVO.add(tempStudentVO);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return arrStudentVO;
	}
	
	public ArrayList<ProfessorVO> selectProfessor(String condition) {
		String sql = "select * from Professor ";
		sql+=condition;
		pstmt = null;
		ArrayList<ProfessorVO> arrProfessorVO = new ArrayList<ProfessorVO>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				ProfessorVO tempProfessorVO = new ProfessorVO(
						 rs.getString("profNum"),
						 rs.getString("profAffDepNum"),
						 rs.getString("profName"),
						 rs.getString("profSSNum"),
						 rs.getString("profAddress"),
						 rs.getInt("profPhoneNum"),
						 rs.getString("profEmail"));
				arrProfessorVO.add(tempProfessorVO);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return arrProfessorVO;
	}
	
	public ArrayList<CourseVO> selectCourse(String condition) {
		String sql = "select * from Course ";
		sql+=condition;
		pstmt = null;
		ArrayList<CourseVO> arrCourseVO = new ArrayList<CourseVO>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				CourseVO tempCourseVO = new CourseVO(
						 rs.getString("courseNum"),
						 rs.getString("courseChargeProfNum"),
						 rs.getString("progressDepNum"),
						 rs.getString("courseName"),
						 rs.getFloat("receivedCredits"),
						 rs.getInt("courseTime"),
						 rs.getString("lecRoom"));
				arrCourseVO.add(tempCourseVO);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return arrCourseVO;
	}
	
	public ArrayList<DepartmentVO> selectDepartment(String condition) {
		String sql = "select * from Department ";
		sql+=condition;
		pstmt = null;
		ArrayList<DepartmentVO> arrDepartmentVO = new ArrayList<DepartmentVO>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				DepartmentVO tempDepartmentVO = new DepartmentVO(
						 rs.getString("depNum"),
						 rs.getString("depName"),
						 rs.getInt("depPhoneNum"));
				arrDepartmentVO.add(tempDepartmentVO);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return arrDepartmentVO;
	}
	
	public ArrayList<AttendVO> selectAttend(String condition) {
		String sql = "select * from Attend ";
		sql+=condition;
		pstmt = null;
		ArrayList<AttendVO> arrAttendVO = new ArrayList<AttendVO>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				AttendVO tempAttendVO = new AttendVO(
						 rs.getString("attendStuNum"),
						 rs.getString("attendCourseNum"),
						 rs.getString("attendProfNum"),
						 rs.getInt("attendanceScore"),
						 rs.getInt("midScore"),
						 rs.getInt("finScore"),
						 rs.getInt("etcScore"),
						 rs.getInt("totalScore"),
						 rs.getString("grade"));
				arrAttendVO.add(tempAttendVO);
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return arrAttendVO;
	}
	
	public ArrayList<DescribeTableVO> getTableDescription(String tableName) {
		String sql = "select COLUMN_NAME from COLS where table_name=?";
		pstmt = null;
		ArrayList<DescribeTableVO> arrDescribeTableVO = new ArrayList<DescribeTableVO>();
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, tableName.toUpperCase());
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("getTableDescription");
				System.out.println(rs.getString("COLUMN_NAME"));
				DescribeTableVO tempDescribeTableVO = new DescribeTableVO(rs.getString("COLUMN_NAME"));
				arrDescribeTableVO.add(tempDescribeTableVO);
			}
	
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		return arrDescribeTableVO;
	}

	
	
	
	/**********************************************insert from tables********************************************************/
	
	public void insertStudent(String stuNum, String chargeProfNum, String stuAffDepNum, String stuName,
			   String stuSSNum, String stuAddress, int stuPhoneNum, String stuEmail, int curGrade, int curSem) {
		String sql = "insert into Student values (?,?,?,?,?,?,?,?,?,?)";
		pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, stuNum);
			pstmt.setString(2, chargeProfNum);
			pstmt.setString(3, stuAffDepNum);
			pstmt.setString(4, stuName);
			pstmt.setString(5, stuSSNum);
			pstmt.setString(6, stuAddress);
			pstmt.setInt(7, stuPhoneNum);
			pstmt.setString(8, stuEmail);
			pstmt.setInt(9, curGrade);
			pstmt.setInt(10, curSem);
			pstmt.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void insertProfessor(String profNum, String profAffDepNum, String profName, String profSSNum,
			String profAddress, int profPhoneNum, String profEmail) {
		String sql = "insert into Professor values (?,?,?,?,?,?,?)";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, profNum);
			pstmt.setString(2, profAffDepNum);
			pstmt.setString(3, profName);
			pstmt.setString(4, profSSNum);
			pstmt.setString(5, profAddress);
			pstmt.setInt(6, profPhoneNum);
			pstmt.setString(7, profEmail);
			pstmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void insertCourse(String courseNum, String courseChargeProfNum, String progressDepNum, String courseName
			, float receivedCredits, int courseTime, String lecRoom) {
		String sql = "insert into Course values (?,?,?,?,?,?,?)";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, courseNum);
			pstmt.setString(2, courseChargeProfNum);
			pstmt.setString(3, progressDepNum);
			pstmt.setString(4, courseName);
			pstmt.setFloat(5, receivedCredits);
			pstmt.setInt(6, courseTime);
			pstmt.setString(7, lecRoom);
			pstmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void insertDepartment(String depNum, String depName, int depPhoneNum) {
		String sql = "insert into Department values (?,?,?)";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, depNum);
			pstmt.setString(2, depName);
			pstmt.setInt(3, depPhoneNum);
			pstmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void insertAttend(String attendStuNum, String attendCourseNum, String attendProfNum,
			int attendanceScore, int midScore, int finScore, int etcScore, int totalScore, String grade) {
		String sql = "insert into Attend values (?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, attendStuNum);
			pstmt.setString(2, attendCourseNum);
			pstmt.setString(3, attendProfNum);
			pstmt.setInt(4, attendanceScore);
			pstmt.setInt(5, midScore);
			pstmt.setInt(6, finScore);
			pstmt.setInt(7, etcScore);
			pstmt.setInt(8, totalScore);
			pstmt.setString(9, grade);
			pstmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	/**********************************************delete from tables*****************************************************/
	
	public void deleteStudent(String stuNum) {
		String sql = "delete from Student where stuNum = ?";
		pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, stuNum);
			pstmt.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void deleteProfessor(String ProfNum) {
		String sql = "delete from Professor where profNum = ?";
		pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ProfNum);
			pstmt.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void deleteCourse(String courseNum, String courseChargeProfNum) {
		String sql = "delete from Student where courseNum = ? and courseChargeProfNum = ?";
		pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,  courseNum);
			pstmt.setString(2,  courseChargeProfNum);
			pstmt.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void deleteDepartment(String DepNum) {
		String sql = "delete from Department where DepNum = ?";
		pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, DepNum);
			pstmt.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void deleteAttend(String attendStuNum, String attendCourseNum, String attendProfNum) {
		String sql = "delete from Attend where attendStuNum = ? and attendCourseNum = ? and attendProfNum = ?";
		pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, attendStuNum);
			pstmt.setString(2, attendCourseNum);
			pstmt.setString(3, attendProfNum);
			pstmt.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	/********************************************************UPDATE TABLES***************************************************/
	
	public void updateStudent(String stuNum, String chargeProfNum, String stuAffDepNum, String stuName,
			   String stuSSNum, String stuAddress, int stuPhoneNum, String stuEmail, int curGrade, int curSem) {
		String sql = "Update Student set chargeProfNum = ? and stuAffDepNum = ? and stuName = ? and stuSSNum = ? and stuAddress = ? and stuPhoneNum = ? and stuEmail = ? and curGrade = ? and curSem = ? where stuNum = ?";
		pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, chargeProfNum);
			pstmt.setString(2, stuAffDepNum);
			pstmt.setString(3, stuName);
			pstmt.setString(4, stuSSNum);
			pstmt.setString(5, stuAddress);
			pstmt.setInt(6, stuPhoneNum);
			pstmt.setString(7, stuEmail);
			pstmt.setInt(8, curGrade);
			pstmt.setInt(9, curSem);
			pstmt.setString(10, stuNum);
			pstmt.executeUpdate();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void updateProfessor(String profNum, String profAffDepNum, String profName, String profSSNum,
			String profAddress, int profPhoneNum, String profEmail) {
		String sql = "Update Professor set profAffDepNum = ? and profName = ? and profSSNum = ? and profAddress = ? and profPhoneNum = ? and profEmail = ? where profNum = ?";
				 
		pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, profAffDepNum);
			pstmt.setString(2, profName);
			pstmt.setString(3, profSSNum);
			pstmt.setString(4, profAddress);
			pstmt.setInt(5, profPhoneNum);
			pstmt.setString(6, profEmail);
			pstmt.setString(7, profNum);
			pstmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void updateCourse(String courseNum, String courseChargeProfNum, String progressDepNum, String courseName
			, float receivedCredits, int courseTime, String lecRoom) {
		String sql = "Update Course set courseChargeProfNum = ? and progressDepNum = ? and courseName = ? and receivedCredits = ? and courseTime = ? and lecRoom = ? where courseNum = ? and courseChargeProfNum = ?";
		pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, progressDepNum);
			pstmt.setString(2, courseName);
			pstmt.setFloat(3, receivedCredits);
			pstmt.setInt(4, courseTime);
			pstmt.setString(5, lecRoom);
			pstmt.setString(6, courseNum);
			pstmt.setString(7, courseChargeProfNum);
			pstmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void updateDepartment(String depNum, String depName, int depPhoneNum) {
		String sql = "Update Department set depName = ? and depPhoneNum = ? where depNum = ?";
		pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, depName);
			pstmt.setInt(2, depPhoneNum);
			pstmt.setString(3, depNum);
			pstmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void updateAttend(String attendStuNum, String attendCourseNum, String attendProfNum,
			int attendanceScore, int midScore, int finScore, int etcScore, int totalScore, String grade) {
		String sql = "Update Attend set attendanceScore = ? and midScore = ? and finScore = ? and etcScore = ? and totalScore = ? and grade = ?";
		pstmt = null;

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, attendanceScore);
			pstmt.setInt(2, midScore);
			pstmt.setInt(3, finScore);
			pstmt.setInt(4, etcScore);
			pstmt.setInt(5, totalScore);
			pstmt.setString(6, grade);
			pstmt.setString(7, attendStuNum);
			pstmt.setString(8, attendCourseNum);
			pstmt.setString(9, attendProfNum);
			pstmt.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/*********************************************************************************************************/
	
	
	
	/*********************************************Initialize DateBase NEW****************************************/
	public void initDB() {
		String sql1 = "drop table student";
		String sql2 = "drop table professor";
		String sql3 = "drop table course";
		String sql4 = "drop table department";
		String sql5 = "drop table attend";
		pstmt = null;
		
		try {
			pstmt = conn.prepareStatement(sql1);
			pstmt.executeUpdate();
			pstmt = conn.prepareStatement(sql2);
			pstmt.executeUpdate();
			pstmt = conn.prepareStatement(sql3);
			pstmt.executeUpdate();
			pstmt = conn.prepareStatement(sql4);
			pstmt.executeUpdate();
			pstmt = conn.prepareStatement(sql5);
			pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed())
					pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	/*******************************************************************************************/
}