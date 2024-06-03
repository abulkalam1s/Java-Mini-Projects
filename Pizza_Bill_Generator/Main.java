public class Main {
    public static void main(String[] args) {
        
        // Pizza basePizza = new Pizza(false);

        // basePizza.addExtraCheese();
        // basePizza.addExtraToppings();
        // basePizza.takeAway();

        // basePizza.generateBill();  // Final bill after additions

        DeluxPizza dp = new DeluxPizza(false);
        dp.takeAway();
        dp.generateBill();
    }
}
