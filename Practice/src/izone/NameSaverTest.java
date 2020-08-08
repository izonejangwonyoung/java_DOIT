package izone;

public class NameSaverTest {
	
	
	public static void main(String[] args) {
		NameSaver memberJang=new NameSaver();
		memberJang.name="장원영";
		memberJang.gender="female";
		memberJang.age=17;
		memberJang.birth="2004";
		
		@SuppressWarnings("unused")
		NameSaver memberChoi=new NameSaver("최예나","female",22,"1999");
			System.out.println(memberChoi.gender);
	}
 
}
