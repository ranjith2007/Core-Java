import java.util.Scanner;

public class Rectangle {

		 private
		  int width = 0, length = 0;
	
		  
		 public
		  Rectangle(int width, int length)
		
		  {
		
		   setWidth(width);
		   setLength(length);
		  }
	
		  void setWidth(int width)
		  {
		
		   this.width = width;
	
		  }
		  void setLength(int length)
		  {
	
		   this.length = length;
	
		  }
		
		  int getWidth()
		
		  {
		
		   return this.width;
		
		  }
		
		   
		
		  int getLength()
		
		  {
		
		   return this.length;
		
		  }
		
		  int getPerimeter()
		
		  {
		
		   return 2*getWidth() + 2*getLength();
		
		  }
		
		  int getArea()
	
		  {

		   return getWidth()*getLength();
		
		  }
		
		   
		
		  boolean isSquare()
		
		  {
		
		   return (getWidth() == getLength());
		
		  }
	
		 public static void main(String[] args)
		
		 {
		
		  Scanner scan = new Scanner(System.in);
		
		   
		
		  System.out.print("Enter width:");
		
		  System.out.print("Enter length:");
		
		  int width=scan.nextInt();
		
		  int length=scan.nextInt();
		
		  Rectangle rect = new Rectangle(width, length);
		
		  System.out.println("Area: " + rect.getArea());
		
		  System.out.println("Perimeter: " + rect.getPerimeter());
		
		   
		
		  if(rect.isSquare())
		
		  {
		
		   System.out.println("This is a square.");
		
		  }
		
		  else
		
		  {
		
		   System.out.println("This is not a square.");
		
		  }
		
		 }

}
