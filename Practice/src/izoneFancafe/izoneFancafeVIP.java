package izoneFancafe;

public class izoneFancafeVIP extends FancafeMember{

	
//	private int age;
//	private String nickname;
//	private String rank;
//	private String habitation;
//	int bonusPoint;
//	double bonusPointRatio;
	///FOR VIP///
	private int adviserID;
	double bonusRatio;
	double saleRatio;
	
	
	public izoneFancafeVIP() {
		rank="VIP";
		bonusRatio=0.1;
		saleRatio=0.2;
	}

	public int calcPrice(int price) {
		bonusPoint +=price*bonusPointRatio;
		return price-(int)(price*saleRatio);

	}

	public int getAdviserID() {
		return adviserID;
	}

	public String showCafeMemberInfo() {
		return nickname+ "님의 등급은 " +rank+ "이며, 보너스 포인트는 " +bonusPoint+ "입니다. 연령은 "+age+"세이며, 배송지는 "+habitation+"입니다";

		
	}

}
