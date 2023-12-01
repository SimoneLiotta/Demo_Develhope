package Java2.DateTesting;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class EsercizioDate2 {
    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(data);

        String dataFormattata = data.format(DateTimeFormatter.ofPattern("dd/MMMM/yyyy"));
        System.out.println(dataFormattata);
    }
}
