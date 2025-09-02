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
	
	void studentDetails(){
		System.out.println("RollNo: "+rollNo+", Name: "+name+", marks: "+marks);
	}
}
public class MainStudent{
	public static void main(String[] args){
		Student s1 = new Student(1,"Komal",35);
		Student s2 = new Student(2,"Neha", 55);
		
		s1.studentDetails();
		
		s1.setMarks(40);
		
		s1.studentDetails();
	}
}