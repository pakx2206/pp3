public class Height {
    public static void main(String[] args) {
        int HeightCentymetry = 182;
        float totalInches = HeightCentymetry / 2.54f;
        int Feet = (int) (totalInches / 12);
        int Inches = (int) (totalInches % 12);
        System.out.println("i am " + HeightCentymetry + "cm tall, i.e. " + Feet + " and " + Inches  +" inches.");
    }
}
