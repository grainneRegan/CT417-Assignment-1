package assignment1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStudent {

    Student student1 = new Student("Luke", 19, "10/05/2002", 45);

    @Test
    public void testCreateUsername(){
        assertEquals("Luke19", student1.createStudentUserName("Luke", 19));
    }
}
