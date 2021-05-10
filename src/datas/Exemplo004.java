package datas;

import java.util.Date;

public class Exemplo004 {
    public static void main(String[] args) {
        Date dataNoPassado = new Date(1513124806L);

        Date dataNoFuturo = new Date(1613122400769L);

        Date mesmaDataNoFuturo = new Date(1613122400769L);

        /** Comparando se as datas são iguais**/
        boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);

        System.out.println(isEquals); //true

        /** comparando as datas com outras **/
        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo); // passado -> Futuro
        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado);  // futuro -> Passado
        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo); // datas equivalentes

        System.out.println(compareCase1); // -1
        System.out.println(compareCase2); // 1
        System.out.println(compareCase3); // 0
    }
}
