package chainofresponssibility;

public class Looger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;
    protected Logger nextlogger;

    public static setNextLogger(Ligger nextLogger){
        this.nextlogger = nextLogger;
    }

    public void logMessage(int level, String message){
        if(this.level == ERROR){
            write(message);
        }
        if(this.level != null){
            nextlogger.logMessage(level, message);
        }
    }
    abstract protected void write(String message);
}
