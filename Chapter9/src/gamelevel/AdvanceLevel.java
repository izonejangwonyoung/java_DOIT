package gamelevel;

public class AdvanceLevel extends PlayerLevel{

	
	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");

	}

	@Override
	public void jump() {
		System.out.println("�ϴ� ���� �����մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println(" ������ ������ ��ȯ�մϴ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("******Platinum�����Դϴ�******");
	}
}
