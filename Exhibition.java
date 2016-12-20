import java.util.Date;

/**
 * Created by henryhargreaves on 10/11/2015.
 */
public class Exhibition {
    private String title;
    private Date startDate, endDate;
    Museum museum;

    static final int MAX_NUMBER_ITEMS = 10;
    Item[] items = new Item[MAX_NUMBER_ITEMS];

    public Exhibition(String title) {
        this.title = title;
      //  this.endDate = endDate;
      //  this.startDate = startDate;
    }


    public void setMuseum(Museum museum) {
        this.museum = museum;
    }

    public String getTitle() {
        return title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Museum getMuseum() {
        return museum;
    }

    public Item[] getItems() {
        return items;
    }
}
