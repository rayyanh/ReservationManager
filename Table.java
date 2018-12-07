import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @version 1
 * @Author rayyan hussain
 * <p>
 * this class is the child class of reservable item. It basically allows for a type reservation to be
 * made which in this case is a table.
 */
public class Table extends ReservableItem {
    private int numSeats;
    private String id;

    /**
     * Constructor for table
     *
     * @param inFile
     * @throws FileNotFoundException
     */
    public Table(Scanner inFile) throws FileNotFoundException {
        super(new Scanner(inFile.next()));
        this.numSeats = inFile.nextInt();
    }

    /**
     * Getter for number of seats
     *
     * @return numSeats
     */
    public int getNumSeats() {
        return numSeats;
    }

    /**
     * This method
     *
     * @param res Overriden Method tries to find best spot for reservation in the reservation system.
     */
    @Override
    public int getFitnessValue(Reservation res) {
        RestaurantReservation reserve = (RestaurantReservation) res;
        int time = reserve.getTime();
        int seat = reserve.getNumSeatsNeeded();
        Reservation[] reservation = this.getReservations();
        if (time > 10) {
            return 0;
        }
        if (reservation[time] == null) {
            if (numSeats < seat) {
                return 0;
            } else {
                return 100 - (numSeats);
            }
        }
        return 0;
    }

}
