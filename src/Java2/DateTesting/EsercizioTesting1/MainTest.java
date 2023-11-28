package Java2.DateTesting.EsercizioTesting1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    private final Main testing = new Main();

    @Test
    void isInRangeTrue() {
        boolean result = testing.isInRange(3,1,6);
        assertEquals(true, result, "In questo caso dovrebbe restituire true");
    }
    @Test
    void isInRangeFalse() {
        boolean result = testing.isInRange(2,3,6);
        assertEquals(false, result, "In questo caso dovrebbe restituire false");
    }
@Test
    void isInRangeError() {
        Boolean result = testing.isInRange(1,null,5);
        assertEquals(null, result, "Se uno dei parametri è null, dovrebbe restituire null");
    }

}