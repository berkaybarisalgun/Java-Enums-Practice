package CoffeeShop;

public enum CoffeeType {
    ESPRESSO(30, "Prepared under high pressure in a very short time."),
    AMERICANO(100, "Espresso with added hot water, resulting in a larger volume."),
    LATTE(150, "Espresso topped with steamed milk and a bit of milk foam."),
    CAPPUCCINO(150, "Espresso with equal amounts of steamed milk and milk foam on top.");

    private final int ml;
    private final String description;

    CoffeeType(int ml, String description) {
        this.ml = ml;
        this.description = description;
    }

    public int getMl() {
        return ml;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.name() + " (" + this.ml + "ml): " + this.description;
    }

    public double calculatePrice() {
        switch (this) {
            case ESPRESSO:
                return 7;
            case AMERICANO:
                return 8;
            case LATTE:
                return 10;
            case CAPPUCCINO:
                return 11;
            default:
                throw new AssertionError("Unknown coffee: " + this);
        }
    }
}

