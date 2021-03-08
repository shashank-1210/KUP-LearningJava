package Assignment.service;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import Assignment.entity.Employee;





public class ReadDataImpl implements ReadData  {
	
	@Override
	public List<Employee> readData() {
	List<Employee> empList= getEmpDetails("EmpData");
		
	return empList;
		
	}
	
	public static List<Employee> getEmpDetails(String file)
	{
		List<Employee> empList =new ArrayList<>(); 
		Path pathToFile = Paths.get(file);
		
		try(BufferedReader br = Files.newBufferedReader(pathToFile)){
			
		   String row = br.readLine();
		   
		    while(row!=null){
		    	
		      String [] attributes = row.split(",");
		      Employee emp = getOneEmployee(attributes);
		      empList.add(emp);
		      row=br.readLine();
		   }
		    
		    
		  } catch (IOException e) {
		      e.printStackTrace();
		     }
		  
		  return empList;
	}
	
	
	
	public static Employee getOneEmployee(String[] attributes) {
		
		String empName;
		
		try{
	    	   empName = attributes[1];
	    	  }
	    	  catch(Exception e){empName = null;}
		
		Employee emp =new Employee(Integer.parseInt(attributes[0]),empName);
		
		return emp;
		
		
	}


		
}


