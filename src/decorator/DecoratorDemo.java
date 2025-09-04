package decorator;

public class DecoratorDemo {
    public static void main(String[] args) {
        Coffe coffe = new SimpleCoffe();
        System.out.println(coffe.getDescription() + "$" + coffe.getCost());

        coffe = new WithMilk(coffe);
        System.out.println(coffe.getDescription() + "$" + coffe.getCost());

        coffe = new WithShugar(coffe);
        System.out.println(coffe.getDescription() + "$" + coffe.getCost());
    }
}
