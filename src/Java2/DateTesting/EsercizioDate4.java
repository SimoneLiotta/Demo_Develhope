package Java2.DateTesting;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class EsercizioDate4 {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println("Data iniziale: "+data);

        OffsetDateTime dataAggiornata = data.plusYears(1);
        System.out.println("dataAggiornata: "+dataAggiornata);
        OffsetDateTime dataAggiornata1 = data.minusMonths(1);
        System.out.println("dataAggiornata1: "+dataAggiornata1);
        OffsetDateTime dataAggiornata2 = data.plusDays(7);
        System.out.println("dataAggiornata2: "+dataAggiornata2);

        String dataFinale = dataAggiornata2.format(DateTimeFormatter.ofPattern("EEEE, dd/MMMM/yyyy", Locale.ITALY));
        System.out.println("dataFinale: "+dataFinale);

    }
}
