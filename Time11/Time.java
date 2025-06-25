
/**
 * Time Class
 *
 * Miriam Shamsiev
 * Mon Mar 6th, 2023
 * 
 */

public final class Time {
    private final int hours;
    private final int minutes;
    private final int seconds;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int newHours) {
        this(newHours, 0, 0);
    }

    public Time(int newHours, int newMinutes) {
        this(newHours, newMinutes, 0);
    }

    public Time(int newHours, int newMinutes, int newSeconds) {
        this.hours = newHours;
        this.minutes = newMinutes;
        this.seconds = newSeconds;
    }

    public String toString() {
        String amPm = (hours < 12) ? "AM" : "PM";
        int hours12 = (hours == 0 || hours == 12) ? 12 : hours % 12;
        return String.format("%d:%02d:%02d %s", hours12, minutes, seconds, amPm);
    }

    public void write() {
        System.out.println(toString());
    }

    public Time later(int extraHours) {
        return later(extraHours, 0, 0);
    }

    public Time later(int extraHours, int extraMinutes) {
        return later(extraHours, extraMinutes, 0);
    }

    public Time later(int extraHours, int extraMinutes, int extraSeconds) {
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        totalSeconds += extraHours * 3600 + extraMinutes * 60 + extraSeconds;
        int newHours = totalSeconds / 3600 % 24;
        int newMinutes = totalSeconds % 3600 / 60;
        int newSeconds = totalSeconds % 60;
        return new Time(newHours, newMinutes, newSeconds);
    }
}
