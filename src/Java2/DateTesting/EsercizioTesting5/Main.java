package Java2.DateTesting.EsercizioTesting5;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("Data iniziale: "+data);

        System.out.println("Aggiungi anno: " + aggiungiAnno(data));
        System.out.println("Sottrai mese " + sottraiMese(data));
        System.out.println("Aggiungi 7 giorni: " + aggiungiGiorno(data));
        System.out.println( "Data in Italiano: " + localizzaItalia(data));

    }

    public static OffsetDateTime aggiungiAnno(OffsetDateTime data){
        return data.plusYears(1);
    }
    public static OffsetDateTime sottraiMese(OffsetDateTime data){
        return data.minusMonths(1);
    }
    public static OffsetDateTime aggiungiGiorno(OffsetDateTime data){
        return data.plusDays(7);
    }
    public static String localizzaItalia(OffsetDateTime data){
        return data.format(DateTimeFormatter.ofPattern("EEEE, dd/MMMM/yyyy", Locale.ITALY));

    }
}
