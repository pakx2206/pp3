public class Rectangle 
{
    int parameterX;
    int parameterY;

    void showDimensions()
    {
        System.out.println("Dimensions: "+ parameterX + "x" + parameterY);
    }
    void SurfaceArea()
    {
        float Surface = parameterX * parameterY;
        System.out.println("Surface area: "+Surface);
    }
    void showPerimeter()
    {
        System.out.println("Perimeter: " + 2*(parameterX+parameterY));
    }
    

}
