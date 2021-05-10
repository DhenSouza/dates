package calendar;

import java.util.Calendar;

public class ExemploCalen003 {

    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        System.out.printf("%tc\n", agora);
        // seg. mai. 10 12:04:49 BRT 2021

        System.out.printf("%tF\n", agora);
        // 2021-05-10

        System.out.printf("%tD\n", agora);
        // 05/10/21

        System.out.printf("%tr\n", agora);
        // 12:07:53 PM

        System.out.printf("%tT\n", agora);
        // 12:09:30
    }
}
