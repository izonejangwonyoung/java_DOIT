package cooperation;

public class Bus {

	int busNumber;
	int passengerCount;
	int money;
	
//	public Bus() {}
	public Bus(int busNumber) {
		this.busNumber=busNumber;
	}
	
	
	
	public void take(int money) {
		passengerCount++;// 승객수 1증가
		this.money+=money;//돈 받은만큼 증가
		
	}
	
	public void showInfo() {
		System.out.println("버스"+busNumber+"번의 승객 수는 "+passengerCount+"명이고, 수입은"+money+"원 입니다.");
	}
}
