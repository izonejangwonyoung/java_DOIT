package izone;

public class NameSaver {

 String studentName;
 String birthDay;
		
public String getStudentName(){
	
	return studentName;
	
}
	

		public String getBirthDay() {
	return birthDay;
}


public void setBirthDay(String birthDay) {
	this.birthDay = birthDay;
}


		public void setStudentName(String name) {
			studentName=name;
			
		}
		   public static void main(String[] args) {
			   
			   NameSaver member1 = new NameSaver();
			  member1.studentName="김채원";
			  member1.birthDay="2000/08/01";
					  
			System.out.println(member1.studentName);
			System.out.println(member1.birthDay);
			   
			NameSaver member2 =new NameSaver();
			member2.studentName="최예나";
			member2.birthDay="1999/09/29";
				
			System.out.println(member2.studentName);
			System.out.println(member2.birthDay);
			   
		   }

	

}