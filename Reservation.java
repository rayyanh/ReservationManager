import java.util.*;

/**
 * @version 1
 * <p>
 * This class is a class that represents a request to the system to reserve an item
 * @Author rayyan hussain
 */
public class Reservation implements Comparable<Reservation> { //implements comparable
    private ReservableItem reserved;
    private String name;
    private int time;
    private String id;

    /**
     * Constructor for Reservation.
     *
     * @param customerName
     * @param timeslot
     */
    public Reservation(String customerName, int timeslot) {
        this.name = customerName;
        this.time = timeslot;
        id = null;
    }

    /**
     * Getter for id
     *
     * @return this.id
     */
    public String getId() {
        return this.id;
    }

    /**
     * Getter for customer name
     *
     * @return this.name
     */
    public String getCustomer() {
        return this.name;
    }

    /**
     * Getter for time
     *
     * @return time
     */
    public int getTime() {
        return this.time;
    }

    /**
     * Overriden custom toString method
     *
     * @return formatted text
     */
    @Override
    public String toString() {
        return "\n Reservation name: " + name + " : time: " + time + " : id: " + id;
    }

    /**
     * Setter for resourceid
     *
     * @param id
     */
    public void setResourceId(String id) {
        this.id = id;
    }

    /**
     * Overriden compareto method.
     *
     * @param o
     * @return this.name.compareTo(o.name);
     */
    @Override
    public int compareTo(Reservation o) {
        return this.name.compareTo(o.name);
    }
}