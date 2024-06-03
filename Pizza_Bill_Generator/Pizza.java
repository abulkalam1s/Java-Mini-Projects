class Pizza {
    private int price;
    private boolean isVeg;
    private int extraCheesePrice = 100;
    private int extraToppingPrice = 150;
    private int carryBagPrice = 20;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakeAwayOpted = false;

    String bill = "";
    int basePrice;

    // Base Pizza will be in two variants 
    //  -> veg        -    300
    //  -> non-veg    -    400
    // Extra Cheese   -    100
    // Extra Toppings -    150
    // Take away      -     20
    
    Pizza(boolean isVeg) {
        this.isVeg = isVeg;
        if(this.isVeg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePrice = price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }
    
    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppingPrice;
    }

    public void takeAway() {
        isTakeAwayOpted = true;
        this.price += carryBagPrice;
    }

    public void generateBill() {
             bill = "Pizza                : " + basePrice + "\n";
        if(isExtraCheeseAdded) {
            bill += "Extra Cheese Added   : " + extraCheesePrice + "\n";
        }
        if(isExtraToppingsAdded) {
            bill += "Extra Toppings Added : " + extraToppingPrice + "\n";
        }
        if(isTakeAwayOpted) {
            bill += "Take Away            : " + carryBagPrice + "\n";
        }
        bill +=     "--------------------------- \n";
        bill +=     "Total Bill           : " + price;
        System.out.println(bill);
    }
}
