package izone;

public class NameSaver {

 String studentName;

		
public String getStudentName(){
	
	return studentName;
	
}
	

		public void setStudentName(String name) {
			studentName=name;
			
		}
		   public static void main(String[] args) {
			   
			   NameSaver member = new NameSaver();
			  member.studentName="��ä��";
					  
			System.out.println(member.studentName);
			   
		   }

	

}