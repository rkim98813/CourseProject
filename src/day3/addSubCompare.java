package day3;
import java.util.Scanner;

class Time {
    private static int day = 0;
    private int hour;
    private int min;
    private int sec;

    public Time(int hour, int min, int sec) {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }

    public int convertSec() {
        return this.hour*60*60 + this.min*60 + this.sec;
    }

    public Time convertSecToTime(int totalSec) {
        int newHour = totalSec / (60*60);
        totalSec = totalSec % (60*60);
        int newMin = totalSec / 60;
        totalSec = totalSec % 60;
        int newSec = totalSec;
        /*int newHour = (totalSec % (24 * 60 * 60)) / (60 * 60);
        int newMin = (totalSec % (60 * 60)) / 60;
        int newSec = totalSec % 60;*/

        return new Time(newHour, newMin, newSec);
    }

    public Time add(Time second_time) {
        int totalSec = this.convertSec() + second_time.convertSec();

        if (totalSec > 24 * 60 * 60){
            totalSec -= 24 * 60 * 60;
            day ++;
        }

        return convertSecToTime(totalSec);
    }

    public Time sub(Time second_time) {
        int totalSec = this.convertSec() - second_time.convertSec();

        if (totalSec < 0) {
            totalSec += 24 * 60 * 60;
            day --;
        }

        return convertSecToTime(totalSec);
    }

    public int compare(Time second_time) {
        int totalSecThis = this.day * 24 * 60 * 60 + this.convertSec();
        int totalSecOther = second_time.convertSec();

        return Integer.compare(totalSecThis, totalSecOther);
    }

    public void print_time() {
        /*int totalSec = day * 24 * 60 * 60 + convertSec();

        // Get the current time in seconds
        int currentTime = (hour * 60 * 60) + (min * 60) + sec;*/

        if (day < 0) {
            System.out.println("전일 " + hour + "시 " + min + "분 " + sec + "초 입니다.");
        } else if (day == 0) {
            System.out.println("당일 " + hour + "시 " + min + "분 " + sec + "초 입니다.");
        } else {
            System.out.println("후일 " + hour  + "시 " + min + "분 " + sec + "초 입니다.");
        }
    }
}

public class addSubCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("일/시/분/초 입력: ");
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int sec = sc.nextInt();

        Time first_time = new Time(10, 10, 10);
        Time second_time = new Time(hour, min, sec);

        Time add_time = first_time.add(second_time);
        System.out.println("두 시간의 합은");
        add_time.print_time();

        Time sub_time = first_time.sub(second_time);
        System.out.println("두 시간의 차는");
        sub_time.print_time();

        int result = first_time.compare(second_time);
        System.out.println(result);
    }
}
