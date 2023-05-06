package Alarms;

import Logger.Logger;
import Logger.Severity;

public class PoliceAlarm implements Alarm {

    public Logger logger;

    public PoliceAlarm(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void alarmTurnOn(PinEvent pinEvent) {
        logger.LogMessage(Severity.WARNING, "Podano Niepirawidlowy PIN", pinEvent);
        logger.LogMessage(Severity.ALARM, "WLACZENIE ALARMU", pinEvent);
        logger.LogMessage(Severity.INFO, "Policja wezwana!", pinEvent);
    }

    @Override
    public void alarmTurnOff(PinEvent pinEvent) {
        logger.LogMessage(Severity.WARNING, "Podano Prawidlowy PIN", pinEvent);
        logger.LogMessage(Severity.INFO, "ALARM WYLACZONY", pinEvent);

    }

}