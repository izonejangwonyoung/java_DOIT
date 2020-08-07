package reference;

public class Student {


		int studentID;
		String studentName;
		Subject korean;
		Subject math;
		
		public Student() {
			
			korean= new Subject();
			math= new Subject();
		}
		public Student(int id,String name) {
			studentID=id;
			studentName=name;
			

			korean= new Subject();
			math= new Subject();
			
		}
		public void setkorean(String name, int score) {
			
			korean.setSubjectName(name);
			korean.setScore(score);
			
		}
		public void setmath(String name, int score) {
			
			math.setSubjectName(name);
			math.setScore(score);
			
		}
		
		public void showStudentInfo() {
			
			int total=korean.getScore()+math.getScore();
			System.out.println(studentName +" �л��� ������ "+total+"���Դϴ�");
		}
}
