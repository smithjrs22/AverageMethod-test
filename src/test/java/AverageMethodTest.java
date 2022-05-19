import static org.junit.jupiter.api.Assertions.*;

class AverageMethodTest {

    @org.junit.jupiter.api.Test
    void checkSum() {
        assertEquals(15,AverageMethod.sum(5,5,5));
    }

    @org.junit.jupiter.api.Test
    void checkAverage() {
        assertEquals(5,AverageMethod.average(5,5,5));
    }



}