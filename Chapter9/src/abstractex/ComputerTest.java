package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Computer c1= new Computer();//�����Ұ� abstract�ϱ� �� ���� ���ݾ�
		Computer c2=new DeskTop();
//		Computer c3=new NoteBook();//�����Ұ� abstract�ϱ� �� ���� ���ݾ�
		
		Computer c4=new MyNoteBook();
		c2.display();
		c4.display();
	}

}
