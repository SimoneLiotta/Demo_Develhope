package Java2.DateTesting.EsercizioTesting4;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println(data);

        int anno = data.getYear();
        System.out.println("Anno: " + anno);
        Month mese = data.getMonth();
        System.out.println("Mese: " + mese);
        int giorno = data.getDayOfMonth();
        System.out.println("Giorno: " + giorno);
        DayOfWeek giornoDellaSettimana = data.getDayOfWeek();
        System.out.println("Giorno della settimana: " + giornoDellaSettimana);


    }
    public static int ottieniAnno (OffsetDateTime data){
        return data.getYear();
    }
    public static Month ottieniMese (OffsetDateTime data){
        return data.getMonth();
    }
    public static int ottieniGiorno (OffsetDateTime data){
        return data.getDayOfMonth();
    }
    public static DayOfWeek ottieniGiornoDellaSettimana (OffsetDateTime data){
        return data.getDayOfWeek();
    }
}
