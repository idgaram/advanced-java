

enum Laptop{
    Macbook(2000), Microsoft, Yoga(1200);
    
    private Laptop(){
        
    }

    private Laptop(int price) {
        this.price = price;
    }

    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    
}
public class Demo{

    public static void main(String[] args) {

        Laptop[] all = Laptop.values();
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap.getPrice());
        // lap.setPrice(1);
        // System.out.println(lap.getPrice());
        

        for (Laptop elem : all) {
            System.out.println(elem.getPrice());
        }
        
    }
   
    
    
}