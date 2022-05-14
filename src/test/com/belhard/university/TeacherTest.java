package test.com.belhard.university;

import com.belhard.university.model.Address;
import com.belhard.university.model.Teacher;
import com.belhard.university.service.TeacherService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TeacherTest {
    Teacher teacher1;

    @Before
    public void setUp() throws Exception {
        Address address = new Address("Minsk","Nemiga",22,22);
        teacher1 = new Teacher("Igor","Nikolaev","M", 22,address ,15,23);
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("тест закончен");
    }

    @Test
    public void teacherSalary() {
        int experiance=15;
        double worktime=23;
        teacher1.setExperiance(experiance);
        teacher1.setWorktime(worktime);
        int result =  (int) ((0.25*experiance + 3)*worktime);
        int resultReal = (int) TeacherService.teacherSalary(teacher1);
        assertTrue(result  == resultReal);
    }

    @Test
    public void setAgeWithZero() {
        int age = 0;
        int res =this.teacher1.getAge();
        teacher1.setAge(age);
        int res2 = this.teacher1.getAge();
        assertTrue(res==res2);

    }
}