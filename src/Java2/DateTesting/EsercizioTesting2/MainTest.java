package Java2.DateTesting.EsercizioTesting2;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();
    OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");

    @Test
    void fullFormattedData() {
        String result1 = testing.fullFormattedData(data);
        assertEquals("venerdì 1 marzo 2002", result1, "dovrebbe restituire una data in formato FULL");
    }

    @Test
    void mediumFormattedData() {
        String result2 = testing.mediumFormattedData(data);
        assertEquals("1 mar 2002", result2, "dovrebbe restituire una data in formato MEDIUM");
    }

    @Test
    void shortFormattedData() {
        String result3 = testing.shortFormattedData(data);
        assertEquals("01/03/02", result3, "dovrebbe restituire una data in formato SHORT");
    }

}