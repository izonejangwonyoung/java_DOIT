package izoneFancafe;

public class FancafeMemberTest1 {

	public static void main(String[] args) {

		FancafeMember member1 = new FancafeMember();
		member1.setAge(25);
		member1.setHabitation("toronto");
		member1.setNickname("조유리");
		member1.bonusPoint=1000;
		
		System.out.println(member1.showCafeMemberInfo());
	
		
		FancafeMember member2 = new FancafeMember();
		member2.setAge(12);
		member2.setHabitation("구리시");
		member2.setNickname("장원영");
		member2.bonusPoint=3000;
		
		System.out.println(member2.showCafeMemberInfo());
	}

}
