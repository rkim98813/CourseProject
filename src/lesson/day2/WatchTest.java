package lesson.day2;

import java.util.Calendar;

class Watch {
    private String brand;
    private int hour;
    private int minute;
    private int second;

    // Default constructor
    public Watch() {
    }

    // Parameterized constructor
    public Watch(String brand, int hour, int minute, int second) {
        this.brand = brand;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        toString();
    }

    // Parameterized constructor to set the current time
    public Watch(String brand) {
        Calendar calendar = Calendar.getInstance();
        setTime(brand, calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE), calendar.get(Calendar.SECOND));
        toString();
    }

    // Set the time
    public void setTime(String brand, int hour, int minute, int second) {
        this.brand = brand;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        toString();
    }

    // Provide a string representation of the object
    @Override
    public String toString() {
        System.out.println(brand + " " + hour + "HH " + minute + "MM " + second + "SS ");
        return null;
    }
}

public class WatchTest {
    public static void main(String[] args) {
        Watch watch1 = new Watch("ARMANI", 1, 30, 50); // ARMANI, 1, 30, 50
        Watch watch2 = new Watch("Burberry"); // Burberry, current hour, current minute, current second
    }
}
