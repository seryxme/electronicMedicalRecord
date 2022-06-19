package EMR;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {
    EMR.Test test;

    @BeforeEach
    void setUp() {
        test = new EMR.Test("Malaria Test");
    }

    @Test
    void testThatTestCanBeCreated() {
        assertNotNull(test);
    }

    @Test
    void testThatConstructorIsWorking() {
        assertEquals("Malaria Test", test.getTestName());
    }

    @Test
    void testThatTestResultCanBeProvided() {
        test.setTestResult("Malaria parasite found.");

        assertEquals("Malaria parasite found.", test.getTestResult());
    }
}