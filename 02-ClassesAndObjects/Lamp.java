public class Lamp 
{
    boolean isLampON = true;

    void TurnON()
    {
        isLampON = true;
    }
    void TurnOFF()
    {
        isLampON = false;
    }
    void displayIsLampON()
    {
        String Answer = (isLampON == true) ? "Lamp is on":"Lamp is off";
        System.out.println(Answer);
    }
}
