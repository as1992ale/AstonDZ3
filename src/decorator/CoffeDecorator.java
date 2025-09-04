package decorator;

abstract class CoffeDecorator implements Coffe {
    protected Coffe decoratedCoffe;

    public CoffeDecorator(Coffe decoratedCoffe) {
        this.decoratedCoffe = decoratedCoffe;
    }

    public double getCost() {return decoratedCoffe.getCost();}

    public String getDescription() {return decoratedCoffe.getDescription();}
}
