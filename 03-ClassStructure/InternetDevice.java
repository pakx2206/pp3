public class InternetDevice {
    
    private String name;
    private boolean connected = false;
    static private int connectedDevices;

    
    public InternetDevice(String name)
    {
        this.name = name;
    }

    public void connect()
    {
        if(!this.connected)
        {
            this.connected= true;
            connectedDevices++;
            System.out.println("Your device is now connected!");
        }
        else
        {
            System.out.println("Your device is already connected.");
        }
    }
    public void disconnect()
    {
        if(this.connected==true)
        {
            this.connected = false;
            connectedDevices--;
            System.out.println("Your device is now disconnected!");
        }
        else
        {
            System.out.println("Your device is already disconnected.");
        }
    }
    public boolean isConnected()
    {
        return this.connected;
    }
    public String displayStatus()
    {   
        String connection = this.isConnected() ? "Yes" : "No";
        return String.format("Name: %s\nIs this device connected? %s\nNumber of devices connected now: %01d", this.name, connection, connectedDevices);

    }
    public static void displayConnection(){
        System.out.println("Connected:" + connectedDevices);
    }

}
