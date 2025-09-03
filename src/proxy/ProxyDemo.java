package proxy;

public class ProxyDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("image1.png");
        Image image2 = new ProxyImage("image2.png");

        image.display();

        image.display();

        image2.display();


    }

}
