package Java2.DateTesting.EsercizioTesting3;

import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
   private final Main testing = new Main();

   OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

    @Test
    void formattedData() {
        String result = testing.formattedData(data);
        assertEquals("01 marzo 2023", result, "Dovrebbe restituire la data nel fomato: 1 marzo 2023");
    }
}