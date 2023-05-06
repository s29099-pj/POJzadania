package Alarms;

import Safe.Safe;
import java.util.Date;
public class PinEvent {
    private Safe safe;
    public Date eventDate;

    public PinEvent(Safe safe) {
        this.safe = safe;
        this.eventDate = new Date();
    }

    public Safe getSafe() {
        return this.safe;
    }
}