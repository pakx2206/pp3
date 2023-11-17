public class Product {
    
    private String name;
    private boolean isVegetarian = false;
    
    public String getName() {
        return name;
    }
    public Product(String name, boolean isVegetarian){
        this.name = name;
        this.isVegetarian = isVegetarian;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isVegetarian() {
        return isVegetarian;
    }
    public void setVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }
    public String display(){
        return this.name+" "+this.isVegetarian;
    }
    public static void main(String[] args) {
        Product xyz = new Product("kiwi", false);
        xyz.setName("Orzech");
        xyz.setVegetarian(true);
        System.out.println(xyz.display());
        xyz.getName();
        xyz.isVegetarian();
    }

    

}
