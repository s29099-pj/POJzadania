import Alarms.SoundAlarm;
import Logger.ConsoleLogger;
import Logger.FileLogger;
import Logger.Severity;
import Logger.Logger;
import Alarms.BarsAlarm;
import Alarms.DogsAlarm;
import Alarms.PoliceAlarm;
import Alarms.SoundAlarm;
import Safe.Safe;

public class Main {
    public static void main(String[] args) {



        Logger logger1 = new FileLogger();
        SoundAlarm alarm1 = new SoundAlarm(logger1);
        Safe safe1 = new Safe("1111");
        safe1.addAlarm(alarm1);
        safe1.enterPin("124");



        Logger logger2 = new FileLogger();
        PoliceAlarm alarm2 = new PoliceAlarm(logger2);
        Safe safe2 = new Safe("2222");
        safe2.addAlarm(alarm2);
        safe2.enterPin("2222");



        Logger logger3 = new ConsoleLogger();
        BarsAlarm alarm3 = new BarsAlarm(logger3);
        Safe safe3 = new Safe("8871");
        safe3.addAlarm(alarm3);
        safe3.removeAlarm(alarm3);
        safe3.enterPin("2222");



        Logger logger4 = new ConsoleLogger();
        DogsAlarm alarm4 = new DogsAlarm(logger4);
        Safe safe4 = new Safe("4234");
        safe4.addAlarm(alarm4);
        safe4.enterPin("1111");

    }
}