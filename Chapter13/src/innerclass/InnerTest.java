package innerclass;

class OutClass{
	private int num=10;
	private static int sNum=20;
	private InClass inClass;
	
	public OutClass() {
		inClass=new InClass();
	}
	
	class Inclass{
		int inNum=200;
		
		void inTest() {
			System.out.println(num);
		}
	}
}
public class InnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
