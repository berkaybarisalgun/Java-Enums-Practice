import CoffeeShop.CoffeeType;

public class Main {
    public static void main(String[] args) {

        //Accessing Enum Properties and Methods
        CoffeeType myCoffee=CoffeeType.LATTE;



        //Iterating Over Enum Values
        for (CoffeeType coffee:CoffeeType.values()){
            System.out.println(coffee +" costs $"+coffee.calculatePrice());
        }

        //Comparing Enum and Values
        if (myCoffee == CoffeeType.ESPRESSO) {
            System.out.println("It's an espresso.");
        }
    }

}
