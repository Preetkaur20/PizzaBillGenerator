class BasePizza {
    private int price;
    private Boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppings = 150;
    private int backPack = 20;
    private int p1;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    // Constructor PizzaPrice
    public BasePizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        p1 = this.price;
    }

    public void addExtraCheese() {
        isExtraCheeseAdded = true;
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        isExtraToppingsAdded = true;
        this.price += extraToppings;
    }

    public void takeAway() {
        isOptedForTakeAway = true;
        this.price += backPack;
    }

    public void getBill() {
        String bill = "";
        System.out.println("Pizza: " + p1);
        if (isExtraCheeseAdded) {
            bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
        }

        if (isExtraToppingsAdded) {
            bill += "Extra Toppings Added: " + extraToppings + "\n";
        }
        if (isOptedForTakeAway) {
            bill += "Take Away: " + backPack + "\n";
        }
        bill += "Bill: " + this.price + "\n";
        System.out.println(bill);
    }
}

class DeluxPizza extends BasePizza {
    public DeluxPizza(Boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }

    @Override
    public void addExtraCheese() {
    }

    @Override
    public void addExtraToppings() {
    }
}

public class Pizza {
    public static void main(String[] args) {
        BasePizza p1 = new BasePizza(false);
        p1.addExtraCheese();
        p1.addExtraToppings();
        p1.takeAway();
        p1.getBill();

        DeluxPizza p2 = new DeluxPizza(true);
        p2.addExtraCheese();
        p2.addExtraToppings();
        p2.getBill();

    }
}
