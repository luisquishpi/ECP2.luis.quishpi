package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

    private Fraction fra;

    @Before
    public void before() {
        fra = new Fraction(5, 2);
    }

    @Test
    public void testFractionIntInt() {
        fra = new Fraction(7, 2);
    }

    @Test
    public void testFraction() {
        assertEquals(5, fra.getNumerator());
        assertEquals(2, fra.getDenominator());
    }

    @Test
    public void testGetNumerator() {
        assertEquals(5, fra.getNumerator());
    }

    @Test
    public void testGetDenominator() {
        assertEquals(2, fra.getDenominator());
    }

    @Test
    public void testDecimal() {
        assertEquals(2.50, fra.decimal(), 10e-5);
    }

    @Test
    public void testIsImpropia(){
        assertTrue(fra.isImpropia());  
    }
}
