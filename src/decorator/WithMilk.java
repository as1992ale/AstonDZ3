package decorator;

public class WithMilk extends CoffeDecorator {
    public WithMilk(Coffe coffe) {
        super(coffe);
    }

    @Override
    public double getCost() {
        return super.getCost()+0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Milk";
    }
}
