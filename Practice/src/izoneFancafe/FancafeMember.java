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
		return nickname+ "���� �����" +rank+ "�̸�, ���ʽ� ����Ʈ��" +bonusPoint+ "�Դϴ�.";
		
	}
}
