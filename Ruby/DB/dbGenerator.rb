=begin
Joel Burdette
Dr. Rouse
Database Management
Database Generator
10/9/15
=end

myFile = File.new("myFile.sql", "w+")
array = File.readlines("information.txt")
table = String.new
array.each do |line|
data = line.split

  if data == []
    myFile.write('')
  elsif data == ["Class"]
    myFile.write("DROP TABLE IF EXISTS #{data[0]}; \n \n CREATE TABLE #{data[0]} ( \n")
    myFile.write("classNumber VARCHAR(8) PRIMARY KEY, facId VARCHAR(6), schedule VARCHAR(8), room VARCHAR(6), CONSTRAINT Class_facId_fk FOREIGN KEY (facId) REFERENCES Faculty (facId), CONSTRAINT Class_schedule_room_uk UNIQUE (schedule, room)); \n \n")
    table = data[0]
  elsif data == ["Enroll"]
    myFile.write("DROP TABLE IF EXISTS #{data[0]}; \n \n CREATE TABLE #{data[0]} ( \n")
    myFile.write("stuId VARCHAR(6), classNumber VARCHAR(8), grade VARCHAR(2), room VARCHAR(6), CONSTRAINT Enroll_classNumber_studId_pk PRIMARY KEY (classNumber,stuId), CONSTRAINT Enroll_classNumber_fk FOREIGN KEY (classNumber) REFERENCES Class (classNumber) ON DELETE CASCADE, CONSTRAINT Enroll_stuId_fk FOREIGN KEY (stuId) REFERENCES Student (stuId) ON DELETE CASCADE); \n \n")
    table = data[0]
  elsif data == ["Faculty"]
    myFile.write("DROP TABLE IF EXISTS #{data[0]}; \n \n CREATE TABLE #{data[0]} ( \n")
    myFile.write("facId VARCHAR(6) PRIMARY KEY, name VARCHAR(20) NOT NULL, department VARCHAR(20),rank VARCHAR(10)); \n \n")
    table = data[0]
  elsif data == ["Student"]
    myFile.write("DROP TABLE IF EXISTS #{data[0]}; \n \n CREATE TABLE #{data[0]} ( \n")
    myFile.write("stuId VARCHAR(6) PRIMARY KEY, lastName VARCHAR(20) NOT NULL, firstName VARCHAR(20) NOT NULL, major VARCHAR(10), credits INT(3) DEFAULT \"0\", CONSTRAINT Student_credits_cc CHECK ((credits >=0) AND (credits < 150))); \n \n")
    table = data[0]
  else
    if table == "Class"
      myFile.write("INSERT INTO #{table} (classNumber, facId, schedule, room) VALUES(\'#{data[0]}\', \'#{data[1]}\', \'#{data[2]}\', \'#{data[3]}\');")
      myFile.write("\n")
    elsif table == "Enroll"
      myFile.write("INSERT INTO #{table} (stuId, classNumber, grade) VALUES(\'#{data[0]}\', \'#{data[1]}\', \'#{data[2]}\');")
      myFile.write("\n")
    elsif table == "Faculty"
      myFile.write("INSERT INTO #{table} (facId, name, department, rank) VALUES(\'#{data[0]}\', \'#{data[1]}\', \'#{data[2]}\', \'#{data[3]}\');")
      myFile.write("\n")
    elsif table == "Student"
      myFile.write("INSERT INTO #{table} (stuId, lastName, firstName, major, credits) VALUES(\'#{data[0]}\', \'#{data[1]}\', \'#{data[2]}\', \'#{data[3]}\', #{data[4]}\');")
      myFile.write("\n")
    end
  end
end
myFile.close
puts "All done!"
