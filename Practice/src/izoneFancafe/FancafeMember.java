package izoneFancafe;

public class FancafeMember {

	
	protected int age;
	protected String nickname;
	protected String rank;
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getHabitation() {
		return habitation;
	}

	public void setHabitation(String habitation) {
		this.habitation = habitation;
	}

	protected String habitation;
	int bonusPoint;
	double bonusPointRatio;
	public FancafeMember() {
		rank="bronze";
		bonusPointRatio=0.05;
		System.out.println("FancafeMember() ������ ȣ��");
	}
	
	public int calcprice(int price) {
		bonusPoint +=price*bonusPointRatio;
		return price;
	}
	
	public String showCafeMemberInfo() {
		return nickname+ "���� ����� " +rank+ "�̸�, ���ʽ� ����Ʈ�� " +bonusPoint+ "�Դϴ�. ������ "+age+"���̸�, ������� "+habitation+"�Դϴ�";
		
	}
}
