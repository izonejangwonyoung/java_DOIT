package inheritance;

import java.awt.Point;

public class Circle {

		Point point; //has-a relationship
		
		@SuppressWarnings("unused")
		private int radius;
		
		public Circle() {
			point=new Point();
			
		}
		
}
