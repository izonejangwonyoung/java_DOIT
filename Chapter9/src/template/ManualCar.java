package template;

public class ManualCar extends Car{

	@Override
	public void drive() {
		System.out.println("����� �����մϴ�.");
		
		System.out.println("����� �ڵ��� �����մϴ�.");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("����� �극��ũ�� �����մϴ�.");
		
	}

	@Override
	public void wiper() {
		System.out.println("�� ���� �翡 ���� �ڵ����� �����˴ϴ�.");
	}

}
