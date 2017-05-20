package hu.webarticum.jbluffer;

import static org.junit.Assert.*;

import org.junit.Test;

import hu.webarticum.jbluffer.Person;


public class PersonTest {

    @Test
    public void test() {
        Person person = new Person();
        String email = person.getEmail();
        System.out.println(email);
        assertTrue(email.matches("[^@]+@[^@]+"));
        
        assertEquals(email, person.getEmail());
    }

}
