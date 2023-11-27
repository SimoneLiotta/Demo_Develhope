package Java2.DateTesting;

import java.time.OffsetDateTime;

public class EsercizioDate5 {
    public static void main(String[] args) {
        OffsetDateTime data1 = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime data2 = OffsetDateTime.parse("2024-03-01T13:00:00Z");


        System.out.println("La prima data è precedente alla seconda? "+ data1.isBefore(data2));
        System.out.println("La seconda data è successiva alla prima? "+ data2.isAfter(data1));
        System.out.println("Le due date sono uguali? "+ data2.isEqual(data1));

    }
}
