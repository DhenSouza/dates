package dateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercicioFinalFormat {

    public static void main(String[] args) {

        Date agora = new Date();


        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:mmm");


        String dataFormatada = formatter.format(agora);


        System.out.println(dataFormatada);
        // 10/05/2021
    }
}
