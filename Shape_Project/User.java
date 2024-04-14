package Shape_Project;
import java.util.*;
public class User {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 Game g = new Game();
	 char c;
//	 int choice =g.selectShape();
	 
	 do {
		 int choice =g.selectShape(); 
		 switch(choice) {
		 case 1:
			 TwoDShape two_d_shape =g.getTwoDShape();
			 two_d_shape.getArea();
			 two_d_shape.getParimeter();
			 break;
		 }
		 c=sc.next().charAt(0);
	 }while(c=='Y'||c=='y');
	 

	
 }
}
