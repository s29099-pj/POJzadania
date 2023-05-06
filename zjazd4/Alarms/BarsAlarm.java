package Alarms;

import Logger.Logger;
import Logger.Severity;

public class BarsAlarm implements Alarm {

    public Logger logger;

    public BarsAlarm(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent pinEvent) {
        logger.LogMessage(Severity.WARNING, "Podano Niepirawidlowy PIN", pinEvent);
        logger.LogMessage(Severity.ALARM, "WLACZENIE ALARMU", pinEvent);
        logger.LogMessage(Severity.INFO, "KRATY OPUSZCZONE!", pinEvent);
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) {
        logger.LogMessage(Severity.WARNING, "Podano Prawidlowy PIN", pinEvent);
        logger.LogMessage(Severity.INFO, "ALARM WYLACZONY", pinEvent);
        logger.LogMessage(Severity.INFO, "KRATY Podniesione!", pinEvent);
    }

}