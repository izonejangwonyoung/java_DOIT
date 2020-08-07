package reference;

public class studentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student studentwonyoung =new Student(98,"장원영");
 studentwonyoung.setkorean("국어", 100);
 studentwonyoung.setmath("수학", 100);

 Student studentchaewon =new Student(101,"김채원");
 studentchaewon.setkorean("국어", 65);
 studentchaewon.setmath("수학", 55);
 
 
 studentwonyoung.showStudentInfo();
 studentchaewon.showStudentInfo();
	}

}
