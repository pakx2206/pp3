public class Clock {

    private int hour;
    private int minute;
    

    public Clock(int hour,int minute){
        if (checkHour(hour) && checkMinute(minute))
        {
            this.hour = hour;
            this.minute = minute;
        }
    }


    public boolean checkHour(int hour){
        return (this.hour<24 && this.hour>=0);
    }

    public boolean checkMinute(int minute){
        return (this.minute<59 && this.minute>=0);
    }


    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if(checkHour(hour))
        {
        this.hour = hour;
        }
        else
        {
            System.err.println("ERROR!");
        }
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if(this.checkMinute(minute))
        {
        this.minute = minute;
        }
        else
        {
            System.out.println("ERROR!");
        }
    }
    public void addMinute(){
        if(this.minute<=58){
            this.minute++;
        }
        else if(this.hour==23)
        {
            setMinute(0);
            setHour(0);
        }
        else
        {
            setMinute(0);
            this.hour++;
        }
    }
    
    
}
