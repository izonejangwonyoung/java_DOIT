package gamelevel;

public class SuperLevel extends PlayerLevel{
	public void run() {
		System.out.println("�������� ������ �޸��ϴ�.");

	}

	@Override
	public void jump() {
		System.out.println("������ ����� ������ �մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("�������� ������ ������ ��ȯ�մϴ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("******Challenger�����Դϴ�******");
	}
}
