DROP TABLE IF EXISTS Class; 
 
 CREATE TABLE Class ( 
classNumber VARCHAR(8) PRIMARY KEY, facId VARCHAR(6), schedule VARCHAR(8), room VARCHAR(6), CONSTRAINT Class_facId_fk FOREIGN KEY (facId) REFERENCES Faculty (facId), CONSTRAINT Class_schedule_room_uk UNIQUE (schedule, room)); 
 
INSERT INTO Class (classNumber, facId, schedule, room) VALUES('ART106B', 'F134', 'TuThF3', 'H221');
INSERT INTO Class (classNumber, facId, schedule, room) VALUES('BUS111', 'F108', 'TuTh8', 'B101');
INSERT INTO Class (classNumber, facId, schedule, room) VALUES('CSC222', 'F107', 'MWF12', 'C202');
INSERT INTO Class (classNumber, facId, schedule, room) VALUES('GRE101A', 'F202', 'TuTh12', 'L140');
INSERT INTO Class (classNumber, facId, schedule, room) VALUES('HST303B', 'F134', 'MWF3', 'H225');
INSERT INTO Class (classNumber, facId, schedule, room) VALUES('JUG203B', 'F100', 'TuTh4', 'O107');
INSERT INTO Class (classNumber, facId, schedule, room) VALUES('KNV101A', 'F100', 'MWF9', 'O201');
INSERT INTO Class (classNumber, facId, schedule, room) VALUES('ME203A', 'F501', 'MWF8', 'H221');
INSERT INTO Class (classNumber, facId, schedule, room) VALUES('ME401A', 'F501', 'TuTh11', 'M110');
INSERT INTO Class (classNumber, facId, schedule, room) VALUES('MTH104A', 'F107', 'TuTh3', 'H223');
INSERT INTO Class (classNumber, facId, schedule, room) VALUES('MTH105C', 'F107', 'MWF3', 'M110');
INSERT INTO Class (classNumber, facId, schedule, room) VALUES('MTH301A', 'F201', 'MWF9', 'H103');
DROP TABLE IF EXISTS Enroll; 
 
 CREATE TABLE Enroll ( 
stuId VARCHAR(6), classNumber VARCHAR(8), grade VARCHAR(2), room VARCHAR(6), CONSTRAINT Enroll_classNumber_studId_pk PRIMARY KEY (classNumber,stuId), CONSTRAINT Enroll_classNumber_fk FOREIGN KEY (classNumber) REFERENCES Class (classNumber) ON DELETE CASCADE, CONSTRAINT Enroll_stuId_fk FOREIGN KEY (stuId) REFERENCES Student (stuId) ON DELETE CASCADE); 
 
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S1009', 'ART103A', 'A');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S2037', 'ART103A', 'A');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S9101', 'ART106B', 'B');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S0003', 'AXE302A', 'A');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S3002', 'BUS111', 'B');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S1017', 'CSC201A', 'A');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S2035', 'CSC201A', 'B');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S2036', 'CSC201A', 'A');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S2037', 'CSC201A', 'B');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S2036', 'CSC203A', 'A');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S3003', 'CSC222', 'A');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S3005', 'CSC222', 'D');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S2035', 'GRE101A', 'A');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S1234', 'HST303B', 'A');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S5678', 'HST303B', 'A');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S0001', 'JUG203B', 'B');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S0002', 'JUG203B', 'A');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S0003', 'JUG203B', 'C');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S0001', 'KNV101A', 'D');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S0002', 'KNV101A', 'A');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S2001', 'ME203A', 'A');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S2005', 'ME203A', 'B');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S2002', 'ME401A', 'C');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S2037', 'MTH103C', 'C');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S1017', 'MTH104A', 'B');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S2035', 'MTH301A', 'B');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S2036', 'MTH301A', 'A');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S0002', 'SRT101C', 'A');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S0003', 'SRT101C', 'B');
INSERT INTO Enroll (stuId, classNumber, grade) VALUES('S0001', 'SWD101A', 'A');
DROP TABLE IF EXISTS Faculty; 
 
 CREATE TABLE Faculty ( 
facId VARCHAR(6) PRIMARY KEY, name VARCHAR(20) NOT NULL, department VARCHAR(20),rank VARCHAR(10)); 
 
INSERT INTO Faculty (facId, name, department, rank) VALUES('F100', 'Thomdril', 'Gleeman', 'Master');
INSERT INTO Faculty (facId, name, department, rank) VALUES('F134', 'Teevis', 'History', 'Professor');
INSERT INTO Faculty (facId, name, department, rank) VALUES('F201', 'Rouse', 'CSC', 'Professor');
INSERT INTO Faculty (facId, name, department, rank) VALUES('F501', 'Strouse', 'ME', 'Professor');
INSERT INTO Faculty (facId, name, department, rank) VALUES('F701', 'Knouse', 'Math', 'Professor');
DROP TABLE IF EXISTS Student; 
 
 CREATE TABLE Student ( 
stuId VARCHAR(6) PRIMARY KEY, lastName VARCHAR(20) NOT NULL, firstName VARCHAR(20) NOT NULL, major VARCHAR(10), credits INT(3) DEFAULT "0", CONSTRAINT Student_credits_cc CHECK ((credits >=0) AND (credits < 150))); 
 
INSERT INTO Student (stuId, lastName, firstName, major, credits) VALUES('S0001', 'alThor', 'Rand', 'Taveren', 103');
INSERT INTO Student (stuId, lastName, firstName, major, credits) VALUES('S0002', 'Cauthon', 'Matrim', 'Taveren', 87');
INSERT INTO Student (stuId, lastName, firstName, major, credits) VALUES('S0003', 'Aybara', 'Perrin', 'Taveren', 43');
INSERT INTO Student (stuId, lastName, firstName, major, credits) VALUES('S1003', 'Benthusen', 'Trevor', 'Math', 133');
INSERT INTO Student (stuId, lastName, firstName, major, credits) VALUES('S1009', 'Summers', 'Brittney', 'Art', 24');
INSERT INTO Student (stuId, lastName, firstName, major, credits) VALUES('S1017', 'Ramirez', 'Alejandro', 'CSC', 129');
INSERT INTO Student (stuId, lastName, firstName, major, credits) VALUES('S1234', 'Polk', 'DeWae', 'CSC', 12');
INSERT INTO Student (stuId, lastName, firstName, major, credits) VALUES('S2001', 'Dowl', 'Bob', 'History', 95');
INSERT INTO Student (stuId, lastName, firstName, major, credits) VALUES('S2002', 'Wallis', 'Arthur', 'Math', 36');
INSERT INTO Student (stuId, lastName, firstName, major, credits) VALUES('S2005', 'Dunnum', 'Olivea', 'History', 32');
INSERT INTO Student (stuId, lastName, firstName, major, credits) VALUES('S2035', 'Charney', 'Bob', 'CSC', 120');
INSERT INTO Student (stuId, lastName, firstName, major, credits) VALUES('S2036', 'Shennum', 'Micah', 'CSC', 120');
INSERT INTO Student (stuId, lastName, firstName, major, credits) VALUES('S2037', 'Lynch', 'Dave', 'DSTC', 90');
INSERT INTO Student (stuId, lastName, firstName, major, credits) VALUES('S3002', 'Jones', 'John', 'Business', 59');
INSERT INTO Student (stuId, lastName, firstName, major, credits) VALUES('S3003', 'Smith', 'Sean', 'CSC', 85');
INSERT INTO Student (stuId, lastName, firstName, major, credits) VALUES('S3005', 'Evans', 'Ellen', 'Math', 27');
INSERT INTO Student (stuId, lastName, firstName, major, credits) VALUES('S5678', 'Sulek', 'Kyle', 'Art', 0');
INSERT INTO Student (stuId, lastName, firstName, major, credits) VALUES('S9101', 'Day', 'Christy', 'Math', 135');
