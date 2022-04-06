package TestRectangle;

public class Rectangle {
	double length, width;

    Rectangle()
    
    {
        length = 1;
        
        width = 1;
        
    }
    
    
    Rectangle(double length, double width)
            
            
    {
        this.length = length;
        
        this.width  = width;
        
    }
    
    // define a method
    double getArea()
            
    {
        return (length * width);
        
    }
    
    double getPerimeter()
            
    {
        return (2 * (length + width));
    }
}

