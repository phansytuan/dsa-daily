package java_core.OOP.ClassObject_Encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void constructorInitialisesNameAndAge() {
        Person person = new Person("An", 20);

        assertEquals("An", person.getName());
        assertEquals(20, person.getAge());
    }

    @Test
    void settersUpdateFields() {
        Person person = new Person("An", 20);

        person.setName("Binh");
        person.setAge(30);

        assertEquals("Binh", person.getName());
        assertEquals(30, person.getAge());
    }

    @Test
    void setAgeRejectsNegativeValue() {
        Person person = new Person("An", 20);

        person.setAge(-1);

        assertEquals(20, person.getAge());
    }

    @Test
    void setAgeAcceptsZero() {
        Person person = new Person("An", 20);

        person.setAge(0);

        assertEquals(0, person.getAge());
    }
}
