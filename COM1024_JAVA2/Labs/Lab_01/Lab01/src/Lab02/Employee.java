package Lab02;

public class Employee {
    private String Id;
    private String Name;
    private double Salary;

    public Employee(String Id, String Name, double Salary) {
        this.Id = Id;
        this.Name = Name;
        this.Salary = Salary;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        if(Id == null){
            throw new IllegalArgumentException("Employee must have an ID!");
        }
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        if(Name == null){
            throw new IllegalArgumentException("Employee must fill their names");
        }
        this.Name = Name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double Salary) {
        if(Salary <= 0){
            throw new IllegalArgumentException("Employee's salary must over 0");
        }
        this.Salary = Salary;
    }

    
}
