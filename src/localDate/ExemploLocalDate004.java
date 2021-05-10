package localDate;

import java.time.LocalDateTime;

public class ExemploLocalDate004 {

    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);

        LocalDateTime futuro = agora.plusHours(1).plusDays(2).plusSeconds(2);

        System.out.println(futuro);

    }
}
