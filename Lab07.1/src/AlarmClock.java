
public class AlarmClock {

    int snoozeInterval;
    int oldValue;

    public void setSnoozeInterval(int snoozeInterval) {
        int oldValue = this.snoozeInterval;
        this.snoozeInterval = snoozeInterval;

    }

    @Override
    public String toString() {
        return "AlarmClock{" +
                "snoozeInterval=" + snoozeInterval +
                '}';
    }
}

class Main{
    public static void main(String[] args) {

        AlarmClock alarmClock = new AlarmClock();
        alarmClock.setSnoozeInterval(100);

        AlarmClock alarmClock2 = new AlarmClock();
        alarmClock2.setSnoozeInterval(200);

        alarmClock.toString();

    }


}