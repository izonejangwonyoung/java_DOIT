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
	studentLee.StudentName="김채원";
	studentLee.StudentID=801;
	studentLee.address="아이즈원";
	
	Student studentChoi=new Student();
	studentChoi.StudentName="최예나";
	studentChoi.StudentID=627;
	studentChoi.address="아이즈원";	
	
	studentChoi.showStudentInfor();
	studentLee.showStudentInfor();
}


//public static void main(String[] args) {
//	
//	Student studentLee=new Student();
//	studentLee.address ="아이즈원";
//	studentLee.StudentName="장원영";
//			
//	studentLee.showStudentInfor(); 
//	}
					
 }

	

					