package chainofresponssibility;

public class ConsoleLogger extends Loger {
    public ConsoleLogger(int level) {
        this.level = level;
    }
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
