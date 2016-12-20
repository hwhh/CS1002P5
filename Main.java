/**
 * Created by henryhargreaves on 10/11/2015.
 */
public class Main {
    public static void main (String[] args){


        Employee employee1 = new Employee("Bill", "Janitor", "123", 100.0f);
        Exhibition exhibition1 = new Exhibition("EXHIBITION-1");
        Facility facility1 = new Facility("Cafe-1", "Restroom-1","CarPark-1", "Shop-1");
        Museum museum1 = new Museum("Museum-1", "London", true, 100, 5.5f);
        Item item1 = new Item(10.0f, "painting","PAINTING-1", museum1);
        Item item2 = new Item(5.0f, "drawing","DRAWING-1", museum1);

        item1.newCatalogueNo();
        item2.newCatalogueNo();

        museum1.addExhibition(exhibition1);
        museum1.addEmployee(employee1);
        museum1.addFacility(facility1);

        item1.printDetails();
        item2.printDetails();
        museum1.printDetails();


    }

}
