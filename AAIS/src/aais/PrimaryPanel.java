package aais;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.*;

public class PrimaryPanel extends JPanel {

	private JPanel mainPanel;
	private JPanel tempPanel;
	private JComboBox<String> cmbMenu;
	private String[] strMenu = { "STUDENT", "PROFESSOR", "COURSE", "DEPARTMENT", "ATTEND"};
	private JButton btnSearch;
	/***************NEW***************/
	private JButton btnInit;
	private JButton btnExit;
	/*********************************/
	private JScrollPane jScrollPane;
	private JTable jTable;
	
	JTextField txtStuWhere;
	JTextField txtStuNum;
	JTextField txtStuNumD;
	JTextField txtChargeProfNum;
	JTextField txtStuAffDepNum;
	JTextField txtStuName;
	JTextField txtStuSSNum;
	JTextField txtStuAddress;
	JTextField txtStuPhoneNum;
	JTextField txtStuEmail;
	JTextField txtCurGrade;
	JTextField txtCurSem;
	
	JTextField txtProfWhere;
	JTextField txtProfNum;
	JTextField txtProfNumD;
	JTextField txtProfAffDepNum;
	JTextField txtProfName;
	JTextField txtProfSSNum;
	JTextField txtProfAddress;
	JTextField txtProfPhoneNum;
	JTextField txtProfEmail;
	
	JTextField txtCourseWhere;
	JTextField txtCourseNum;
	JTextField txtCourseChargeProfNum;
	JTextField txtCourseNumD;
	JTextField txtCourseChargeProfNumD;
	JTextField txtProgressDepNum;
	JTextField txtCourseName;
	JTextField txtReceivedCredits;
	JTextField txtCourseTime;
	JTextField txtLecRoom;
	
	JTextField txtDepWhere;
	JTextField txtDepNum;
	JTextField txtDepNumD;
	JTextField txtDepName;
	JTextField txtDepPhoneNum;
	
	JTextField txtAttendWhere;
	JTextField txtAttendStuNum;
	JTextField txtAttendCourseNum;
	JTextField txtAttendProfNum;
	JTextField txtAttendStuNumD;
	JTextField txtAttendCourseNumD;
	JTextField txtAttendProfNumD;
	JTextField txtAttendanceScore;
	JTextField txtMidScore;
	JTextField txtFinScore;
	JTextField txtEtcScore;
	JTextField txtTotalScore;
	JTextField txtGrade;
	

	private BtnListener btnL;

	private DatabaseConnect dbConnect;

	public PrimaryPanel() {
		// db connect
		dbConnect = new DatabaseConnect();

		// Listener
		btnL = new BtnListener();

		// primary panel
		setBackground(Color.white);
		/****CHANGED*****/
		setPreferredSize(new Dimension(1500, 750));
		/****************/
		setLayout(null);

		setPage();
	}

	public void setPage() {

		mainPanel = new JPanel();
		/******CHANGED*********/
		mainPanel.setBounds(50, 80, 1400, 650);
		/**********************/
		mainPanel.setBackground(new Color(245, 245, 245));
		mainPanel.setLayout(null);

		// combo box for choosing table
		cmbMenu = new JComboBox<String>();
		for (String str : strMenu)
			cmbMenu.addItem(str);
		/*********CHANGED*******/
		cmbMenu.setBounds(105, 30, 170, 40);
		/***********************/
		cmbMenu.setFont(new Font("Verdana", Font.PLAIN, 18));
		add(cmbMenu);

		btnSearch = new JButton("Search");
		/*********CHANGED*******/
		btnSearch.setBounds(285, 30, 80, 40);
		/***********************/
		btnSearch.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnSearch.addActionListener(btnL);
		add(btnSearch);
		
		/**************NEW*****************/
		btnInit = new JButton("Initialize");
		btnInit.setBounds(1250, 30, 90, 40);
		btnInit.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnInit.addActionListener(btnL);
		add(btnInit);
		
		
		btnExit = new JButton("Exit");
		btnExit.setBounds(1350, 30, 80, 40);
		btnExit.setFont(new Font("Verdana", Font.PLAIN, 13));
		btnExit.addActionListener(btnL);
		add(btnExit);
		
		/**********************************/

		add(mainPanel);
		setVisible(true);	
	}

	private JPanel getStudentTable(String condition) {
		JPanel jPanel = new JPanel();
		jPanel.setBounds(0, 0, 1400, 650);
		jPanel.setBackground(new Color(245, 245, 245));
		jPanel.setLayout(null);
		
		
		/**************************************************INSERT Student***********************************************/
		JLabel lbInsert = new JLabel("INSERT");
		lbInsert.setBounds(80,20,100,40);
		lbInsert.setFont(new Font("Verdana", Font.PLAIN,17));
		jPanel.add(lbInsert);
		
//		StuNum
		JLabel lbStuNum = new JLabel("StuNum");
		lbStuNum.setBounds(80,60,100,40);
		lbStuNum.setFont(new Font("Verdana" ,Font.PLAIN,15));
		jPanel.add(lbStuNum);
		
		txtStuNum = new JTextField();
		txtStuNum.setBounds(80,90,80,30);
		jPanel.add(txtStuNum);
		
//		ChargeProfNum
		JLabel lbChargeProfNum = new JLabel("ChargeProfNum");
		lbChargeProfNum.setBounds(180,60,150,40);
		lbChargeProfNum.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbChargeProfNum);
		
		txtChargeProfNum = new JTextField();
		txtChargeProfNum.setBounds(180,90,80,30);
		jPanel.add(txtChargeProfNum);
		
//		StuAffDepNum
		JLabel lbStuAffDepNum = new JLabel("StuAffDepNum");
		lbStuAffDepNum.setBounds(320,60,150,40);
		lbStuAffDepNum.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbStuAffDepNum);
		
		txtStuAffDepNum = new JTextField();
		txtStuAffDepNum.setBounds(320,90,80,30);
		jPanel.add(txtStuAffDepNum);
		
//		StuName
		JLabel lbStuName = new JLabel("StuName");
		lbStuName.setBounds(460,60,150,40);
		lbStuName.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbStuName);
		
		txtStuName = new JTextField();
		txtStuName.setBounds(460,90,80,30);
		jPanel.add(txtStuName);
		
//		StuSSNum
		JLabel lbStuSSNum = new JLabel("StuSSNum");
		lbStuSSNum.setBounds(560,60,100,40);
		lbStuSSNum.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbStuSSNum);
		
		txtStuSSNum = new JTextField();
		txtStuSSNum.setBounds(560,90,80,30);
		jPanel.add(txtStuSSNum);
		
//		StuAddress
		JLabel lbStuAddress = new JLabel("StuAddress");
		lbStuAddress.setBounds(660,60,100,40);
		lbStuAddress.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbStuAddress);
		
		txtStuAddress = new JTextField();
		txtStuAddress.setBounds(660,90,80,30);
		jPanel.add(txtStuAddress);
		
//		StuPhoneNum
		JLabel lbStuPhoneNum = new JLabel("StuPhoneNum");
		lbStuPhoneNum.setBounds(760,60,150,40);
		lbStuPhoneNum.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbStuPhoneNum);
		
		txtStuPhoneNum = new JTextField();
		txtStuPhoneNum.setBounds(760,90,80,30);
		jPanel.add(txtStuPhoneNum);
		
//		StuEmail
		JLabel lbStuEmail = new JLabel("StuEmail");
		lbStuEmail.setBounds(900,60,100,40);
		lbStuEmail.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbStuEmail);
		
		txtStuEmail = new JTextField();
		txtStuEmail.setBounds(900,90,80,30);
		jPanel.add(txtStuEmail);
		
//		CurGrade
		JLabel lbCurGrade = new JLabel("CurGrade");
		lbCurGrade.setBounds(1000,60,100,40);
		lbCurGrade.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbCurGrade);
		
		txtCurGrade = new JTextField();
		txtCurGrade.setBounds(1000,90,80,30);
		jPanel.add(txtCurGrade);
		
//		CurSem
		JLabel lbCurSem = new JLabel("CurSem");
		lbCurSem.setBounds(1100,60,100,40);
		lbCurSem.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbCurSem);
		
		txtCurSem = new JTextField();
		txtCurSem.setBounds(1100,90,80,30);
		jPanel.add(txtCurSem);
		
//		btnInsert
		JButton btnInsert = new JButton("Insert");
		btnInsert.setBounds(350, 130, 80, 35);
		btnInsert.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnInsert.addActionListener(btnL);
		jPanel.add(btnInsert);
		
//		btnUpdate
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(700, 130, 90, 35);
		btnUpdate.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnUpdate.addActionListener(btnL);
		jPanel.add(btnUpdate);
		
		
		
		
		
		
		
		/**************************************Delete Student*************************************/
		JLabel lbDelete = new JLabel("DELETE");
		lbDelete.setBounds(80,180,100,40);
		lbDelete.setFont(new Font("Verdana", Font.PLAIN,17));
		jPanel.add(lbDelete);
		
//		StuNum
		JLabel lbStuNumD = new JLabel("StuNum");
		lbStuNumD.setBounds(80,220,100,40);
		lbStuNumD.setFont(new Font("Verdana" ,Font.PLAIN,15));
		jPanel.add(lbStuNumD);
		
		txtStuNumD = new JTextField();
		txtStuNumD.setBounds(80,260,80,30);
		jPanel.add(txtStuNumD);
		
		
//		btnDelete
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(180, 260, 90, 30);
		btnDelete.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnDelete.addActionListener(btnL);
		jPanel.add(btnDelete);
		/*************************************************************************************/
		
		
		
		/**************************************Show Student Table***********************************/
		JTable jTable = new JTable();
		DefaultTableModel model = new DefaultTableModel();

		/*
		ArrayList<DescribeTableVO> arrDescribeTableVO = 
				dbConnect.getTableDescription("Student"); //get and store table named student to arrDescribeTableVO
		Object[] columnsName = new Object[arrDescribeTableVO.size()];
		for (int i = 0; i < arrDescribeTableVO.size(); i++) {
			columnsName[i] = arrDescribeTableVO.get(i).getColumn_name();
		}
		model.setColumnIdentifiers(columnsName);
		

		Object[] rowData = new Object[arrDescribeTableVO.size()];
		System.out.println(arrDescribeTableVO.size());
		ArrayList<StudentVO> arrStudentVO = dbConnect.selectStudent(condition);
		for (int i = 0; i < arrStudentVO.size(); i++) {
			System.out.println(arrStudentVO.get(i).getStuNum());
			rowData[0] = arrStudentVO.get(i).getStuNum();
			rowData[1] = arrStudentVO.get(i).getChargeProfNum();
			rowData[2] = arrStudentVO.get(i).getAffDepNum();
			rowData[3] = arrStudentVO.get(i).getStuName();
			rowData[4] = arrStudentVO.get(i).getStuSSNum();
			rowData[5] = arrStudentVO.get(i).getStuAddress();
			rowData[6] = arrStudentVO.get(i).getStuPhoneNum();
			rowData[7] = arrStudentVO.get(i).getStuEmail();
			rowData[8] = arrStudentVO.get(i).getCurGrade();
			rowData[9] = arrStudentVO.get(i).getStuPhoneNum();

			model.addRow(rowData);
		}
		*/

		jTable.setModel(model);
		jTable.setPreferredScrollableViewportSize(jTable.getPreferredSize());
		jTable.setFillsViewportHeight(true);
		jTable.getTableHeader().setFont(new Font("Verdana", Font.PLAIN, 17));
		jTable.setFont(new Font("Verdana", Font.PLAIN, 17));
		jTable.setRowHeight(20);
		jTable.getTableHeader().setReorderingAllowed(false);

		jScrollPane = new JScrollPane(jTable);
		jScrollPane.setPreferredSize(new Dimension(1200, 150));
		jScrollPane.setBounds(75, 350, 1200, 250);
//		jScrollPane.getVerticalScrollBar().setValue(jScrollPane.getVerticalScrollBar().getMaximum());
		
		jPanel.add(jScrollPane);
		
		/*************************************************************************************************/
		
		return jPanel;
	}
	
	private JPanel getProfessorTable(String condition) {
		JPanel jPanel = new JPanel();
		jPanel.setBounds(0, 0, 1400, 650);
		jPanel.setBackground(new Color(245, 245, 245));
		jPanel.setLayout(null);
		
		
		/*********************************************INSERT Professor************************************/
		JLabel lbInsert = new JLabel("INSERT");
		lbInsert.setBounds(80,20,100,40);
		lbInsert.setFont(new Font("Verdana", Font.PLAIN,17));
		jPanel.add(lbInsert);
		
//		ProfNum
		JLabel lbProfNum = new JLabel("ProfNum");
		lbProfNum.setBounds(80,60,100,40);
		lbProfNum.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbProfNum);
		
		txtProfNum = new JTextField();
		txtProfNum.setBounds(80,90,80,30);
		jPanel.add(txtProfNum);
		
//		ProfAffDepNum
		JLabel lbProfAffDepNum = new JLabel("ProfAffDepNum");
		lbProfAffDepNum.setBounds(180,60,150,40);
		lbProfAffDepNum.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbProfAffDepNum);
		
		txtProfAffDepNum = new JTextField();
		txtProfAffDepNum.setBounds(180,90,80,30);
		jPanel.add(txtProfAffDepNum);
		
//		ProfName
		JLabel lbProfName = new JLabel("ProfName");
		lbProfName.setBounds(320,60,100,40);
		lbProfName.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbProfName);
		
		txtProfName = new JTextField();
		txtProfName.setBounds(320,90,80,30);
		jPanel.add(txtProfName);
		
//		ProfSSNum
		JLabel lbProfSSNum = new JLabel("ProfSSNum");
		lbProfSSNum.setBounds(420,60,100,40);
		lbProfSSNum.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbProfSSNum);
		
		txtProfSSNum = new JTextField();
		txtProfSSNum.setBounds(420,90,80,30);
		jPanel.add(txtProfSSNum);
		
//		ProfAddress
		JLabel lbProfAddress = new JLabel("ProfAddress");
		lbProfAddress.setBounds(520,60,100,40);
		lbProfAddress.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbProfAddress);
		
		txtProfAddress = new JTextField();
		txtProfAddress.setBounds(520,90,80,30);
		jPanel.add(txtProfAddress);
		
//		ProfPhoneNum
		JLabel lbProfPhoneNum = new JLabel("ProfPhoneNum");
		lbProfPhoneNum.setBounds(620,60,150,40);
		lbProfPhoneNum.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbProfPhoneNum);
		
		txtProfPhoneNum = new JTextField();
		txtProfPhoneNum.setBounds(620,90,80,30);
		jPanel.add(txtProfPhoneNum);
		
//		ProfEmail
		JLabel lbProfEmail = new JLabel("ProfEmail");
		lbProfEmail.setBounds(760,60,100,40);
		lbProfEmail.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbProfEmail);
		
		txtProfEmail = new JTextField();
		txtProfEmail.setBounds(760,90,80,30);
		jPanel.add(txtProfEmail);
		
//		btnInsert
		JButton btnInsert = new JButton("Insert");
		btnInsert.setBounds(350, 130, 80, 35);
		btnInsert.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnInsert.addActionListener(btnL);
		jPanel.add(btnInsert);
		
//		btnUpdate
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(700, 130, 90, 35);
		btnUpdate.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnUpdate.addActionListener(btnL);
		jPanel.add(btnUpdate);
		/***************************************************************************************************/
		
		
		
		
		
		/********************************************Delete Professor*******************************************/
		JLabel lbDelete = new JLabel("DELETE");
		lbDelete.setBounds(80,180,100,40);
		lbDelete.setFont(new Font("Verdana", Font.PLAIN,17));
		jPanel.add(lbDelete);
		
//		ProfNumNum
		JLabel lbProfNumD = new JLabel("ProfNum");
		lbProfNumD.setBounds(80,220,100,40);
		lbProfNumD.setFont(new Font("Verdana" ,Font.PLAIN,15));
		jPanel.add(lbProfNumD);
		
		txtProfNumD = new JTextField();
		txtProfNumD.setBounds(80,260,80,30);
		jPanel.add(txtProfNumD);
		
		
//		btnDelete
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(180, 260, 90, 30);
		btnDelete.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnDelete.addActionListener(btnL);
		jPanel.add(btnDelete);
		/*************************************************************************************************/
		
		
		
		
		
		/***************************************Show Professor Table**************************************/
		JTable jTable = new JTable();
		DefaultTableModel model = new DefaultTableModel();

		
		/*
		ArrayList<DescribeTableVO> arrDescribeTableVO = 
				dbConnect.getTableDescription("Professor");
		Object[] columnsName = new Object[arrDescribeTableVO.size()];
		for (int i = 0; i < arrDescribeTableVO.size(); i++) {
			columnsName[i] = arrDescribeTableVO.get(i).getColumn_name();
		}
		model.setColumnIdentifiers(columnsName);

		Object[] rowData = new Object[arrDescribeTableVO.size()];
		System.out.println(arrDescribeTableVO.size());
		ArrayList<ProfessorVO> arrProfessorVO = 
				dbConnect.selectProfessor(condition);
		for (int i = 0; i < arrProfessorVO.size(); i++) {
			System.out.println(arrProfessorVO.get(i).getProfNum());
			rowData[0] = arrProfessorVO.get(i).getProfNum();
			rowData[1] = arrProfessorVO.get(i).getProfAffDepNum();
			rowData[2] = arrProfessorVO.get(i).getProfName();
			rowData[3] = arrProfessorVO.get(i).getProfSSNum();
			rowData[4] = arrProfessorVO.get(i).getProfAddress();
			rowData[5] = arrProfessorVO.get(i).getProfPhoneNum();
			rowData[6] = arrProfessorVO.get(i).getProfEmail();

			model.addRow(rowData);
		}
		*/

		jTable.setModel(model);
		jTable.setPreferredScrollableViewportSize(jTable.getPreferredSize());
		jTable.setFillsViewportHeight(true);
		jTable.getTableHeader().setFont(new Font("Verdana", Font.PLAIN, 17));
		jTable.setFont(new Font("Verdana", Font.PLAIN, 17));
		jTable.setRowHeight(20);
		jTable.getTableHeader().setReorderingAllowed(false);

		jScrollPane = new JScrollPane(jTable);
		jScrollPane.setPreferredSize(new Dimension(1200, 300));
		jScrollPane.setBounds(75, 350, 1200, 250);
//		jScrollPane.getVerticalScrollBar().setValue(jScrollPane.getVerticalScrollBar().getMaximum());
		
		
		jPanel.add(jScrollPane);
		
		/******************************************************************************************/
		
		
		return jPanel;
	}
	
	private JPanel getCourseTable(String condition) {
		JPanel jPanel = new JPanel();
		jPanel.setBounds(0, 0, 1400, 650);
		jPanel.setBackground(new Color(245, 245, 245));
		jPanel.setLayout(null);
		

		
		
		/********************************************INSERT Course********************************************/
		JLabel lbInsert = new JLabel("INSERT");
		lbInsert.setBounds(80,20,100,40);
		lbInsert.setFont(new Font("Verdana", Font.PLAIN,17));
		jPanel.add(lbInsert);
		
//		CourseNum
		JLabel lbCourseNum = new JLabel("CourseNum");
		lbCourseNum.setBounds(80,60,100,40);
		lbCourseNum.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbCourseNum);
		
		txtCourseNum = new JTextField();
		txtCourseNum.setBounds(80,90,80,30);
		jPanel.add(txtCourseNum);
		
//		courseChargeProfNum
		JLabel lbCourseChargeProfNum = new JLabel("ChargeProfNum");
		lbCourseChargeProfNum.setBounds(180,60,150,40);
		lbCourseChargeProfNum.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbCourseChargeProfNum);
		
		txtCourseChargeProfNum = new JTextField();
		txtCourseChargeProfNum.setBounds(180,90,80,30);
		jPanel.add(txtCourseChargeProfNum);
		
//		ProgressDepNum
		JLabel lbProgressDepNum = new JLabel("ProgressDepNum");
		lbProgressDepNum.setBounds(320,60,150,40);
		lbProgressDepNum.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbProgressDepNum);
		
		txtProgressDepNum = new JTextField();
		txtProgressDepNum.setBounds(320,90,80,30);
		jPanel.add(txtProgressDepNum);
		
//		CourseName
		JLabel lbCourseName = new JLabel("CourseName");
		lbCourseName.setBounds(460,60,100,40);
		lbCourseName.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbCourseName);
		
		txtCourseName = new JTextField();
		txtCourseName.setBounds(460,90,80,30);
		jPanel.add(txtCourseName);
		
//		ReceivedCredits
		JLabel lbReceivedCredits = new JLabel("ReceivedCredits");
		lbReceivedCredits.setBounds(560,60,150,40);
		lbReceivedCredits.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbReceivedCredits);
		
		txtReceivedCredits = new JTextField();
		txtReceivedCredits.setBounds(560,90,80,30);
		jPanel.add(txtReceivedCredits);
		
//		CourseTime
		JLabel lbCourseTime = new JLabel("CourseTime");
		lbCourseTime.setBounds(700,60,100,40);
		lbCourseTime.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbCourseTime);
		
		txtCourseTime = new JTextField();
		txtCourseTime.setBounds(700,90,80,30);
		jPanel.add(txtCourseTime);
		
//		LecRoom
		JLabel lbLecRoom = new JLabel("LecRoom");
		lbLecRoom.setBounds(800,60,100,40);
		lbLecRoom.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbLecRoom);
		
		txtLecRoom = new JTextField();
		txtLecRoom.setBounds(800,90,80,30);
		jPanel.add(txtLecRoom);
		
//		btnInsert
		JButton btnInsert = new JButton("Insert");
		btnInsert.setBounds(350, 130, 80, 35);
		btnInsert.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnInsert.addActionListener(btnL);
		jPanel.add(btnInsert);
		
//		btnUpdate
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(700, 130, 90, 35);
		btnUpdate.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnUpdate.addActionListener(btnL);
		jPanel.add(btnUpdate);
		/*************************************************************************************************/
		
		
		
		
		
		/************************************************Delete Course*******************************************/
		JLabel lbDelete = new JLabel("DELETE");
		lbDelete.setBounds(80,180,100,40);
		lbDelete.setFont(new Font("Verdana", Font.PLAIN,17));
		jPanel.add(lbDelete);
		
//		CourseNum
		JLabel lbCourseNumD = new JLabel("CourseNum");
		lbCourseNumD.setBounds(80,220,100,40);
		lbCourseNumD.setFont(new Font("Verdana" ,Font.PLAIN,15));
		jPanel.add(lbCourseNumD);
		
		txtCourseNumD = new JTextField();
		txtCourseNumD.setBounds(80,260,80,30);
		jPanel.add(txtCourseNumD);
		
//		CourseChargeProfNum
		JLabel lbCourseChargeProfNumD = new JLabel("ChargeProfNum");
		lbCourseChargeProfNumD.setBounds(180,220,100,40);
		lbCourseChargeProfNumD.setFont(new Font("Verdana" ,Font.PLAIN,15));
		jPanel.add(lbCourseChargeProfNumD);
		
		txtCourseChargeProfNumD = new JTextField();
		txtCourseChargeProfNumD.setBounds(180,260,80,30);
		jPanel.add(txtCourseChargeProfNumD);
		
		
//		btnDelete
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(280, 260, 90, 30);
		btnDelete.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnDelete.addActionListener(btnL);
		jPanel.add(btnDelete);
		/**************************************************************************************************/
		
		
		
		
		
		
		/****************************************Show Course Table*******************************************/
		JTable jTable = new JTable();
		DefaultTableModel model = new DefaultTableModel();
		
		
		/*
		ArrayList<DescribeTableVO> arrDescribeTableVO = 
				dbConnect.getTableDescription("Course");
		Object[] columnsName = new Object[arrDescribeTableVO.size()];
		for (int i = 0; i < arrDescribeTableVO.size(); i++) {
			columnsName[i] = arrDescribeTableVO.get(i).getColumn_name();
		}
		model.setColumnIdentifiers(columnsName);

		Object[] rowData = new Object[arrDescribeTableVO.size()];
		System.out.println(arrDescribeTableVO.size());
		ArrayList<CourseVO> arrCourseVO = 
				dbConnect.selectCourse(condition);
		for (int i = 0; i < arrCourseVO.size(); i++) {
			System.out.println(arrCourseVO.get(i).getCourseNum());
			rowData[0] = arrCourseVO.get(i).getCourseNum();
			rowData[1] = arrCourseVO.get(i).getcourseChargeProfNum();
			rowData[2] = arrCourseVO.get(i).getProgressDepNum();
			rowData[3] = arrCourseVO.get(i).getCourseName();
			rowData[4] = arrCourseVO.get(i).getReceivedCredits();
			rowData[5] = arrCourseVO.get(i).getCourseTime();
			rowData[6] = arrCourseVO.get(i).getLecRoom();

			model.addRow(rowData);
		}
		*/
		
		
		jTable.setModel(model);
		jTable.setPreferredScrollableViewportSize(jTable.getPreferredSize());
		jTable.setFillsViewportHeight(true);
		jTable.getTableHeader().setFont(new Font("Verdana", Font.PLAIN, 17));
		jTable.setFont(new Font("Verdana", Font.PLAIN, 17));
		jTable.setRowHeight(20);
		jTable.getTableHeader().setReorderingAllowed(false);

		jScrollPane = new JScrollPane(jTable);
		jScrollPane.setPreferredSize(new Dimension(1200, 150));
		jScrollPane.setBounds(75, 350, 1200, 250);
//		jScrollPane.getVerticalScrollBar().setValue(jScrollPane.getVerticalScrollBar().getMaximum());
		
		jPanel.add(jScrollPane);
		
		/**************************************************************************************************/
		
		
		
		return jPanel;
	}
	
	private JPanel getDepartmentTable(String condition) {
		JPanel jPanel = new JPanel();
		jPanel.setBounds(0, 0, 1400, 850);
		jPanel.setBackground(new Color(245, 245, 245));
		jPanel.setLayout(null);
		

		
		/**************************************************INSERT Department****************************************/
		JLabel lbInsert = new JLabel("INSERT");
		lbInsert.setBounds(80,20,100,40);
		lbInsert.setFont(new Font("Verdana", Font.PLAIN,17));
		jPanel.add(lbInsert);
		
//		DepNum
		JLabel lbDepNum = new JLabel("DepNum");
		lbDepNum.setBounds(80,60,100,40);
		lbDepNum.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbDepNum);
		
		txtDepNum = new JTextField();
		txtDepNum.setBounds(80,90,80,30);
		jPanel.add(txtDepNum);
		
//		DepName
		JLabel lbDepName = new JLabel("DepName");
		lbDepName.setBounds(180,60,100,40);
		lbDepName.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbDepName);
		
		txtDepName = new JTextField();
		txtDepName.setBounds(180,90,80,30);
		jPanel.add(txtDepName);
		
//		DepPhoneNum
		JLabel lbDepPhoneNum = new JLabel("DepPhoneNum");
		lbDepPhoneNum.setBounds(280,60,150,40);
		lbDepPhoneNum.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbDepPhoneNum);
		
		txtDepPhoneNum = new JTextField();
		txtDepPhoneNum.setBounds(280,90,80,30);
		jPanel.add(txtDepPhoneNum);
		
//		btnInsert
		JButton btnInsert = new JButton("Insert");
		btnInsert.setBounds(350, 130, 80, 35);
		btnInsert.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnInsert.addActionListener(btnL);
		jPanel.add(btnInsert);
		
//		btnUpdate
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(700, 130, 90, 35);
		btnUpdate.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnUpdate.addActionListener(btnL);
		jPanel.add(btnUpdate);
		/*************************************************************************************************/
		
		
		
		
		
		/*********************************************Delete Department***************************************/
		JLabel lbDelete = new JLabel("DELETE");
		lbDelete.setBounds(80,180,100,40);
		lbDelete.setFont(new Font("Verdana", Font.PLAIN,17));
		jPanel.add(lbDelete);
		
//		DepNum
		JLabel lbDepNumD = new JLabel("DepNum");
		lbDepNumD.setBounds(80,220,100,40);
		lbDepNumD.setFont(new Font("Verdana" ,Font.PLAIN,15));
		jPanel.add(lbDepNumD);
		
		txtDepNumD = new JTextField();
		txtDepNumD.setBounds(80,260,80,30);
		jPanel.add(txtDepNumD);
		
		
//		btnDelete
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(180, 260, 90, 30);
		btnDelete.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnDelete.addActionListener(btnL);
		jPanel.add(btnDelete);
		/************************************************************************************************/
		
		
		
		
		
		
		/********************************************Show Department Table**************************************/
		JTable jTable = new JTable();
		DefaultTableModel model = new DefaultTableModel();

		
		/*
		ArrayList<DescribeTableVO> arrDescribeTableVO = 
				dbConnect.getTableDescription("Department");
		Object[] columnsName = new Object[arrDescribeTableVO.size()];
		for (int i = 0; i < arrDescribeTableVO.size(); i++) {
			columnsName[i] = arrDescribeTableVO.get(i).getColumn_name();
		}
		model.setColumnIdentifiers(columnsName);

		Object[] rowData = new Object[arrDescribeTableVO.size()];
		System.out.println(arrDescribeTableVO.size());
		ArrayList<DepartmentVO> arrDepartmentVO = 
				dbConnect.selectDepartment(condition);
		for (int i = 0; i < arrDepartmentVO.size(); i++) {
			System.out.println(arrDepartmentVO.get(i).getDepNum());
			rowData[0] = arrDepartmentVO.get(i).getDepNum();
			rowData[1] = arrDepartmentVO.get(i).getDepName();
			rowData[2] = arrDepartmentVO.get(i).getDepPhoneNum();

			model.addRow(rowData);
		}
		*/
		
		
		jTable.setModel(model);
		jTable.setPreferredScrollableViewportSize(jTable.getPreferredSize());
		jTable.setFillsViewportHeight(true);
		jTable.getTableHeader().setFont(new Font("Verdana", Font.PLAIN, 17));
		jTable.setFont(new Font("Verdana", Font.PLAIN, 17));
		jTable.setRowHeight(20);
		jTable.getTableHeader().setReorderingAllowed(false);

		jScrollPane = new JScrollPane(jTable);
		jScrollPane.setPreferredSize(new Dimension(650, 150));
		jScrollPane.setBounds(75, 350, 1200, 250);
//		jScrollPane.getVerticalScrollBar().setValue(jScrollPane.getVerticalScrollBar().getMaximum());
		
		jPanel.add(jScrollPane);
		
		/*******************************************************************************************/
		
		
		return jPanel;
	}

	private JPanel getAttendTable(String condition) {
		JPanel jPanel = new JPanel();
		jPanel.setBounds(0, 0, 1400, 900);
		jPanel.setBackground(new Color(245, 245, 245));
		jPanel.setLayout(null);
		

		
		/****************************************Class Resgisteration(Insert Attend)************************************/
		JLabel lbInsert = new JLabel("*****Class Resgisteration*****");
		lbInsert.setBounds(80,20,300,40);
		lbInsert.setFont(new Font("Verdana", Font.PLAIN,17));
		jPanel.add(lbInsert);
		
//		AttendStuNum
		JLabel lbAttendStuNum = new JLabel("AttendStuNum");
		lbAttendStuNum.setBounds(80,60,150,40);
		lbAttendStuNum.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbAttendStuNum);
		
		txtAttendStuNum = new JTextField();
		txtAttendStuNum.setBounds(80,90,80,30);
		jPanel.add(txtAttendStuNum);
		
//		AttendCourseNum
		JLabel lbAttendCourseNum = new JLabel("AttendCourseNum");
		lbAttendCourseNum.setBounds(220,60,150,40);
		lbAttendCourseNum.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbAttendCourseNum);
		
		txtAttendCourseNum = new JTextField();
		txtAttendCourseNum.setBounds(220,90,80,30);
		jPanel.add(txtAttendCourseNum);
		
//		AttendProfNum
		JLabel lbAttendProfNum = new JLabel("AttendProfNum");
		lbAttendProfNum.setBounds(380,60,150,40);
		lbAttendProfNum.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbAttendProfNum);
		
		txtAttendProfNum = new JTextField();
		txtAttendProfNum.setBounds(380,90,80,30);
		jPanel.add(txtAttendProfNum);
		
//		AttendanceScore
		JLabel lbAttendanceScore = new JLabel("AttendanceScore");
		lbAttendanceScore.setBounds(520,60,150,40);
		lbAttendanceScore.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbAttendanceScore);
		
		txtAttendanceScore = new JTextField();
		txtAttendanceScore.setBounds(520,90,80,30);
		jPanel.add(txtAttendanceScore);
		
//		MidScore
		JLabel lbMidScore = new JLabel("MidScore");
		lbMidScore.setBounds(660,60,150,40);
		lbMidScore.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbMidScore);
		
		txtMidScore = new JTextField();
		txtMidScore.setBounds(660,90,80,30);
		jPanel.add(txtMidScore);
		
//		FinScore
		JLabel lbFinScore = new JLabel("FinScore");
		lbFinScore.setBounds(760,60,150,40);
		lbFinScore.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbFinScore);
		
		txtFinScore = new JTextField();
		txtFinScore.setBounds(760,90,80,30);
		jPanel.add(txtFinScore);
		
//		EtcScore
		JLabel lbEtcScore = new JLabel("EtcScore");
		lbEtcScore.setBounds(860,60,150,40);
		lbEtcScore.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbEtcScore);
		
		txtEtcScore = new JTextField();
		txtEtcScore.setBounds(860,90,80,30);
		jPanel.add(txtEtcScore);
		
//		TotalScore
		JLabel lbTotalScore = new JLabel("TotalScore");
		lbTotalScore.setBounds(960,60,150,40);
		lbTotalScore.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbTotalScore);
		
		txtTotalScore = new JTextField();
		txtTotalScore.setBounds(960,90,80,30);
		jPanel.add(txtTotalScore);
		
//		Grade
		JLabel lbGrade = new JLabel("Grade");
		lbGrade.setBounds(1060,60,150,40);
		lbGrade.setFont(new Font("Verdana", Font.PLAIN,15));
		jPanel.add(lbGrade);
		
		txtGrade = new JTextField();
		txtGrade.setBounds(1060,90,80,30);
		jPanel.add(txtGrade);
		
//		btnInsert
		JButton btnInsert = new JButton("Insert");
		btnInsert.setBounds(350, 130, 80, 35);
		btnInsert.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnInsert.addActionListener(btnL);
		jPanel.add(btnInsert);
		
//		btnUpdate
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(700, 130, 90, 35);
		btnUpdate.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnUpdate.addActionListener(btnL);
		jPanel.add(btnUpdate);
		/*****************************************************************************************8*********/
		
		
		
		
		
		/***********************************************Delete Attend********************************************/
		JLabel lbDelete = new JLabel("DELETE");
		lbDelete.setBounds(80,180,100,40);
		lbDelete.setFont(new Font("Verdana", Font.PLAIN,17));
		jPanel.add(lbDelete);
		
//		AttendStuNum
		JLabel lbAttendStuNumD = new JLabel("AttendStuNum");
		lbAttendStuNumD.setBounds(80,220,150,40);
		lbAttendStuNumD.setFont(new Font("Verdana" ,Font.PLAIN,15));
		jPanel.add(lbAttendStuNumD);
		
		txtAttendStuNumD = new JTextField();
		txtAttendStuNumD.setBounds(80,260,80,30);
		jPanel.add(txtAttendStuNumD);
		
//		AttendCourseNum
		JLabel lbAttendCourseNumD = new JLabel("AttendCourseNum");
		lbAttendCourseNumD.setBounds(220,220,150,40);
		lbAttendCourseNumD.setFont(new Font("Verdana" ,Font.PLAIN,15));
		jPanel.add(lbAttendCourseNumD);
		
		txtAttendCourseNumD = new JTextField();
		txtAttendCourseNumD.setBounds(220,260,80,30);
		jPanel.add(txtAttendCourseNumD);
		
//		AttendProfNum
		JLabel lbAttendProfNumD = new JLabel("AttendProfNum");
		lbAttendProfNumD.setBounds(380,220,150,40);
		lbAttendProfNumD.setFont(new Font("Verdana" ,Font.PLAIN,15));
		jPanel.add(lbAttendProfNumD);
		
		txtAttendProfNumD = new JTextField();
		txtAttendProfNumD.setBounds(380,260,80,30);
		jPanel.add(txtAttendProfNumD);
		
		
//		btnDelete
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(500, 260, 90, 30);
		btnDelete.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnDelete.addActionListener(btnL);
		jPanel.add(btnDelete);
		/**********************************************************************************************/
		
		
		
		
		
		/*****************************************Show Attend Table****************************************/
		JTable jTable = new JTable();
		DefaultTableModel model = new DefaultTableModel();
		
		
		/*
		ArrayList<DescribeTableVO> arrDescribeTableVO = 
				dbConnect.getTableDescription("Attend");
		Object[] columnsName = new Object[arrDescribeTableVO.size()];
		for (int i = 0; i < arrDescribeTableVO.size(); i++) {
			columnsName[i] = arrDescribeTableVO.get(i).getColumn_name();
		}
		model.setColumnIdentifiers(columnsName);

		Object[] rowData = new Object[arrDescribeTableVO.size()];
		System.out.println(arrDescribeTableVO.size());
		ArrayList<AttendVO> arrAttendVO = 
				dbConnect.selectAttend(condition);
		for (int i = 0; i < arrAttendVO.size(); i++) {
			System.out.println(arrAttendVO.get(i).getAttendStuNum() + " " + arrAttendVO.get(i).getAttendCourseNum() + " " + arrAttendVO.get(i).getAttendProfNum());
			rowData[0] = arrAttendVO.get(i).getAttendStuNum();
			rowData[1] = arrAttendVO.get(i).getAttendCourseNum();
			rowData[2] = arrAttendVO.get(i).getAttendProfNum();
			rowData[3] = arrAttendVO.get(i).getAttendanceScore();
			rowData[4] = arrAttendVO.get(i).getMidScore();
			rowData[5] = arrAttendVO.get(i).getFinScore();
			rowData[6] = arrAttendVO.get(i).getEtcScore();
			rowData[7] = arrAttendVO.get(i).getTotalScore();
			rowData[8] = arrAttendVO.get(i).getGrade();
			model.addRow(rowData);
		}
		*/
		
		jTable.setModel(model);
		jTable.setPreferredScrollableViewportSize(jTable.getPreferredSize());
		jTable.setFillsViewportHeight(true);
		jTable.getTableHeader().setFont(new Font("Verdana", Font.PLAIN, 17));
		jTable.setFont(new Font("Verdana", Font.PLAIN, 17));
		jTable.setRowHeight(20);
		jTable.getTableHeader().setReorderingAllowed(false);

		jScrollPane = new JScrollPane(jTable);
		jScrollPane.setPreferredSize(new Dimension(1200, 150));
		jScrollPane.setBounds(75, 350, 1200, 250);
//		jScrollPane.getVerticalScrollBar().setValue(jScrollPane.getVerticalScrollBar().getMaximum());
		
		jPanel.add(jScrollPane);
		/************************************************************************************************/
		
		
		
		return jPanel;
	}
	
	private class BtnListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {

			JButton b = (JButton) event.getSource();
			String tableName;
			String condition = "";
			
			String btnName=null;
			btnName=b.getText();
			switch(btnName) {
			/**************************************************Search Button******************************************/
				case "Search":
					mainPanel.removeAll();
					mainPanel.setLayout(null);
	
					tableName = strMenu[cmbMenu.getSelectedIndex()];
					condition = "";
					jTable = null;
					tempPanel = null;
	
					switch (tableName) {
					case "STUDENT":
						tempPanel = getStudentTable(condition);
						break;
					case "PROFESSOR":
						tempPanel = getProfessorTable(condition);
						break;
					case "COURSE":
						tempPanel = getCourseTable(condition);
						break;
					case "DEPARTMENT":
						tempPanel = getDepartmentTable(condition);
						break;
					case "ATTEND":
						tempPanel = getAttendTable(condition);
						break;
					}
	
					mainPanel.add(tempPanel);
					add(mainPanel);
	
					setVisible(true);
					validate();
					repaint();
					break;
					
					
					/*******************************************Insert Button**********************************/
				case "Insert":
					mainPanel.removeAll();
					mainPanel.setLayout(null);
	
					tableName = strMenu[cmbMenu.getSelectedIndex()];
					jTable = null;
					tempPanel = null;
	
					switch (tableName) {
					case "STUDENT":
						dbConnect.insertStudent(txtStuNum.getText(), txtChargeProfNum.getText(), txtStuAffDepNum.getText(), txtStuName.getText(), txtStuSSNum.getText(), txtStuAddress.getText(), 
								Integer.parseInt(txtStuPhoneNum.getText()),
								txtStuEmail.getText(),
								Integer.parseInt(txtCurGrade.getText()),
								Integer.parseInt(txtCurSem.getText()));
						tempPanel = getStudentTable(condition);
						break;
					case "PROFESSOR":
						dbConnect.insertProfessor(txtProfNum.getText(), txtProfAffDepNum.getText(), txtProfName.getText(), txtProfSSNum.getText(), txtProfAddress.getText(), 
								Integer.parseInt(txtProfPhoneNum.getText()), 
								txtProfEmail.getText());
						tempPanel = getProfessorTable(condition);
						break;
					case "COURSE":
						dbConnect.insertCourse(txtCourseNum.getText(), txtChargeProfNum.getText(), txtProgressDepNum.getText(), txtCourseName.getText(),
								Float.parseFloat(txtReceivedCredits.getText()),
								Integer.parseInt(txtCourseTime.getText()),
								txtLecRoom.getText());
						tempPanel = getCourseTable(condition);
						break;
					case "DEPARTMENT":
						dbConnect.insertDepartment(txtDepNum.getText(), txtDepName.getText(),
								Integer.parseInt(txtDepPhoneNum.getText()));
						tempPanel = getDepartmentTable(condition);
						break;
					case "ATTEND":
						dbConnect.insertAttend(txtAttendStuNum.getText(), txtAttendCourseNum.getText(), txtAttendProfNum.getText(),
								Integer.parseInt(txtAttendanceScore.getText()),
								Integer.parseInt(txtMidScore.getText()),
								Integer.parseInt(txtFinScore.getText()),
								Integer.parseInt(txtEtcScore.getText()),
								Integer.parseInt(txtTotalScore.getText()),
								txtGrade.getText());
						tempPanel = getAttendTable(condition);
						break;
					}
	
					mainPanel.add(tempPanel);
					add(mainPanel);
	
					setVisible(true);
					validate();
					repaint();
					break;
					/*****************************************************************************************/
					
					
					
					
					
					/********************************************Select button***************************
				case "Select":
					mainPanel.removeAll();
					mainPanel.setLayout(null);
	
					tableName = strMenu[cmbMenu.getSelectedIndex()];
					jTable = null;
					tempPanel = null;
	
					switch (tableName) {
					case "STUDENT":
						condition="where ";
						condition+=txtStuWhere.getText();
						tempPanel = getStudentTable(condition);
						break;
					case "PROFESSOR":
						condition="where ";
						condition+=txtProfWhere.getText();
						tempPanel = getProfessorTable(condition);
						break;
					case "COURSE":
						condition="where ";
						condition+=txtCourseWhere.getText();
						tempPanel = getCourseTable(condition);
						break;
					case "DEPARTMENT":
						condition="where ";
						condition+=txtDepWhere.getText();
						tempPanel = getDepartmentTable(condition);
						break;
					}
	
					mainPanel.add(tempPanel);
					add(mainPanel);
	
					setVisible(true);
					validate();
					repaint();
					break;
					************************************************************************************/
					
					
					
					
					
					/*********************************Delete Button*************************************/
				case "Delete" :
					mainPanel.removeAll();
					mainPanel.setLayout(null);
	
					tableName = strMenu[cmbMenu.getSelectedIndex()];
					jTable = null;
					tempPanel = null;
	
					switch (tableName) {
					case "STUDENT":
						dbConnect.deleteStudent(txtStuNumD.getText());
						tempPanel = getStudentTable(condition);
						break;
					case "PROFESSOR":
						dbConnect.deleteProfessor(txtProfNumD.getText());
						tempPanel = getProfessorTable(condition);
						break;
					case "COURSE":
						dbConnect.deleteCourse(txtCourseNumD.getText(), txtCourseChargeProfNumD.getText());
						tempPanel = getCourseTable(condition);
						break;
					case "DEPARTMENT":
						dbConnect.deleteDepartment(txtDepNumD.getText());
						tempPanel = getDepartmentTable(condition);
						break;
					case "ATTEND":
						dbConnect.deleteAttend(txtAttendStuNumD.getText(), txtAttendCourseNumD.getText(), txtAttendProfNumD.getText());
						tempPanel = getDepartmentTable(condition);
						break;
					}
	
					mainPanel.add(tempPanel);
					add(mainPanel);
	
					setVisible(true);
					validate();
					repaint();
					break;
					/***************************************************************************************/
					
					
					
				/**************************************Update Button**********************************/	
				case "Update":
					mainPanel.removeAll();
					mainPanel.setLayout(null);
	
					tableName = strMenu[cmbMenu.getSelectedIndex()];
					jTable = null;
					tempPanel = null;
	
					switch (tableName) {
					case "STUDENT":
						dbConnect.updateStudent(txtStuNum.getText(), txtChargeProfNum.getText(), txtStuAffDepNum.getText(), txtStuName.getText(), txtStuSSNum.getText(), txtStuAddress.getText(), 
								Integer.parseInt(txtStuPhoneNum.getText()),
								txtStuEmail.getText(),
								Integer.parseInt(txtCurGrade.getText()),
								Integer.parseInt(txtCurSem.getText()));
						tempPanel = getStudentTable(condition);
						break;
					case "PROFESSOR":
						dbConnect.updateProfessor(txtProfNum.getText(), txtProfAffDepNum.getText(), txtProfName.getText(), txtProfSSNum.getText(), txtProfAddress.getText(), 
								Integer.parseInt(txtProfPhoneNum.getText()), 
								txtProfEmail.getText());
						tempPanel = getProfessorTable(condition);
						break;
					case "COURSE":
						dbConnect.updateCourse(txtCourseNum.getText(), txtCourseChargeProfNum.getText(), txtProgressDepNum.getText(), txtCourseName.getText(),
								Float.parseFloat(txtReceivedCredits.getText()),
								Integer.parseInt(txtCourseTime.getText()),
								txtLecRoom.getText());
						tempPanel = getCourseTable(condition);
						break;
					case "DEPARTMENT":
						dbConnect.updateDepartment(txtDepNum.getText(), txtDepName.getText(),
								Integer.parseInt(txtDepPhoneNum.getText()));
						tempPanel = getDepartmentTable(condition);
						break;
					case "ATTEND":
						dbConnect.updateAttend(txtAttendStuNum.getText(), txtAttendCourseNum.getText(), txtAttendProfNum.getText(),
								Integer.parseInt(txtAttendanceScore.getText()),
								Integer.parseInt(txtMidScore.getText()),
								Integer.parseInt(txtFinScore.getText()),
								Integer.parseInt(txtEtcScore.getText()),
								Integer.parseInt(txtTotalScore.getText()),
								txtGrade.getText());
						tempPanel = getDepartmentTable(condition);
						break;
					}
	
					mainPanel.add(tempPanel);
					add(mainPanel);
	
					setVisible(true);
					validate();
					repaint();
					break;
					/***************************************************************************/
					
					/****************************************Initialize Button NEW****************************/
				case "Initialize":
					dbConnect.initDB();
					mainPanel.removeAll();
					mainPanel.setLayout(null);
					break;
					/**************************************************************************************/
					
					/****************************************Program Exit Button NEW*****************************/
				case "Exit":
					System.exit(0);
					break;
					/*********************************************************************************************/
			}
		}

	} // BtnListener class

} // PrimaryPanel class