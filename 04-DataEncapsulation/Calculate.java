public class Calculate {
    public static void main(String[] args) {
        String x = new String("Have a nice day!");
        System.out.println("...........");
        System.out.println(x.length()+"\n...........");
        System.out.println(x.substring(0, 8)+"\n...........");
        System.out.println(x.endsWith("day!")+"\n...........");
        System.out.println(x.isEmpty()+"\n...........");
        System.out.println(x.lastIndexOf("e")+"\n...........");
        System.out.println(x.replace(" ", "-")+"\n...........");
        System.out.println(x.toUpperCase());


    }
}
