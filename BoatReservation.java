import java.util.ArrayList;

/**
 * @version 1
 * @Author rayyan hussain
 * <p>
 * This class is a child class of reservation and thus uses an arraylist to get boat based reservations
 */
public class BoatReservation extends Reservation {
    private ArrayList<String> pref = new ArrayList<>();

    public BoatReservation(int timeslot, String customerName) {
        super(customerName, timeslot);

    }

    /**
     * Add method for boad addition to arraylist
     *
     * @param boatName
     */
    public void addBoatPreference(String boatName) {
        pref.add(boatName);
    }

    /**
     * Getter for arraylist of preference
     *
     * @return this.pref
     */
    public ArrayList<String> getPreferences() {
        return this.pref;
    }


}
