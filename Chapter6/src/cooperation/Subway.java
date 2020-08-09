package cooperation;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber=lineNumber;
	}
	
	
	
	public void take(int money) {
		passengerCount++;// 승객수 1증가
		this.money+=money;//돈 받은만큼 증가
		
	}
	
	public void showInfo() {
		System.out.println("지하철 노선"+lineNumber+"번의 승객 수는 "+passengerCount+"명이고, 수입은"+money+"원 입니다.");
	}
}

	
	

