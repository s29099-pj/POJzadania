package Logger;

import Alarms.PinEvent;

import java.io.FileWriter;
import java.io.IOException;

public class FileLogger implements Logger {
    @Override
    public void LogMessage(Severity severity, String message, PinEvent pinEvent) {
        try {
            FileWriter writer = new FileWriter("logs.txt", true);
            writer.write(severity + ":" + message + " Source: " + pinEvent.getSafe()
                    + " Data: " + pinEvent.eventDate + "\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Blad podczas zapisywania Logu");
            e.printStackTrace();
        }

    }
}
