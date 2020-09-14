drop table Student cascade constraints;
drop table Professor cascade constraints;
drop table Attend cascade constraints;
drop table Course cascade constraints;
drop table Department cascade constraints;

CREATE TABLE Student
(
    stuNum varchar(5) NOT NULL,
    chargeProfNum varchar(5),
    stuAffDepNum varchar(5),
    stuName varchar(20),
    stuSSNum varchar(20),
    stuAddress varchar(15),
    stuPhoneNum integer,
    stuEmail varchar(20),
    curGrade integer,
    curSem integer,
    primary key(stuNum)
);


insert
into Student(stuNum, chargeProfNum, stuAffDepNum, stuName, stuSSNum, stuAddress, stuPhoneNum, stuEmail, curGrade, curSem)
values ('S001', 'P012', 'D003', 'John Constantine', '960610-1064784', 'New York', 01025069288, 'bigbec@naver.com', 3, 1);

insert
into Student(stuNum, chargeProfNum, stuAffDepNum, stuName, stuSSNum, stuAddress, stuPhoneNum, stuEmail, curGrade, curSem)
values ('S002', 'P017', 'D013', 'Tony Stark', '940511-13746244', 'California', 01065472154, 'coolm@gmail.com', 4, 1);

insert
into Student(stuNum, chargeProfNum, stuAffDepNum, stuName, stuSSNum, stuAddress, stuPhoneNum, stuEmail, curGrade, curSem)
values ('S003', 'P008', 'D011', 'Pepper Potts', '000823-3098724', 'New York', 01036521454, 'meanc@naver.com	', 1, 1);

insert
into Student(stuNum, chargeProfNum, stuAffDepNum, stuName, stuSSNum, stuAddress, stuPhoneNum, stuEmail, curGrade, curSem)
values ('S004', 'P001', 'D001', 'Leon', '971225-2063472', 'Paris', 01021214788, 'jisol@gmail.com', 4, 1);

insert
into Student(stuNum, chargeProfNum, stuAffDepNum, stuName, stuSSNum, stuAddress, stuPhoneNum, stuEmail, curGrade, curSem)
values ('S005', 'P002', 'D015', 'Harry Potter', '960103-1212546', 'London', 01096326547, 'topash@gmail.com', 3, 1);

insert
into Student(stuNum, chargeProfNum, stuAffDepNum, stuName, stuSSNum, stuAddress, stuPhoneNum, stuEmail, curGrade, curSem)
values ('S006', 'P016', 'D004', 'Emma Watson', '951016-1102681', 'London', 01065137198, 'kihyun@naver.com', 4, 1);

insert
into Student(stuNum, chargeProfNum, stuAffDepNum, stuName, stuSSNum, stuAddress, stuPhoneNum, stuEmail, curGrade, curSem)
values ('S007', 'P001', 'D001', 'Roger Federer', '930330-2064213', 'Interlaken', 01033254544, 'sweetg@naver.com', 2, 1);

insert
into Student(stuNum, chargeProfNum, stuAffDepNum, stuName, stuSSNum, stuAddress, stuPhoneNum, stuEmail, curGrade, curSem)
values ('S008', 'P008', 'D011', 'Jungkook', '990617-1350915', 'Seoul', 01098665412, 'landsc@naver.com', 2, 1);

insert
into Student(stuNum, chargeProfNum, stuAffDepNum, stuName, stuSSNum, stuAddress, stuPhoneNum, stuEmail, curGrade, curSem)
values ('S009', 'P017', 'D013', 'Megan Fox', '960701-1164821', 'Texas', 01087852141, 'bellsto@naver.com', 2, 1);

insert
into Student(stuNum, chargeProfNum, stuAffDepNum, stuName, stuSSNum, stuAddress, stuPhoneNum, stuEmail, curGrade, curSem)
values ('S010', 'P001', 'D001', 'Michael Jordan', '961015-2034762', 'Busan', 01032596812, 'leadro@gmail.com', 4, 2);

insert
into Student(stuNum, chargeProfNum, stuAffDepNum, stuName, stuSSNum, stuAddress, stuPhoneNum, stuEmail, curGrade, curSem)
values ('S011', 'P020', 'D010', 'Michael Jackson', '990528-1320178', 'Seoul', 01032458713, 'sungjin@naver.com', 1, 1);

insert
into Student(stuNum, chargeProfNum, stuAffDepNum, stuName, stuSSNum, stuAddress, stuPhoneNum, stuEmail, curGrade, curSem)
values ('S012', 'P013', 'D002', 'Michael Owen', '000819-4347169', 'Liverpool', 01093558241, 'leesky@naver.com', 1, 1);

insert
into Student(stuNum, chargeProfNum, stuAffDepNum, stuName, stuSSNum, stuAddress, stuPhoneNum, stuEmail, curGrade, curSem)
values ('S013', 'P019', 'D014', 'Suhyun', '981209-2011451', 'Busan', 01013214655, 'yellow@naver.com', 3, 1);

insert
into Student(stuNum, chargeProfNum, stuAffDepNum, stuName, stuSSNum, stuAddress, stuPhoneNum, stuEmail, curGrade, curSem)
values ('S014', 'P011', 'D005', 'Peter Jackson', '940805-2164873', 'New York', 01088229974, 'yejin0@gamil.com', 4, 1);

insert
into Student(stuNum, chargeProfNum, stuAffDepNum, stuName, stuSSNum, stuAddress, stuPhoneNum, stuEmail, curGrade, curSem)
values ('S015', 'P009', 'D012', 'Sam Cook', '931107-1145321', 'California', 01032649766, 'upone@gmail.com', 4, 2);

insert
into Student(stuNum, chargeProfNum, stuAffDepNum, stuName, stuSSNum, stuAddress, stuPhoneNum, stuEmail, curGrade, curSem)
values ('S016', 'P007', 'D009', 'Anne Hathaway', '960718-2212039', 'New York', 01077841246, 'jesusl@gmail.com', 4, 1);

insert
into Student(stuNum, chargeProfNum, stuAffDepNum, stuName, stuSSNum, stuAddress, stuPhoneNum, stuEmail, curGrade, curSem)
values ('S017', 'P012', 'D003', 'Barbara Palvin', '940918-1382011', 'Budapest', 01096587215, 'winjin@naver.com', 4, 2);

insert
into Student(stuNum, chargeProfNum, stuAffDepNum, stuName, stuSSNum, stuAddress, stuPhoneNum, stuEmail, curGrade, curSem)
values ('S018', 'P018', 'D007', 'Bruce Wayne', '980120-2145701', 'New York', 01023245154, 'waterb@naver.com', 2, 1);

insert
into Student(stuNum, chargeProfNum, stuAffDepNum, stuName, stuSSNum, stuAddress, stuPhoneNum, stuEmail, curGrade, curSem)
values ('S019', 'P006', 'D008', 'Tom Hardy', '991130-13709414', 'Seoul', 01097554482, 'winch1@naver.com', 2, 1);

insert
into Student(stuNum, chargeProfNum, stuAffDepNum, stuName, stuSSNum, stuAddress, stuPhoneNum, stuEmail, curGrade, curSem)
values ('S020', 'P011', 'D005', 'Donald Trump', '000611-4312407', 'Seoul', 01063259764, 'wisdom@gmail.com', 1, 1);

CREATE TABLE Professor
(
    profNum varchar(5) NOT NULL,
    profAffDepNum varchar(5),
    profName varchar(20),
    profSSNum varchar(20),
    profAddress varchar(15),
    profPhoneNum integer,
    profEmail varchar(20),
    primary key(profNum)
);

insert
into Professor(profNum, profAffDepNum, profName, profSSNum, profAddress, profPhoneNum, profEmail)
values('P001', 'D001', 'Johannes Keppler', '591111-2234567', 'Busan', 01011115678, 'pts@sju.ac.kr');

insert
into Professor(profNum, profAffDepNum, profName, profSSNum, profAddress, profPhoneNum, profEmail)
values('P002', 'D015', 'Pierre Fermat', '721023-1323444', 'Paris', 01022225678, 'ayh@sju.ac.kr');

insert
into Professor(profNum, profAffDepNum, profName, profSSNum, profAddress, profPhoneNum, profEmail)
values('P003', 'D001', 'Issac Newton', '661023-1124990', 'London', 01033335678, 'sdi@sju.ac.kr');

insert
into Professor(profNum, profAffDepNum, profName, profSSNum, profAddress, profPhoneNum, profEmail)
values('P004', 'D002', 'Edmund Hally', '560212-1232345', 'Seoul', 01044445678, 'kyb@sju.ac.kr');

insert
into Professor(profNum, profAffDepNum, profName, profSSNum, profAddress, profPhoneNum, profEmail)
values('P005', 'D006', 'James Watt', '681218-2240101', 'London', 01055555678, 'lpo@sju.ac.kr');

insert
into Professor(profNum, profAffDepNum, profName, profSSNum, profAddress, profPhoneNum, profEmail)
values('P006', 'D008', 'Michael Jordan', '591010-1008181', 'Seoul', 01066665678, 'khg@sju.ac.kr');

insert
into Professor(profNum, profAffDepNum, profName, profSSNum, profAddress, profPhoneNum, profEmail)
values('P007', 'D009', 'Pepper Potts', '630515-1122456', 'Seoul', 01077775678, 'nsm@sju.ac.kr');

insert
into Professor(profNum, profAffDepNum, profName, profSSNum, profAddress, profPhoneNum, profEmail)
values('P008', 'D011', 'Edwin Hubble', '641212-1091010', 'California', 01088885678, 'kdn@sju.ac.kr');

insert
into Professor(profNum, profAffDepNum, profName, profSSNum, profAddress, profPhoneNum, profEmail)
values('P009', 'D012', 'John Wick', '660401-2014490', 'London', 01099995678, 'njc@sju.ac.kr');

insert
into Professor(profNum, profAffDepNum, profName, profSSNum, profAddress, profPhoneNum, profEmail)
values('P010', 'D015', 'Camila Cabello', '560410-1016677', 'Texas', 01000001234, 'ssh@sju.ac.kr');

insert
into Professor(profNum, profAffDepNum, profName, profSSNum, profAddress, profPhoneNum, profEmail)
values('P011', 'D005', 'Anne Marie', '661020-1020011', 'Incheon', 01011111234, 'pkh@sju.ac.kr');

insert
into Professor(profNum, profAffDepNum, profName, profSSNum, profAddress, profPhoneNum, profEmail)
values('P012', 'D003', 'Dua Lipa', '631112-1299010', 'Seoul', 01022221234, 'pwc@sju.ac.kr');

insert
into Professor(profNum, profAffDepNum, profName, profSSNum, profAddress, profPhoneNum, profEmail)
values('P013', 'D002', 'Cardi B', '550101-1002367', 'New York', 01033331234, 'ghj@sju.ac.kr');

insert
into Professor(profNum, profAffDepNum, profName, profSSNum, profAddress, profPhoneNum, profEmail)
values('P014', 'D001', 'Zara Larsson', '661111-1234409', 'Busan', 01044441234, 'jyg@sju.ac.kr');

insert
into Professor(profNum, profAffDepNum, profName, profSSNum, profAddress, profPhoneNum, profEmail)
values('P015', 'D003', 'Whitney Houston', '770910-1112345', 'California', 01055551234, 'gg@sju.ac.kr');

insert
into Professor(profNum, profAffDepNum, profName, profSSNum, profAddress, profPhoneNum, profEmail)
values('P016', 'D004', 'Donald Trump', '701212-1328746', 'New York',01087651247, 'msc@sju.ac.kr');

insert
into Professor(profNum, profAffDepNum, profName, profSSNum, profAddress, profPhoneNum, profEmail)
values('P017', 'D013', 'Marie Curie', '730514-1024511', 'Seoul', 01087651247, 'gschoi@sju.ac.kr');

insert
into Professor(profNum, profAffDepNum, profName, profSSNum, profAddress, profPhoneNum, profEmail)
values('P018', 'D007', 'Issac Newton', '650819-1032682', 'Busan', 01078945103, 'csyoon@sju.ac.kr');

insert
into Professor(profNum, profAffDepNum, profName, profSSNum, profAddress, profPhoneNum, profEmail)
values('P019', 'D014', 'James Stewart', '680710-2064521', 'London', 01099871355, 'msko@sju.ac.kr');

insert
into Professor(profNum, profAffDepNum, profName, profSSNum, profAddress, profPhoneNum, profEmail)
values('P020', 'D010', 'Bruce Wayne', '610907-1068714', 'New York', 01045136286, 'jshwang@sju.ac.kr');

CREATE TABLE Course
(
    courseNum varchar(5) NOT NULL,
    courseChargeProfNum varchar(5) NOT NULL,
    progressDepNum varchar(5),
    courseName varchar(25),
    receivedCredits integer,
    courseTime integer,
    lecRoom varchar(20),
    primary key(courseNum,courseChargeProfNum)
);

insert
into Course(courseNum, courseChargeProfNum, progressDepNum, courseName, receivedCredits, courseTime, lecRoom)
values ('C001', 'P011', 'D001', 'Engineering Mathmatics', 3, 2, 'SEN101');

insert
into Course(courseNum, courseChargeProfNum, progressDepNum, courseName, receivedCredits, courseTime, lecRoom)
values ('C002', 'P002', 'D015', 'Dental Hygienics ', 4, 2, 'YUL101');

insert
into Course(courseNum, courseChargeProfNum, progressDepNum, courseName, receivedCredits, courseTime, lecRoom)
values ('C003', 'P003', 'D008', 'Python', 3, 2, 'SEN209');

insert
into Course(courseNum, courseChargeProfNum, progressDepNum, courseName, receivedCredits, courseTime, lecRoom)
values ('C004', 'P001', 'D013', 'C language', 3, 2, 'SEN209');

insert
into Course(courseNum, courseChargeProfNum, progressDepNum, courseName, receivedCredits, courseTime, lecRoom)
values ('C005', 'P010', 'D015', 'Dental Hygienics', 3, 2, 'YUL101');

insert
into Course(courseNum, courseChargeProfNum, progressDepNum, courseName, receivedCredits, courseTime, lecRoom)
values ('C006', 'P007', 'D001', 'Engineering Mathmatics', 3, 3, 'SEN101');

insert
into Course(courseNum, courseChargeProfNum, progressDepNum, courseName, receivedCredits, courseTime, lecRoom)
values ('C007', 'P001', 'D007', 'C language', 3, 2, 'SEN202');

insert
into Course(courseNum, courseChargeProfNum, progressDepNum, courseName, receivedCredits, courseTime, lecRoom)
values ('C008', 'P010', 'D003', 'Biology', 3, 3, 'CHU101');

insert
into Course(courseNum, courseChargeProfNum, progressDepNum, courseName, receivedCredits, courseTime, lecRoom)
values ('C009', 'P009', 'D009', 'Discrete Mathmatics', 3, 4, 'SEN101');

insert
into Course(courseNum, courseChargeProfNum, progressDepNum, courseName, receivedCredits, courseTime, lecRoom)
values ('C010', 'P005', 'D010', 'Organic Chemistry', 4, 4, 'CHU202');

insert
into Course(courseNum, courseChargeProfNum, progressDepNum, courseName, receivedCredits, courseTime, lecRoom)
values ('C011', 'P004', 'D010', 'Engineering Mathmatics', 3, 3, 'SEN101');

insert
into Course(courseNum, courseChargeProfNum, progressDepNum, courseName, receivedCredits, courseTime, lecRoom)
values ('C012', 'P001', 'D012', 'C Language', 3, 2, 'SEN209');

insert
into Course(courseNum, courseChargeProfNum, progressDepNum, courseName, receivedCredits, courseTime, lecRoom)
values ('C013', 'P006', 'D013', 'Engineering Mathmatics', 3, 3, 'SEN101');

insert
into Course(courseNum, courseChargeProfNum, progressDepNum, courseName, receivedCredits, courseTime, lecRoom)
values ('C014', 'P008', 'D011', 'Color Psycology', 1, 1, 'KUN101');

insert
into Course(courseNum, courseChargeProfNum, progressDepNum, courseName, receivedCredits, courseTime, lecRoom)
values ('C015', 'P012', 'D003', 'Urban Planning', 2, 2, 'CHU202');

CREATE TABLE Department
(
    depNum varchar(5) NOT NULL,
    depName varchar(25),
    depPhoneNum integer,
    primary key(depNum)
);

insert
into Department(depNum, depName, depPhoneNum)
values ('D001', 'Computer Engineering', 0234083321);

insert
into Department(depNum, depName, depPhoneNum)
values ('D002', 'Architectural Engineering', 0234083323);

insert
into Department(depNum, depName, depPhoneNum)
values ('D003', 'Landscape Architecture', 0234083326);

insert
into Department(depNum, depName, depPhoneNum)
values ('D004', 'Ocean Engineering', 0234083330);

insert
into Department(depNum, depName, depPhoneNum)
values ('D005', 'Mechanical Engineering', 0234083348);

insert
into Department(depNum, depName, depPhoneNum)
values ('D006', 'New Materials Engineering', 0234084012);

insert
into Department(depNum, depName, depPhoneNum)
values ('D007', 'Electrical Engineering', 0234084028);

insert
into Department(depNum, depName, depPhoneNum)
values ('D008', 'Electronic Engineering', 0234084079);

insert
into Department(depNum, depName, depPhoneNum)
values ('D009', 'Energy Engineering', 0234084091);

insert
into Department(depNum, depName, depPhoneNum)
values ('D010', 'Chemical Engineering', 0234084130);

insert
into Department(depNum, depName, depPhoneNum)
values ('D011', 'Early Childhood Education', 0234085412);

insert
into Department(depNum, depName, depPhoneNum)
values ('D012', 'Business Administration', 0234085440);

insert
into Department(depNum, depName, depPhoneNum)
values ('D013', 'Economics', 0234085467);

insert
into Department(depNum, depName, depPhoneNum)
values ('D014', 'Industrial Design', 0234085480);

insert
into Department(depNum, depName, depPhoneNum)
values ('D015', 'Dental Hygiene', 0234087000);

CREATE TABLE Attend
(
    attendStuNum varchar(5) NOT NULL,
    attendCourseNum varchar(5) NOT NULL,
    attendProfNum varchar(5) NOT NULL,
    attendanceScore integer,
    midScore integer,
    finScore integer,
    etcScore integer,
    totalScore integer,
    grade varchar(5),
    primary key(attendStuNum, attendCourseNum, attendProfNum)
);

insert
into Attend(attendStuNum, attendCourseNum, attendProfNum, attendanceScore, midScore, finScore, etcScore, totalScore, grade)
values ('S002', 'C013', 'P006', 10, 100, 100, 10, 95, 'A');

insert
into Attend(attendStuNum, attendCourseNum, attendProfNum, attendanceScore, midScore, finScore, etcScore, totalScore, grade)
values ('S002', 'C010', 'P005', 0, 0, 0, 0, 0, 'F');

insert
into Attend(attendStuNum, attendCourseNum, attendProfNum, attendanceScore, midScore, finScore, etcScore, totalScore, grade)
values ('S004', 'C012', 'P001', 8, 70, 90, 10, 80, 'A');

insert
into Attend(attendStuNum, attendCourseNum, attendProfNum, attendanceScore, midScore, finScore, etcScore, totalScore, grade)
values ('S004', 'C003', 'P003', 0, 10, 30, 2, 10, 'F');

insert
into Attend(attendStuNum, attendCourseNum, attendProfNum, attendanceScore, midScore, finScore, etcScore, totalScore, grade)
values ('S004', 'C009', 'P009', 10, 80, 90, 10, 90, 'A');

insert
into Attend(attendStuNum, attendCourseNum, attendProfNum, attendanceScore, midScore, finScore, etcScore, totalScore, grade)
values ('S004', 'C006', 'P007', 10, 80, 80, 8, 80, 'B');

insert
into Attend(attendStuNum, attendCourseNum, attendProfNum, attendanceScore, midScore, finScore, etcScore, totalScore, grade)
values ('S005', 'C005', 'P010', 10, 50, 60, 10, 55, 'B');

insert
into Attend(attendStuNum, attendCourseNum, attendProfNum, attendanceScore, midScore, finScore, etcScore, totalScore, grade)
values ('S007', 'C012', 'P001', 10, 30, 30, 10, 30, 'C');

insert
into Attend(attendStuNum, attendCourseNum, attendProfNum, attendanceScore, midScore, finScore, etcScore, totalScore, grade)
values ('S008', 'C014', 'P008', 6, 30, 30, 10, 40, 'C');

insert
into Attend(attendStuNum, attendCourseNum, attendProfNum, attendanceScore, midScore, finScore, etcScore, totalScore, grade)
values ('S009', 'C004', 'P001', 10, 20, 30, 0, 20, 'C');

insert
into Attend(attendStuNum, attendCourseNum, attendProfNum, attendanceScore, midScore, finScore, etcScore, totalScore, grade)
values ('S010', 'C006', 'P007', 10, 60, 60, 10, 60, 'B');

insert
into Attend(attendStuNum, attendCourseNum, attendProfNum, attendanceScore, midScore, finScore, etcScore, totalScore, grade)
values ('S011', 'C010', 'P005', 2, 10, 0, 0, 5, 'F');

insert
into Attend(attendStuNum, attendCourseNum, attendProfNum, attendanceScore, midScore, finScore, etcScore, totalScore, grade)
values ('S011', 'C011', 'P004', 4, 10, 20, 10, 40, 'C');

insert
into Attend(attendStuNum, attendCourseNum, attendProfNum, attendanceScore, midScore, finScore, etcScore, totalScore, grade)
values ('S013', 'C015', 'P012', 10, 20, 30, 4, 20, 'C');

insert
into Attend(attendStuNum, attendCourseNum, attendProfNum, attendanceScore, midScore, finScore, etcScore, totalScore, grade)
values ('S013', 'C011', 'P004', 10, 80, 50, 4, 50, 'B');

ALTER TABLE Student ADD constraint Student_stuAffNum_fk foreign key (stuAffDepNum) references Department(depNum);
ALTER TABLE Student ADD constraint Student_chargeProfNum_fk foreign key (chargeProfNum) references Professor(profNum);
ALTER TABLE Professor ADD constraint Professor_profAffDepNum_fk foreign key (profAffDepNum) references Department(depNum);
ALTER TABLE Course ADD constraint Course_courseChargeProNum_fk foreign key (courseChargeProfNum) references Professor(profNum);	 	
ALTER TABLE Course ADD constraint Course_progressDepNum_fk foreign key (progessDepNum) references Department(depNum);
ALTER TABLE Attend ADD constraint Attend_attendStuNum_fk foreign key (attendStuNum) references Student(stuNum);
ALTER TABLE Attend ADD constraint Attend_attendCourseNum_fk foreign key (attendCourseNum) references Course(courseNum);
ALTER TABLE Attend ADD constraint Attend_attendProfNum_fk foreign key (attendProfNum) references Professor(ProfNum);
