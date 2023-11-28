package Java2.DateTesting;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class EsercizioDate3 {
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
}
