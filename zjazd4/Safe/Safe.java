package Safe;

import Alarms.Alarm;
import Alarms.PinEvent;
import java.util.ArrayList;
import java.util.List;

public class Safe {
    private String pin;
    public List<Alarm> alarms = new ArrayList<>();



    public Safe(String pin) {
        this.pin = pin;
    }

    public void addAlarm(Alarm alarm) {
        alarms.add(alarm);
    }

    public void removeAlarm(Alarm alarm) {
        alarms.remove(alarm);
    }

    public void enterPin(String pin) {
        if (pin == this.pin) {
            correctPin();
        }
        else {
            wrongPin();
        }
    }

    private void wrongPin() {
        for (Alarm alarm : alarms) {
            alarm.alarmTurnOn(new PinEvent(this));
        }
    }

    private void correctPin() {
        for (Alarm alarm : alarms) {

            alarm.alarmTurnOff(new PinEvent(this));
        }
        System.out.println("Sejf Otwarty");
    }
}