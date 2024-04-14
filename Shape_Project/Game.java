package Shape_Project;
import java.util.*;
public class Game {
 public int selectShape() {
	 Scanner sc = new Scanner(System.in);
	 
	 int x;
	do {
		System.out.println("  ............ Enter the ==1 For >== Two Dinsional Shape................");
		 System.out.println("  ............ Enter the ==2 For >== Three Dinsional Shape................");
		 
		 x=sc.nextInt();
		 
		 if(x<1 || x>2) {
			 System.out.println(" Ohhs Yor are Selected Wrong/Invaild Options Please Selecte Correct Options !!");
		 }
	} while (x<1 ||x>2);
	return x;
 }
 public TwoDShape getTwoDShape() {
	 Scanner sc=new Scanner(System.in);
	 int twodchoice =getTwoDChoice();
	 if (twodchoice==1) {
		 System.out.println( " You have selected Circle !");
		 System.out.println( " Now Enter The Raduis Of Circle  !");
		 double r = sc.nextDouble();
		 Circle c1 =new Circle(r);
		 return c1;   // We can also write here !! new Cicrcle(r); !!
		 
	}//else if (twodchoice==2) {
//		 System.out.println( " You have selected Rectangle  !");
//		 System.out.println( " Now Enter The legth Of Rectangle  !");
//		 double l =sc.nextDouble();
//		 System.out.println( " Now Enter The Width Of Rectangle  !");
//		 double w =sc.nextDouble();
//		 
//		 return new Ractangle(l,w);
//		 
//	}
	return null;
		 
	 }
	 // static method for same Class acess we dont create this class oject
	 public static int getTwoDChoice() {
		 Scanner sc = new Scanner(System.in);
		 int x;
//		  do {
			  System.out.println(" Select The One Optiond from below");
			  System.out.println("Enter 1  For Circle ");
			  System.out.println("Enter 2  For Rectangle ");
			  System.out.println("Enter 3  For Triangle ");
			  System.out.println("Enter 4  For Square ");
			  System.out.println("Enter 5  For Paraleogram ");
			  x=sc.nextInt();
			  //!! 5 Can be Increase According to the Option Available !!
//			  if (x<1||x>1) {
//				  System.out.println("Ohhs Yor are Selected Wrong/Invaild Options Please Selecte Correct Options !! ");
//			}
			  
//		} while (x<1||x<5);
		 
		return x;
		
 }
}
