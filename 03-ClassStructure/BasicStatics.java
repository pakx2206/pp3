public class BasicStatics {

    double x;
    double y;

    public double SpecifiedRange(double x, double y){
        this.x = x;
        this.y = y;
        double sum = 0;
        for (double i=0; i<=(this.y-this.x)+1;i++){
            sum = i;
        }
        int h = (int)Math.round(sum);
        return h;
    }
    public double SumOfNumber(double x, double y){
        this.x = x;
        this.y = y;
        double sum = 0;
        for (double i=this.x;i<=y;i++){
            sum = sum+i;
        }
        return sum;
    }
    public double ArithmeticMean(double x, double y){
        this.x = x;
        this.y = y;
        double p = SumOfNumber(this.x, this.y)/SpecifiedRange(this.x, this.y);
        return p;

        
    }

}
