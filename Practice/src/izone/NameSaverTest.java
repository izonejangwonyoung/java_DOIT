package izone;

public class NameSaverTest {
	
	
	public static void main(String[] args) {
		NameSaver memberJang=new NameSaver();
		memberJang.name="�����";
		memberJang.gender="female";
		memberJang.age=17;
		memberJang.birth="2004";
		
		@SuppressWarnings("unused")
		NameSaver memberChoi=new NameSaver("�ֿ���","female",22,"1999");
			System.out.println(memberChoi.gender);
	}
 
}
