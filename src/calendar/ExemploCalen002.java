package calendar;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Calendar;

public class ExemploCalen002 {

    public static void main(String[] args) {
        Calendar agora = Calendar.getInstance();

        // A data corrente é: Mon May 10 11:36:27 BRT 2021
        System.out.println("A data corrente é: " + agora.getTime());

        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: " + agora.getTime());
        // 15 dias atras: Sun Apr 25 11:38:30 BRT 2021

        agora.add(Calendar.MONTH, 4);
        System.out.println("4 meses depois: " + agora.getTime());
        // 4 meses depois: Wed Aug 25 11:40:07 BRT 2021

        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + agora.getTime());
        // 2 anos depois: Fri Aug 25 11:41:46 BRT 2023
    }
}
