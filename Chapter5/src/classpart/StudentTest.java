package classpart;

public class StudentTest {
	

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
	
//	System.out.println(studentChoi);
}

}

 

	

					