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
		return nickname+ "���� ����� " +rank+ "�̸�, ���ʽ� ����Ʈ�� " +bonusPoint+ "�Դϴ�. ������ "+age+"���̸�, ������� "+habitation+"�Դϴ�";

		
	}

}
