package Alarms;

import Logger.Logger;
import Logger.Severity;

public class DogsAlarm implements Alarm {

    public Logger logger;

    public DogsAlarm(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent pinEvent) {
        logger.LogMessage(Severity.WARNING, "ZLY PIN!", pinEvent);
        logger.LogMessage(Severity.INFO, "ALARM WLACZONY", pinEvent);
        logger.LogMessage(Severity.INFO, "PSY WYPUSZCZONE!", pinEvent);
    }


    @Override
    public void alarmTurnOff(PinEvent pinEvent) {
        logger.LogMessage(Severity.WARNING, "Podano Prawidlowy PIN", pinEvent);
        logger.LogMessage(Severity.INFO, "WYLACZENIE ALARMU", pinEvent);
    }

}