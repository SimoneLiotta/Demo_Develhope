package Java2.DateTesting.EsercizioTesting2;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class Main {

    public void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println(data);

        System.out.println("dataFormattata1: " + dataFormattata(data, FormatStyle.FULL));
        System.out.println("dataFormattata2: " + dataFormattata(data, FormatStyle.MEDIUM));
        System.out.println("dataFormattata3: " + dataFormattata(data, FormatStyle.SHORT));

    }

    public String dataFormattata(OffsetDateTime data, FormatStyle pattern) {
        String dataFormattata = data.format(DateTimeFormatter.ofLocalizedDate(pattern));
        return dataFormattata;

    }
}

