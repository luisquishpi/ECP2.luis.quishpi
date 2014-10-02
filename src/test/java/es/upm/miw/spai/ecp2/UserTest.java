package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {

    private User user;
    @Before
    public void before() {
        user=new User(1,"luis","quishpi");
    }
    @Test
    public void testUser() {
        user=new User(2,"juan","calle");
    }

    @Test
    public void testGetNumber() {
        assertEquals(1, user.getNumber());
    }

    @Test
    public void testGetName() {
        assertEquals("Luis", user.getName());
    }

    @Test
    public void testGetFamilyName() {
        assertEquals("Quishpi", user.getFamilyName());
    }

    @Test
    public void testFullName() {
        assertEquals("Luis Quishpi", user.fullName());
    }

    @Test
    public void testInitials() {
        assertEquals("L.", user.initials());
    }

}
