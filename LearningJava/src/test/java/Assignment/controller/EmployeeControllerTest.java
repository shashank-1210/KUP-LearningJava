package Assignment.controller;

import Assignment.entity.Employee;
import Assignment.service.SaveEmployeeService;
import Assignment.service.SaveEnployeeServiceImpl;
import Assignment.service.ValidateEmployeeService;
import Assignment.service.ValidateEmployeeServiceImpl;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class EmployeeControllerTest {

    ValidateEmployeeService v = new ValidateEmployeeServiceImpl();
    SaveEmployeeService s = new SaveEnployeeServiceImpl();

    ////Negative Test case because employee id is -1.
    @Test
    public void test1() {

        Employee e1 = new Employee(-1,"Shashank");

        assert(!v.validateEmployee(e1));
    }

    ////Negative Test case because employee name is null
    @Test
    public void test2() {

        Employee e1 = new Employee(1,null);
        assert(!v.validateEmployee(e1));


    }

    ////Negative Test case because employee id is -1 and employee name is null
    @Test
    public void test3() {

        Employee e1 = new Employee(-1,null);
        assert(!v.validateEmployee(e1));

    }

    ////Positive test case because employee id > 0 and employee name is not null
    @Test
    public void test4() {

        Employee e1 = new Employee(1,"Shashank");

        assert(v.validateEmployee(e1));

    }


    ////Positive Test Case
    @Test
    public void test5()
    {
       List<Employee> l= new ArrayList<Employee>();
       l.add(new Employee(1,"Shashank"));
       l.add(new Employee(-1,null));

        for (Employee e : l) {

            if(v.validateEmployee(e))
                s.saveEmployee(e);
        }

        int expected=1;

        Assert.assertEquals(1,s.getCountEmployee());

    }



}