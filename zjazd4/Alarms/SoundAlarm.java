package Alarms;

import Logger.Logger;
import Logger.Severity;

public class SoundAlarm implements Alarm {

    public Logger logger;

    public SoundAlarm(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent pinEvent) {
        logger.LogMessage(Severity.WARNING, "Podano Niepirawidlowy PIN", pinEvent);
        logger.LogMessage(Severity.ALARM, "WLACZENIE ALARMU", pinEvent);
        logger.LogMessage(Severity.INFO, "Alarm dzwiekowy wlaczony!", pinEvent);
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) {
        logger.LogMessage(Severity.WARNING, "Podano Prawidlowy PIN", pinEvent);
        logger.LogMessage(Severity.INFO, "ALARM WYLACZONY", pinEvent);
        logger.LogMessage(Severity.INFO, "Alarm dzwiekowy wylaczony!", pinEvent);

    }

}