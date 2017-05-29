package ChainOfResponsibility;

public class Client {
	private static Logger getChainOfLoggers() {
		Logger errorLogger = new ErrorLogger(Logger.ERROR);
		Logger fileLogger = new FileLogger(Logger.DEBUG);
		Logger consoleLogger = new ConsoleLogger(Logger.INFO);
		consoleLogger.setNextLogger(fileLogger).setNextLogger(errorLogger);
		return consoleLogger;
	}

	public static void main(String[] args) {
		Logger loggerChain = getChainOfLoggers();
		loggerChain.logMessage(Logger.ERROR, "This is an error information.");
	}

}
