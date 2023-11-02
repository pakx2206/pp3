public class Clock 
{
    int Hours;
    int Minutes;

    void timeClock()
    {
        System.out.printf("time: %02d:%02d%n",Hours,Minutes);
    }
    void MfromMidnight()
    {
        System.out.println("minutes from midnight: " + (Hours*60 + Minutes));
    }
    void SfromMidnight()
    {
        System.out.println("seconds from midnight: " + 60*(Hours*60 + Minutes));
    }


}
