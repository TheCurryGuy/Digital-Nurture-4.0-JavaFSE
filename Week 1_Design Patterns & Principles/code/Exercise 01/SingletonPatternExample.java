class Logger {
    
    private static Logger theLogger;
    private Logger() {
        System.out.println("New Logger created!");
    }
    public static Logger getInstance() {
        if (theLogger == null) {
            theLogger = new Logger();
        }
        return theLogger;
    }

    // Logger functionality
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}

public class SingletonPatternExample {
    public static void main(String[] args) {
        Logger firstLogger = Logger.getInstance();
        Logger secondLogger = Logger.getInstance();
        
        firstLogger.log("First message");
        secondLogger.log("Second message");

        if (firstLogger == secondLogger) {
            System.out.println("Both loggers are the SAME instance");
        } else {
            System.out.println("Different logger instances");
        }
    }
}