package reference;

public class studentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student studentwonyoung =new Student(98,"�����");
 studentwonyoung.setkorean("����", 100);
 studentwonyoung.setmath("����", 100);

 Student studentchaewon =new Student(101,"��ä��");
 studentchaewon.setkorean("����", 65);
 studentchaewon.setmath("����", 55);
 
 
 studentwonyoung.showStudentInfo();
 studentchaewon.showStudentInfo();
	}

}
