package ifexample;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rank=1;
		char medalcolor;
		
		switch(rank) {
			case 1: medalcolor='G';
					break;
					
			case 2: medalcolor='S';
					break;
					
			case 3: medalcolor='B';
					break;
			default:medalcolor='n';
		}
		System.out.println(rank+"등 메달의 색은 "+medalcolor+"입니다.");
	}

}
