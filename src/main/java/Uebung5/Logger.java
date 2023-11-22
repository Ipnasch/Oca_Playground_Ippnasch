package Uebung5;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * Eine Singleton-Klasse für Logging, die Logeinträge sammelt.
 */
public class Logger {
    private static Logger instance;
    private StringBuilder logEntries;

    /**
     * Privater Konstruktor, um die direkte Instanziierung zu verhindern.
     * Initialisiert den StringBuilder für die Logeinträge.
     */
    private Logger() {
        logEntries = new StringBuilder();
    }

    /**
     * Gibt die Singleton-Instanz des Loggers zurück.
     * Falls noch keine Instanz existiert, wird eine neue erzeugt.
     *
     * @return Die Singleton-Instanz des Loggers
     */
    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    /**
     * Fügt einen neuen Logeintrag hinzu.
     *
     * @param className  Der Klassenname des aufrufenden Codes
     * @param methodName Der Methodenname des aufrufenden Codes
     * @param level      Der Log-Level des Eintrags (DEBUG, INFO, WARNING, ERROR)
     * @param message    Die Nachricht, die geloggt werden soll
     */
    public void log(String className, String methodName, LogLevel level, String message) {
        // Erzeugt ein formatiertes Datum für den Logeintrag
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        String formattedDate = dateFormat.format(new Date());

        // Erstellt den Logeintrag im gewünschten Format
        String logEntry = String.format("%s: %s - %s/%s - %s%n", formattedDate, level.toString(), className, methodName, message);

        // Fügt den Logeintrag zum StringBuilder hinzu
        logEntries.append(logEntry);
    }

    /**
     * Gibt das gesamte Log als String zurück.
     *
     * @return Der String, der alle gesammelten Logeinträge enthält
     */
    public String getLog() {
        return logEntries.toString();
    }
}

/**
 * Enum für die verschiedenen Log-Level (DEBUG, INFO, WARNING, ERROR).
 */
enum LogLevel {
    DEBUG,
    INFO,
    WARNING,
    ERROR
}
