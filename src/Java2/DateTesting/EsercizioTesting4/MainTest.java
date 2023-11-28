package Java2.DateTesting.EsercizioTesting4;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;
import java.time.Month;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();
    OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
    @Test
    void ottieniAnno() {
        int result = testing.ottieniAnno(data);
        assertEquals(2023,result, "Dovrebbe uscire solo l'anno: 2023");
    }

    @Test
    void ottieniMese() {
        Month result = testing.ottieniMese(data);
        assertEquals("MARCH",result.toString(), "Dovrebbe uscire solo il mese: MARCH");
    }

    @Test
    void ottieniGiorno() {
        int result = testing.ottieniGiorno(data);
        assertEquals(01,result, "Dovrebbe uscire solo il giorno: 01");
    }

    @Test
    void ottieniGiornoDellaSettimana() {
        DayOfWeek result = testing.ottieniGiornoDellaSettimana(data);
        assertEquals("WEDNESDAY",result.toString(), "Dovrebbe uscire solo il giorno della settimana: WEDNESDAY");
    }
}