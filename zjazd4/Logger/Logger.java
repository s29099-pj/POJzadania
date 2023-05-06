package Logger;

import Alarms.PinEvent;
public interface Logger {
    public Severity logLevel = Severity.INFO;

    public void LogMessage(Severity severity, String message, PinEvent pinEvent);
}