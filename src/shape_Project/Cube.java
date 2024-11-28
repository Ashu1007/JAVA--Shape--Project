package shape_Project;

public class Cube implements ThreeDShape{
	double side;
	public Cube() {
		
	}
	Cube(double side){
		this.side=side;
	}
	public void getVolume() {
		System.out.println("Volume of Cube is: "+side*side*side+" Cu. Unite");
	}
	public void getCurvedSurfaceArea() {
		System.out.println("Curved Surface Area of Cube: "+4*side*side+" Sq. Unit");
	}
	public void getTotalSurfaceArea() {
		System.out.println("Total Surface Area of cube is: "+6*side*side*side+" Sq. Unit");
	}

}
