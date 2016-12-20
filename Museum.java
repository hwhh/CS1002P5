/**
 * Created by henryhargreaves on 10/11/2015.
 */
public class Museum {
    private String name, location;
    private boolean type;
    private int noOfItems;
    private float entryFee;

    int noOfExhibitions = 0;
    int noOfEmployees = 0;
    int noOfFacilities = 0;

    static final int MAX_NUMBER_EXHIBITIONS = 10;
    Exhibition [] exhibitions = new Exhibition[MAX_NUMBER_EXHIBITIONS];
    static final int MAX_NUMBER_EMPLOYEES = 10;
    Employee [] employees = new Employee[MAX_NUMBER_EMPLOYEES];
    static final int MAX_NUMBER_FACILITIES = 10;
    Facility [] facilities = new Facility[MAX_NUMBER_FACILITIES];


    public Museum(String name, String location, boolean type, int noOfItems, float entryFee) {
        this.name = name;
        this.location = location;
        this.type = type;
        this.noOfItems = noOfItems;
        this.entryFee = entryFee;
    }

    public void addExhibition (Exhibition exhibition){
        try {
            this.exhibitions[noOfExhibitions]=exhibition;
            noOfExhibitions++;
            exhibition.setMuseum(this);
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    public void printDetails(){
        System.out.println("Name: "+name);

    }

    public void addEmployee (Employee employee){
       try{
           this.employees[noOfEmployees]=employee;
           noOfEmployees++;
           employee.setMuseum(this);
       }catch (Exception e){
           System.out.println("Error");
       }
    }

    public void addFacility (Facility facility){
        try{
            this.facilities[noOfFacilities]=facility;
            noOfEmployees++;
            facility.setMuseum(this);
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    public String getName() {
        return name;
    }

    public Facility[] getFacilities() {
        return facilities;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public Exhibition[] getExhibitions() {
        return exhibitions;
    }

    public float getEntryFee() {
        return entryFee;
    }

    public int getNoOfItems() {
        return noOfItems;
    }

    public boolean isType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setFacilities(Facility[] facilities) {
        this.facilities = facilities;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void setExhibitions(Exhibition[] exhibitions) {
        this.exhibitions = exhibitions;
    }
}
