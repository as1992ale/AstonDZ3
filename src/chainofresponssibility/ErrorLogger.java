package chainofresponssibility;

public class ErrorLogger extends Loger {
    public ErrorLogger(int level) {
        this.level = level;
    }
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
