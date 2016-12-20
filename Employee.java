/**
 * Created by henryhargreaves on 10/11/2015.
 */
public class Employee {
    private String name, contactNo, role;
    private  float salary;
    Museum museum;

    public Employee(Museum museum) {
        this.museum = museum;
    }

    public Employee(String name, String role, String contactNo, float salary) {
        this.name = name;
        this.role = role;
        this.contactNo = contactNo;
        this.salary = salary;
    }

    public void setMuseum(Museum museum) {
        this.museum = museum;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public Museum getMuseum() {
        return museum;
    }

    public float getSalary() {
        return salary;
    }

    public String getRole() {
        return role;
    }

    public String getContactNo() {
        return contactNo;
    }

    public String getName() {
        return name;
    }


}
