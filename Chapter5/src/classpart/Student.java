package classpart;

public class Student {
	
	int StudentID;

String StudentName;
int grade;
String address;

public void showStudentInfor() {
	System.out.println(StudentName+","+address+","+StudentID);
}

public String getStudentName() {
	return  StudentName;
}

public void setStudentName(String name) {

}

public static void main(String[] args) {
	
	Student studentLee=new Student();
	studentLee.StudentName="��ä��";
	studentLee.StudentID=801;
	studentLee.address="�������";
	
	Student studentChoi=new Student();
	studentChoi.StudentName="�ֿ���";
	studentChoi.StudentID=627;
	studentChoi.address="�������";	
	
	studentChoi.showStudentInfor();
	studentLee.showStudentInfor();
}


//public static void main(String[] args) {
//	
//	Student studentLee=new Student();
//	studentLee.address ="�������";
//	studentLee.StudentName="�����";
//			
//	studentLee.showStudentInfor(); 
//	}
					
 }

	

					