package Java2.DateTesting;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class EsercizioDate3 {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        System.out.println(data);

        String ottieniAnno = data.format(DateTimeFormatter.ofPattern("yyyy"));
        System.out.println("Anno: " + ottieniAnno);
        String ottieniMese = data.format(DateTimeFormatter.ofPattern("MMMM"));
        System.out.println("Mese: " + ottieniMese);
        String ottieniGiorno = data.format(DateTimeFormatter.ofPattern("dd"));
        System.out.println("Giorno: " + ottieniGiorno);
        String ottieniGiornoDellaSettimana = data.format(DateTimeFormatter.ofPattern("EEEE"));
        System.out.println("Giorno della settimana: " + ottieniGiornoDellaSettimana);

        System.out.println("Fusioneeee: " + ottieniGiornoDellaSettimana + ", " + ottieniGiorno + "/" + ottieniMese + "/" + ottieniAnno);

        String fusioneSenzaCasini = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(fusioneSenzaCasini);
    }
}
