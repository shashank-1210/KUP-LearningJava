package Assignment.controller;




import Assignment.entity.Employee;
import Assignment.service.*;

import java.util.List;


public class EmployeeController {

    public static void main(String[] args){
    	
        ValidateEmployeeService validateEmployeeService = new ValidateEmployeeServiceImpl();
        SaveEmployeeService saveEmployeeService = new SaveEnployeeServiceImpl();
        ReadData read= new ReadDataImpl();
        
        List<Employee> empList = read.readData();

        empList.stream().filter(obj->validateEmployeeService.validateEmployee(obj)).forEach(saveEmployeeService::saveEmployee);

        System.out.println("Saved employee  : "+saveEmployeeService.getCountEmployee());


}
}