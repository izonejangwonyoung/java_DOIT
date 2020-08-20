package gamelevel;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("힘이 약해 점프할 수 없습니다.");
	}

	@Override
	public void turn() {
		System.out.println("민첩성이 약해 방향전환이 불가합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("******Rookie레벨입니다******");
	}

}
