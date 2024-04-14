package Shape_Project;

public class Cylinder extends ThreeDShape {
	
	static double r;
	static double h;
	public Cylinder() {
		
	}
	public Cylinder(double r,double h) {
		System.out.println(" Cylinder Object Is Created !!");
		this.r=r;
		this.h= h;
		
	}
	
	@Override
	public double getVolume() {
		 
		double volume = 3.14*r*r*h;
	    System.out.println( " Volume Of  The  Cylinder Is :  "+ volume +" Cube. Unit");
	    
	    return volume;
	     }
	@Override
	 public double getLateralSurfaceArea() {
		 // Letral Surface Area !! lsa
		double lsa =2*Math.PI*r*h;
		 System.out.println( " Letral Surface Area Of  The  Cylinder Is :  "+ lsa +" Sq. Unit");
		 
		 
	    return lsa;
	     }
     @Override
	 public double getTotalSurfaceArea() {
		 // Total Surface Area !! tsa
    	 double tsa = 2*Math.PI*r*(r+h);
		 System.out.println( " Total Surface Area Of The Cylinder is :  "+tsa +" Sq. Unit");
		 
		 
	    return tsa;
	     }
}
