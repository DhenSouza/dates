package datas;

import java.util.Date;

public class ExercicioFinal {

    public static void main(String[] args) {
        Date meuAniver = new Date(902325929947L);

        System.out.println(meuAniver);

        Date dataQualquer = new Date(1273932329947L);

        /** comparando se a data é anterior a meu nascimento**/
        boolean isAfter = meuAniver.after(dataQualquer);
        System.out.println(isAfter);

        /** Comparando se a data é posterior a meu aniversario**/
        boolean isBefore = meuAniver.before(dataQualquer);
        System.out.println(isBefore);

    }
}
