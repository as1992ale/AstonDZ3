package adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        AmericanSocket americanSocket = new AmericanSocket();
        EuropeanSocket adapter = new SocketAdapter(americanSocket);

        Laptop laptop = new Laptop();
        laptop.plugIn(adapter);
    }
}
