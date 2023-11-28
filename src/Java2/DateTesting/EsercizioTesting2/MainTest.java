package Java2.DateTesting.EsercizioTesting2;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.format.FormatStyle;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();
    OffsetDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z");
    @Test
    void dataFormattata() {
        String result1 = testing.dataFormattata(data, FormatStyle.FULL);
        assertEquals("venerdì 1 marzo 2002", result1, "dovrebbe restituire una data in formato FULL");

        String result2 = testing.dataFormattata(data, FormatStyle.MEDIUM);
        assertEquals("1 mar 2002", result2, "dovrebbe restituire una data in formato MEDIUM");

        String result3 = testing.dataFormattata(data, FormatStyle.SHORT);
        assertEquals("01/03/02", result3, "dovrebbe restituire una data in formato SHORT");

    }

}