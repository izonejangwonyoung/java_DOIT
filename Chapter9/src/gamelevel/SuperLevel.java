package gamelevel;

public class SuperLevel extends PlayerLevel{
	public void run() {
		System.out.println("누구보다 빠르게 달립니다.");

	}

	@Override
	public void jump() {
		System.out.println("비행기와 어깨를 나란히 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("누구보다 빠르게 방향을 전환합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("******Challenger레벨입니다******");
	}
}
