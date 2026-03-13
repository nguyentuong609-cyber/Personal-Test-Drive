package Lab01;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Product> list = new ArrayList<>();
        
        list.add(new Product("P01", "Pen", 20));
        list.add(new Product("P02", "Book", 100));
        list.add(new Product("P03", "Mouse", 150));

        list.add(new ImportedProduct("P04", "Laptop", 1000, 0.1, 20000));
        list.add(new ImportedProduct("P05", "Phone", 800, 0.15, 15000));

        for(Product x : list){
            x.printProduct();
            System.out.println("");
        }
    }
}
