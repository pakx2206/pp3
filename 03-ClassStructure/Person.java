public class Person {
    static double lowBMI = 18.50;
    static double highBMI = 24.90;
    
    String name;
    double weight;
    double height; 

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int weight, int height){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
    public void setWeightAndHeight(int weight, int height){
        this.weight = weight;
        this.height = height;
    }
    public double calculateBMI(){
        return weight / Math.pow(height/100, 2);
    }
    public void displayRecord(){
        System.out.printf("Name:\t%s\n",name);
        System.out.printf("Weight:\t%s\n",weight);
        System.out.printf("Height:\t%s\n",height);
        double bmi = calculateBMI();
        System.out.printf("BMI:\t%s\n",bmi);
        if (bmi<lowBMI){
            System.out.println("BMI too low");
        }
        else if (bmi>highBMI) {
            System.out.println("BMI too high");
        }
        else{
            System.out.println("BMI is normal");
        }
        System.out.println(".............");
    }


}
