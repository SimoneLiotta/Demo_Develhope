package Java2.DateTesting.EsercizioTesting2;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
        System.out.println(data);


        System.out.println("dataFormattata1: " + fullFormattedData(data));
        System.out.println("dataFormattata2: " + mediumFormattedData(data));
        System.out.println("dataFormattata3: " + shortFormattedData(data));

    }

    public static String fullFormattedData(OffsetDateTime data) {
        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));

    }
    public static String mediumFormattedData(OffsetDateTime data) {
        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));

    }
    public static String shortFormattedData(OffsetDateTime data) {
        return data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));

    }
}

