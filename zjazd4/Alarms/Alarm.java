package Alarms;

import Logger.Logger;
import Logger.FileLogger;
import Logger.ConsoleLogger;

public interface Alarm {
    public Logger logger = new FileLogger();
    public void alarmTurnOn(PinEvent pinEvent);

    public void alarmTurnOff(PinEvent pinEvent);

}