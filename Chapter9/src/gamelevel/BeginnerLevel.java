package gamelevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� ���� ������ �� �����ϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("��ø���� ���� ������ȯ�� �Ұ��մϴ�.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("******Rookie�����Դϴ�******");
	}

}
