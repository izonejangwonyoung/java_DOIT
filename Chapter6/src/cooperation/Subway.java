package cooperation;

public class Subway {
	int lineNumber;
	int passengerCount;
	int money;
	
	public Subway(int lineNumber) {
		this.lineNumber=lineNumber;
	}
	
	
	
	public void take(int money) {
		passengerCount++;// �°��� 1����
		this.money+=money;//�� ������ŭ ����
		
	}
	
	public void showInfo() {
		System.out.println("����ö �뼱"+lineNumber+"���� �°� ���� "+passengerCount+"���̰�, ������"+money+"�� �Դϴ�.");
	}
}

	
	

