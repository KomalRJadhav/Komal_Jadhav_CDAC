class Student{
	String name;
	String className;
	
	static{
		System.out.println("School tuition fee initialized: 30000");
	}
	
	Student(String name, String className){
		this.name = name;
		this.className = className;
	}
	
	void setName(String name){
		this.name = name;
	}
	
	String getName(){
		return name;
	}
	
	void setClassName(String className){
		this.className = className;
	}
	
	String getClassName(){
		return className;
	}
	
	void displayDetails(){
		System.out.println("Name: "+name+",Class: "+ className+",Tuition Fee = 30000");
	}
	
	
}
public class StudentMain{
	public static void main(String[] args){
		Student student1 = new Student("Anjali","10th");
		Student student2 = new Student("Vikram","12th");
		
		student1.displayDetails();
		student2.displayDetails();
		
	}
}