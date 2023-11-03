public class RectangleMain 
{
    public static void main(String[] args) 
    {
        Rectangle r1 = new Rectangle();
        r1.parameterX = 3;
        r1.parameterY = 4;
        r1.showDimensions();
        r1.showPerimeter();
        r1.SurfaceArea();
        
        Rectangle r2 = new Rectangle();
        r2.parameterX = 2;
        r2.parameterY = 7;
        r2.showDimensions();
        r2.showPerimeter();
        r2.SurfaceArea();
    }    
}
