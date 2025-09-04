package chainofresponssibility;

abstract class Loger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;
    protected Loger nextLoger;

    public void setNextLoger(Loger nextLogger){
        this.nextLoger = nextLogger;
    }

    public void logMessage(int level, String message){
        if(this.level == ERROR){
            write(message);
        }
        if(nextLoger != null){
            nextLoger.logMessage(level, message);
        }
    }
    abstract protected void write(String message);
}
