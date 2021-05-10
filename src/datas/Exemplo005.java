package datas;

import java.time.Instant;
import java.util.Date;

public class Exemplo005 {

    public static void main(String[] args) {
        Date dataInicio = new Date(1513124807691L);
        System.out.println(dataInicio);
        // tue dec 12 22:26:47 BRST 2017

        Instant instant = dataInicio.toInstant();
        System.out.println(instant);
        //2017-12-13T00:26:47.691Z
    }
}
