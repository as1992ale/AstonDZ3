package chainofresponssibility;

import java.util.logging.Logger;

public class ChainDemo {
    private static Logger getChainofLogger() {
        Logger errorLogger = new ErrorLogger(Logger.ERROR);
        Logger consoleLogger = new ConsoleLogger(Logger.INFO);

        errorLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        Logger loggerChain = getChainofLogger();

        loggerChain.logMessage(Logger.INFO,"This is an information");
        loggerChain.logMessage(Logger.INFO, "This is an error information");
    }
}
