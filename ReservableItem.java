import java.io.*;
import java.util.*;

/**
 * @version 1
 * <p>
 * This is one of the base classes for the reservations system that is being created. This class
 * is an abstract class and provides a template for other classes which will derive this class.
 * @Author Rayyan Hussain
 */
public abstract class ReservableItem {
    private static final int numberOfSlots = 10; //final var to control amount in reservation Array
    Reservation[] reservations = new Reservation[numberOfSlots]; //array initialization
    private String id;

    /**
     * This is the constructor for reservable item. grabs the first string from file
     *
     * @param filein
     */
    public ReservableItem(Scanner filein) {
        this.id = filein.nextLine();
    }

    /**
     * Getter for id.
     *
     * @return id
     */
    public String getId() {
        return id;
    }

    //abstract method which requeres this method to be created in the derived classes
    public abstract int getFitnessValue(Reservation res);

    /**
     * Getter for reservations
     *
     * @return reservations
     */
    public Reservation[] getReservations() {
        return reservations;
    }

    /**
     * Setter for reservations
     *
     * @param reservations
     */
    public void setReservations(Reservation[] reservations) {
        this.reservations = reservations;
    }
}
