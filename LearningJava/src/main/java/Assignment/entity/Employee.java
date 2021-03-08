package Assignment.entity;

public class Employee {
    int id;
    String name;
    
    //Default Constructor
    public Employee() {
	
	}

    
    //Parameterized Constructor
	public Employee(int i, String s) {
        this.id=i;
        this.name=s;
    }
    
	
	//Getters and Setters
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + "]";
    }




}
