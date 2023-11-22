package Uebung5;
public class LoggerTest {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        // Testen der Logging-Funktionalität
        logger.log("LoggerTest", "main", LogLevel.DEBUG, "Inhalt von x = 10");
        someMethod();
        anotherMethod();
        logWarning();

        // Abrufen und Ausgabe des gesamten Logs
        String fullLog = logger.getLog();
        System.out.println("Gesamtes Log:");
        System.out.println(fullLog);
    }

    public static void someMethod() {
        Logger logger = Logger.getInstance();
        logger.log("LoggerTest", "someMethod", LogLevel.INFO, "Guckst du Info");
    }

    public static void anotherMethod() {
        Logger logger = Logger.getInstance();
        logger.log("LoggerTest", "anotherMethod", LogLevel.ERROR, "Guckst du Fehler!");
    }
    public static void logWarning() {
        Logger logger = Logger.getInstance();
        logger.log("LoggerTest", "logWarning", LogLevel.WARNING, "dat is ne Warnung ! ");
    }
}


