package ifexample;

public class IfExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=98;
		int charge=0; //reset
		if(age<19) {
			charge=10000;
			System.out.println("미성년자입니다.");
			System.out.println("가격은 "+charge+"원 입니다.");
		}
		else if(age<60){
				charge=30000;
				System.out.println("성인입니다.");
				System.out.println("가격은 "+charge+"원 입니다.");
			}
	
		 else if(age<100){
				charge=8000;
				System.out.println("노인우대 가격이 적용됩니다.");
				System.out.println("가격은 "+charge+"원 입니다.");
			}
	}
	
	

}
