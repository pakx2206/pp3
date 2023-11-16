public class Clock {
    
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;

    public Clock()
    {
       hour = 0;
       minute = 0; 
    }
    public Clock(int hour,int minute)
    {
        this.hour = hour;
        this.minute = minute;
        String Clock = new String();
        Clock = String.format("%02d:%02d",hour, minute);
        if(this.hour==this.alarmHour && this.minute==this.alarmMinute){
            this.runAlarm();
        }
    }
    public void setClock(int hour, int minute)
    {
        this.hour = hour;
        this.minute = minute;
        if(this.hour==this.alarmHour && this.minute==this.alarmMinute){
            this.runAlarm();
        }
    }
    public void setClock()
    {
        hour = 0;
        minute = 0;
    }
    public void displayTime()
    {
        System.out.printf("\n%02d:%02d",hour, minute);
    }
    public void addOneMinute()
    {
        if (minute == 59)
        {
            if (hour==23)
            {
                setClock();
            }
            else
            {
                hour++;
                minute = 0;
            }
        }
        else
        {
            minute++;
        }
        
        if(this.hour==this.alarmHour && this.minute==this.alarmMinute){
            this.runAlarm();
        }
    }
    public void setAlarm(int hour, int minute)
    {
        this.alarmHour = hour;
        this.alarmMinute = minute;
        if(this.hour==this.alarmHour && this.minute==this.alarmMinute){
            this.runAlarm();
        }
    }
    public void runAlarm()
    {
        System.out.println("beep-beep-beep-beep!");
    }
}
