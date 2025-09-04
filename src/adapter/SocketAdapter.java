package adapter;

import java.net.Socket;

class SocketAdapter implements EuropeanSocket {
    private AmericanSocket americanSocket;

    public SocketAdapter(AmericanSocket americanSocket) {
        this.americanSocket = americanSocket;
    }

    @Override
    public void providePower() {
        americanSocket.givePower();
    }
}
