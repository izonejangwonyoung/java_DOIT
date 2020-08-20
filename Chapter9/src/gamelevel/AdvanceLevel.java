package gamelevel;

public class AdvanceLevel extends PlayerLevel{

	
	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");

	}

	@Override
	public void jump() {
		System.out.println("하늘 높이 점프합니다.");
	}

	@Override
	public void turn() {
		System.out.println(" 빠르게 방향을 전환합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("******Platinum레벨입니다******");
	}
}
