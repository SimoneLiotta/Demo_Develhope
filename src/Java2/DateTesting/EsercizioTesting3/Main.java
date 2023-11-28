package Java2.DateTesting.EsercizioTesting3;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

        public static void main(String[] args) {

            OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
            System.out.println(data);

            System.out.println("Data formattata: " + formattedData(data));

    }
    public static String formattedData(OffsetDateTime data){
        return data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
    }
}
