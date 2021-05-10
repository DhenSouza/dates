package localDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExercicioLocalDate {

    public static void main(String[] args) {

        LocalDateTime data = LocalDateTime.of(2010, 05, 15, 10, 00, 00);

        System.out.println(data);

        // adicionando
        LocalDateTime dataAdd = LocalDateTime.of(2010, 05, 15, 10, 00, 00)
                .minusYears(4).plusMonths(6).plusHours(13);

        String dataAddFormatado = dataAdd.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        System.out.println(dataAdd);
        System.out.println(dataAddFormatado);
    }
}
