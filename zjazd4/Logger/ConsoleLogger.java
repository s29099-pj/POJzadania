package Logger;

import Alarms.PinEvent;

public class ConsoleLogger implements Logger {
    @Override
    public void LogMessage(Severity severity, String message, PinEvent pinEvent) {

        switch (severity) {
            case INFO -> {
                System.out.println(severity + ":" + message + " Source: " + pinEvent.getSafe()
                        + " Data: " + pinEvent.eventDate);
                break;
            }
            case WARNING -> {
                System.err.println(severity + ":" + message + " Source: " + pinEvent.getSafe()
                        + " Data: " + pinEvent.eventDate);
                break;
            }
            case ALARM -> {
                System.err.println(severity + ":" + message + " Source: " + pinEvent.getSafe()
                        + " Data: " + pinEvent.eventDate);
                break;
            }
        }
    }
}