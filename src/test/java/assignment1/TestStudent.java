package assignment1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestStudent {

    Student student1 = new Student("Luke", 19, "10/05/2002", 45);
    Lecturer lecturer1 = new Lecturer("John", 23, "10/09/1999", 100456);

    @Test
    public void testCreateStudentUsername(){
        assertEquals("Luke19", student1.createStudentUserName("Luke", 19));
    }

    @Test
    public void testCreateLecturerUserName(){
        assertEquals("John23", lecturer1.createLecturerUserName("Luke", 19));
    }
}
