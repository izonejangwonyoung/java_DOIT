package classpart;

public class Student {
	
	int StudentID;

String StudentName;
int grade;
String address;

public void showStudentInfor() {
	System.out.println(StudentName+","+address);
}
public static void main(String[] args) {
	
	Student studentLee=new Student();
	studentLee.address ="�������";
	studentLee.StudentName="�����";
			
	studentLee.showStudentInfor(); 
	}
					
 }

	

					