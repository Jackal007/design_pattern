package ChainOfResponsibility;

public abstract class Logger {
	public static int INFO = 1;
	public static int DEBUG = 2;
	public static int ERROR = 3;
	protected int level;
	// 责任链中的下一个元素
	protected Logger nextLogger;

	public Logger setNextLogger(Logger nextLogger) {
		this.nextLogger = nextLogger;
		return nextLogger;
	}

	public void logMessage(int level, String message) {
		if (level <= this.level) {
			write(message);
		} else {
			System.out.println(this.getClass() + " can not handel it!");
			if (nextLogger != null) {
				nextLogger.logMessage(level, message);
			} else {
				System.out.println("no noe can handel it!");
			}
		}
	}

	abstract protected void write(String message);

}
