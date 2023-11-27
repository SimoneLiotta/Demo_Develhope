package Java2.DateTesting;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class EsercizioDate1 {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println(data);

        String dataFormattata1 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println("dataFormattata1: " + dataFormattata1);

        String dataFormattata2 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println("dataFormattata2: " + dataFormattata2);

        String dataFormattata3 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println("dataFormattata3: " + dataFormattata3);
        //nelle lezioni la short esce 01/03/2002 come qui anche l'anno esce abbreviato ?

    }
}
