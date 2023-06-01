package lesson1;

import java.util.List;

public class VendingMachine {

    private final List<Product> products;

    public VendingMachine(List<Product> products) {

        this.products = products;
    }

    public  BottleOfWater getBottleOfWater(double volume){

        for(Product product : products){
            if (product instanceof BottleOfWater){
               if ( ((BottleOfWater)product).getVolume()  == volume){
                   return (BottleOfWater)product;
               }
            }
        }
        return null;
    }

    
    // метод для поиска шоколадки по вкусу
    public Chocolate getChocolate(String taste) {
        for (Product product : products) {
            if (product instanceof Chocolate) {
                if (((Chocolate) product).getTaste().equals(taste)) {
                    return (Chocolate) product;
                }
            }
        }
        return null;
    }
}
