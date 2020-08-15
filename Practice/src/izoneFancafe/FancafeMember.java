package izoneFancafe;

public class FancafeMember {

	
	private int age;
	private String nickname;
	private String rank;
	private String habitation;
	int bonusPoint;
	double bonusPointRatio;
	public FancafeMember() {
		rank="bronze";
		bonusPointRatio=0.05;
	}
	
	public int calcprice(int price) {
		bonusPoint +=price*bonusPointRatio;
		return price;
	}
	
	public String showCafeMemberInfo() {
		return nickname+ "님의 등급은" +rank+ "이며, 보너스 포인트는" +bonusPoint+ "입니다.";
		
	}
}
