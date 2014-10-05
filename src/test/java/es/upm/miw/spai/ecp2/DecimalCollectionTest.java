package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {

    private DecimalCollection dec;
    @Before
    public void before() {
        dec = new DecimalCollection();
    }
    @Test
    public void testDecimalCollection() {
        dec=new DecimalCollection();
    }

    @Test
    public void testAdd() {
        this.dec.add(5.8);
        assertEquals(1, dec.size());
    }

    @Test
    public void testSize() {
        this.dec.add(6.1);
        assertEquals(1,dec.size());
    }

    @Test
    public void testSum() {
        this.dec.add(4.0);
        this.dec.add(5.8);
        assertEquals(9.8, dec.sum(),10e-5);
    }

    @Test
    public void testHigher() {
        this.dec.add(9.0);
        assertEquals(9.0, dec.higher(),10e-5);
    }
    
    @Test
    public void testAverage(){
    	this.dec.add(3.0);
        this.dec.add(2.8);
        this.dec.add(1.5);
    	assertEquals(2.43, dec.average(),10e-5);
	}
 }
