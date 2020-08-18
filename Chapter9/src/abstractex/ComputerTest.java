package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Computer c1= new Computer();//생성불가 abstract니까 할 일이 없잖아
		Computer c2=new DeskTop();
//		Computer c3=new NoteBook();//생성불가 abstract니까 할 일이 없잖아
		
		Computer c4=new MyNoteBook();
		c2.display();
		c4.display();
	}

}
