package decorator;

import jdk.jfr.Description;

class WithShugar extends CoffeDecorator {
    public WithShugar(Coffe coffe) {
        super(coffe);
    };

    public double getCost() {
        return super.getCost() + 0.2;
    }

    public String getDescription() {
        return super.getDescription()+", Description";
    }
}
