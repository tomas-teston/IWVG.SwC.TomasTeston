package es.upm.miw.iwvg.forge.junit;

import org.apache.logging.log4j.LogManager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FractionTest {

    private Fraction fraction;

    @BeforeEach
    void beforeEach() {
        this.fraction = new Fraction(10, 2);
    }

    @Test
    void testDecimal() {
        assertEquals(5, this.fraction.decimal());
    }

    @Test
    void testNumerador() {
        assertEquals(10, this.fraction.getNumerator());
    }

    @Test
    void testDenominador() {
        assertEquals(2, this.fraction.getDenominator());
    }

    @Test
    void divisionByZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> new Fraction(10,0).decimal());
        LogManager.getLogger(this.getClass()).debug(exception.getMessage());
    }


}
