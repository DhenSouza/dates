package datas;

import java.util.Date;

public class Exemplo002 {

    public static void main(String[] args) {
        Long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);
        // 1620652961900

        Date novaData = new Date(currentTimeMillis);

        System.out.println(novaData);
        // Mon May 10 10:23:22 BRT 2021
    }
}
