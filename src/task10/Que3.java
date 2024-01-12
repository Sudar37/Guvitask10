package task10;

class Circle { // declare circle class 
	  public  double radius;

	  public Circle(double radius) {
	    this.radius = radius;
	  }

	  public double getRadius() {
	    return radius;
	  }

	 public void setRadius(double radius) {
	    this.radius = radius;
	  }
	  
	  public double getCircumference() {  // circumference calculation
	    return 2 * Math.PI * radius;
	  }
	}

public class Que3 {

	public static void main(String[] args) {
		
		int r = 7;
		
	    Circle circle = new Circle(r);
	   
	    System.out.println("Radius of the circle is " + r);
	    System.out.println("The circumference of the circle is " + circle.getCircumference());
	    
	}

}
