package Java2.DateTesting.EsercizioTesting5;


import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();
    OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @Test
    void aggiungiAnno() {
        OffsetDateTime result = testing.aggiungiAnno(data);
        assertEquals("2024-03-01T13:00Z", result.toString(),"Dovrebbe uscire un anno in piu della data iniziale");
    }
    @Test
    void sottraiMese() {
        OffsetDateTime result = testing.sottraiMese(data);
        assertEquals("2023-02-01T13:00Z", result.toString(), "Dovrebbe uscire un mese in meno della data iniziale");
    }

    @Test
    void aggiungiGiorno() {
        OffsetDateTime result = testing.aggiungiGiorno(data);
        assertEquals("2023-03-08T13:00Z", result.toString(), "Dovrebbe uscire 7 giorni in più della data iniziale");
    }

    @Test
    void localizzaItalia() {
        String result = testing.localizzaItalia(data);
        assertEquals("mercoledì, 01/marzo/2023", result, "Dovrebbe uscire la data scritta in Italiano");
    }
}