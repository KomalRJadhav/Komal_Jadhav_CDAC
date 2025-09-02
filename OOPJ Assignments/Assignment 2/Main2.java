class Student{
	String name;
	int marks;
	static int totalStudents;
	
	Student(String name, int marks){
		this.name = name;
		this.marks = marks;
		totalStudents++;
	}
	
	void setMarks(int marks){
		this.marks = marks;
	}
	
	int getMarks(){
		return marks;
	}
	
	boolean isPassed(){
		if(marks >= 35){
			return true;
		}
			
		return false;	
	}
	
	static void showTotalStudents(){
		System.out.println("Total students: "+totalStudents);
	}
}
public class Main2{
	public static void main(String[] args){
		Student student1 = new Student("Rahul",78);
		Student student2 = new Student("Pooja",34);
		Student student3 = new Student("Amit",65);
		
		System.out.println("Student Rahul passed: "+student1.isPassed());
		System.out.println("Student Pooja passed: "+student2.isPassed());
		System.out.println("Student Amit passed: "+student3.isPassed());
		
		Student.showTotalStudents();
	}
}