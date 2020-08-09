package cooperation;

public class TakeTrans {

	public static void main(String[] args) {

		@SuppressWarnings("unused")
		Student jang =new Student("장원영",9000); 
		@SuppressWarnings("unused")
		Student choi =new Student("최예나",15000); 
		Bus bus82=new Bus(82);
		jang.takeBus(bus82);
		jang.showInfo();
		choi.takeBus(bus82);
		choi.showInfo();

		Subway subwayBlue=new Subway(2);
		choi.takeSubway(subwayBlue);
		choi.showInfo();
		subwayBlue.showInfo();
	}

}
