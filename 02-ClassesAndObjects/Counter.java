public class Counter 
{
    int initialValue = 0;
    int setValue;
    
    void incbyONE()
    {
        setValue += 1;
        System.out.println("Actual value: "+setValue);
    }
    void decbyONE()
    {
        setValue -= 1;
        System.out.println("Actual value: "+setValue);
    }
    void incbyTEN()
    {
        setValue += 10;
        System.out.println("Actual value: "+setValue);
    }
    void decbyTEN()
    {
        setValue -=10;
        System.out.println("Actual value: "+setValue);
    }
    void reset()
    {
        setValue = initialValue;
        System.out.println("Actual value: "+setValue);
    }
    
}
