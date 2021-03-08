package Assignment.service;



import Assignment.entity.Employee;

import java.util.*;


public class SaveEnployeeServiceImpl implements SaveEmployeeService {

    Map<Integer, Employee> employeeMap = new HashMap<Integer,Employee>();

    @Override



        public void saveEmployee (Employee employee){
            employeeMap.put(employee.getId(), employee);
        }




    public int getCountEmployee() {


        return employeeMap.size();
    }




}
