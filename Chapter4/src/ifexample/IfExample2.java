package ifexample;

public class IfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=98;
		int charge=0; //reset
		if(age<19) {
			charge=10000;
			System.out.println("�̼������Դϴ�.");
			System.out.println("������ "+charge+"�� �Դϴ�.");
		}
		else if(age<60){
				charge=30000;
				System.out.println("�����Դϴ�.");
				System.out.println("������ "+charge+"�� �Դϴ�.");
			}
	
		 else if(age<100){
				charge=8000;
				System.out.println("���ο�� ������ ����˴ϴ�.");
				System.out.println("������ "+charge+"�� �Դϴ�.");
			}
	}
	
	

}
