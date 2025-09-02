class Student{
	int rollNo;
	String name;
	int marks;
	
	Student(int rollNo, String name, int marks){
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	void setMarks(int marks){
		this.marks = marks;
	}
	
	int getMarks(){
		return marks;
	}
	
	String calculateGrade(){
		if(marks >= 80){
			return "A";
		}else if(marks >= 60){
			return "B";
		}else if(marks >= 40){
			return "C";
		}else{
			return "Fail";
		}
	}
	
	void studentDetails(){
		System.out.println("RollNo: "+rollNo+", Name: "+name+", marks: "+marks+ ",Grade: "+calculateGrade());
	}
}
public class StudentGradeCalculator{
	public static void main(String[] args){
		Student s1 = new Student(1,"Komal",80);
		Student s2 = new Student(2,"Neha", 65);
		
		s1.studentDetails();
		s2.studentDetails();
	}
}