public class Speed {
    

public static void main(String[] args)
    int VehicleSpeed;
    Speed s = new Speed();
    s.VehicleSpeed = 158;
    String isOk = (VehicleSpeed > 40 && VehicleSpeed < 140) ? " is ok" : "is not ok";

    System.out.println("Vehicle speed:"+s.VehicleSpeed);
    System.out.println("Speed"+ isOk);
}
