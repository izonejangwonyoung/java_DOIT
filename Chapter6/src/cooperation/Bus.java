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
		passengerCount++;// �°��� 1����
		this.money+=money;//�� ������ŭ ����
		
	}
	
	public void showInfo() {
		System.out.println("����"+busNumber+"���� �°� ���� "+passengerCount+"���̰�, ������"+money+"�� �Դϴ�.");
	}
}
