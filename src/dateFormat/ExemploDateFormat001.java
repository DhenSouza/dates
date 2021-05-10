package dateFormat;

import java.text.DateFormat;
import java.util.Date;

public class ExemploDateFormat001 {

    public static void main(String[] args) {

        Date agora = new Date();

        String dateToStr = DateFormat.getInstance().format(agora);
        // 10/05/2021 13:28
        System.out.println(dateToStr);



        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
        System.out.println(dateToStr);
        // 10 de maio de 2021 13:30
    }
}
