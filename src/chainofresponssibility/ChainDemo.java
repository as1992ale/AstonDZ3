package chainofresponssibility;

import java.util.logging.Logger;

public class ChainDemo {
    private static Loger getChainofLoger() {
        Loger errorLogger = new ErrorLogger(Loger.ERROR);
        Loger consoleLogger = new ConsoleLogger(Loger.INFO);

        errorLogger.setNextLoger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        Loger loggerChain = getChainofLoger();

        loggerChain.logMessage(Loger.INFO,"This is an information");
        loggerChain.logMessage(Loger.INFO, "This is an error information");
    }
}
