import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @version 1
 * @Author rayyan hussain
 * <p>
 * Class : as a child class of reservable item and acts asan itme that can be reserved based on
 * the boat types
 */
public class Boat extends ReservableItem {
    ArrayList<String> pref = new ArrayList<>();

    /**
     * Constructor
     *
     * @param filein
     * @throws FileNotFoundException
     */
    public Boat(Scanner filein) throws FileNotFoundException {
        super(filein);
    }

    /**
     * Fitness value override
     * Overriden Method tries to find best spot for reservation in the reservation system.
     *
     * @param res
     */
    @Override
    public int getFitnessValue(Reservation res) {
        BoatReservation reserv = (BoatReservation) res;
        int time = reserv.getTime();
        pref = reserv.getPreferences();
        Reservation[] reservations = this.getReservations();
        if (reservations[time] == null) {
            for (int i = 0; i < pref.size(); i++) {
                if (pref.get(i).equals(getId())) {
                    return 100 - i;
                }
            }
        }
        return 0;
    }
}



