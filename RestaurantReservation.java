import java.util.Scanner;

/**
 * @version 1
 * @Author rayyan hussain
 * <p>
 * this class is a child of the reservation class and lets one make a reservation fr a restaurant.
 */
public class RestaurantReservation extends Reservation {
    private int numSeatsNeeded;

    /**
     * Constructor for Restaurantreservation
     *
     * @param numSeatsNeed
     * @param timeslot
     * @param name
     */
    public RestaurantReservation(int numSeatsNeed, int timeslot, String name) {
        super(name, timeslot);
        this.numSeatsNeeded = numSeatsNeed; //changed var name for tracking purposes
    }

    /**
     * Getter for numseats neeeded
     */
    public int getNumSeatsNeeded() {
        return this.numSeatsNeeded;
    }

    /**
     * Overriden to string method
     *
     * @return tostring set based on preferences and to show code clearly
     */
    @Override
    public String toString() {
        return super.toString() + " : " + this.numSeatsNeeded + "\n";
    }

}
