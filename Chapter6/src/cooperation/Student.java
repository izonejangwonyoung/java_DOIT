package cooperation;

public class Student {
	String StudentName;
	int grade;
	int money;
	
	public Student(String studentName,int money) {
		this.StudentName=studentName;
		this.money=money;
	}
	
	public void takeBus(Bus bus) {
		
		
		bus.take(1250);
		money -=1250;
	} 
	
	public void showInfo() {
		System.out.println(StudentName+" ´ÔÀÇ ÀÜ¾×Àº "+money+"¿ø ÀÔ´Ï´Ù.");
		
		
	}
	
	
}
