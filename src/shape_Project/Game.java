package shape_Project;

import java.util.Scanner;

public class Game {
	Game(){
		System.out.println("=======Game Has Started======");
	}
	public int selectShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for 2D Shape");
		System.out.println("Press 2 for 3D Shape");
		int choice=sc.nextInt();
		if(choice==1)
			return 1;
		else if(choice==2)
			return 2;
		else {
			System.out.println("Invalid Choice!");
			return selectShape();
//			System.out.println("Invalid Choice");
//			System.out.println("Press 1 to select Valid Shape");
//			System.out.println("Press 2 for 3DShape");
//			int ch=sc.nextInt();
//			if(ch==1)
//				return selectShape();
//			else
//				System.exit(ch);
    	}
	}
	public TwoDShape selectTwoDShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Circle");
		System.out.println("Press 2 for Triangle");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("You have selected Circle");
			System.out.println("Enter the radius");
			double r=sc.nextDouble();
			Circle c1=new Circle(r);
			return c1;
		}
		else if(choice==2) {
			System.out.println("You have selected triangle");
			System.out.println("Enter the 1st side");
			double side1=sc.nextDouble();
			System.out.println("Enter the 2nd side");
			double side2=sc.nextDouble();
			System.out.println("Enter the 3rd side");
			double side3= sc.nextDouble();
			Triangle t1=new Triangle(side1,side2,side3);
			return t1;
		}
		else {
			System.out.println("Enter the valid Input");
			return selectTwoDShape();
		}
	}
	
	public ThreeDShape selectThreeDShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("You have selected 3 D Shape");
		System.out.println("Press 1 for Cylinder");
		System.out.println("Press 2 for Cube");
		int choice=sc.nextInt();
		if(choice==1) {
			System.out.println("You have selected Cylinder");
			System.out.println("Enter the radius");
			double r=sc.nextDouble();
			System.out.println("Enter the height");
			double h=sc.nextDouble();
			Cylinder c1=new Cylinder(r,h);
			return c1;
	}
		else if(choice==2) {
			System.out.println("You have selected Cube");
			System.out.println("Enter the side of cube");
			double side=sc.nextDouble();
			Cube cu=new Cube(side);
			return cu;
		}
		else {
			System.out.println("Enter the valid Input");
			return selectThreeDShape();
		}
	}

}
