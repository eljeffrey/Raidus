import java.util.Scanner;

public class CabreraJeffrey2{
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a radius :");
		
		Circle x= new Circle();
		Circle y=new Circle();
		
		x.radius=scan.nextDouble();
		
		System.out.println("Please enter a second radius");
		
		y.radius=scan.nextDouble();
		
			if(x.equals(y)) {
				System.out.println("they are equal");
				System.out.println("Area:  "+ x.area());
				System.out.println("Circumference:  "+x.circumference());
			}else {
				// first circle
				System.out.println("they are not equal");
				System.out.println("Circle 1's Area:  "+ x.area());
				System.out.println("Circle 1's Circumference:  "+x.circumference());
				// second circle
				System.out.println("Circle 2's Area:  "+ y.area());
				System.out.println("Circle 2's Circumference:  "+y.circumference());
			}
		scan.close();
	}
}
class Circle{
	//instance variable 
	double radius;
	
	//getter
	public double getRad() {
		return radius;
	}
	//setter
	public void setRad(double newRad) {
		radius=newRad;
	}
	//Constructor no parameters sets radius to 1
	Circle(){
		radius=1;
	}
	//Constructor takes radius parameter
	Circle(double newRad){
		radius=newRad;
	}
	//instance methods
	public double circumference(){
		double circumference=Math.PI*2*radius;
		return circumference;
			
	} 
	
	public double area() {
		double area=Math.PI * (radius * radius);
		return area;
	}
	
	public String toString() {
		String toString="Circle "+ radius;
		return toString;
	}
	public Boolean equals(Circle newCircle) {
		if(radius==newCircle.radius) return true;
		return false;	
	}
}