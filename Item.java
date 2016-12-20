/**
 * Created by henryhargreaves on 10/11/2015.
 */
public class Item {
    static int uniqueCatalogueNo = 0;
    int ID;
    private String title, type;
    private float value;
    Museum museum;


    int noOfItems =0;

    static final int MAX_NUMBER_EXHIBITIONS = 10;
    Exhibition [] exhibitions = new Exhibition[MAX_NUMBER_EXHIBITIONS];

    public Item(float value, String type, String title, Museum museum) {
        this.value = value;
        this.type = type;
        this.title = title;
        this.museum = museum;
    }

    public void newCatalogueNo (){
        uniqueCatalogueNo++;
        this.ID=uniqueCatalogueNo;
    }


    public void addExhibition(Exhibition exhibition) {
        this.exhibitions[noOfItems] = exhibition;
        noOfItems++;
    }

    public void printDetails(){
        System.out.println("Unique Catalogue No: "+ID+
                " Title:" +title+ "Museum: "+ museum);

    }

    public int getUniqueCatalogueNo() {

        return uniqueCatalogueNo;
    }

    public float getValue() {
        return value;
    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public Museum getMuseum() {
        return museum;
    }

    public Exhibition[] getExhibitions() {
        return exhibitions;
    }
}
