package adapter;

public class Laptop {
    public void plugIn(EuropeanSocket socket) {
        socket.providePower();
        System.out.println("Laptop plug In");
    }
}
