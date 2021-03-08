package Assignment.service;


import Assignment.entity.Employee;

public class ValidateEmployeeServiceImpl implements ValidateEmployeeService{


    @Override
    public boolean validateEmployee(Employee e) {
        if(e.getId() <=0){
            return false;
        }
        if(e.getName() == null ){
            return false;
        }
        return true;
    }
}
