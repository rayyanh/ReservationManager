import java.util.*;

/**
 * @version 1
 * @Author rayyan hussain
 * <p>
 * This class uses generics to hold a list of reservable items as well as a list of reservations.
 * This class also uses a sorting algorithm to sort different reservations
 */
public class ResManager<ItemType extends ReservableItem, ResType extends Reservation> {
    private ArrayList<ItemType> items; //class type arraylists
    private ArrayList<ResType> reserve;

    /**
     * NO args constructor which also sets value to arrayLists.
     */
    public ResManager() {
        items = new ArrayList<>();
        reserve = new ArrayList<>();
    }

    /**
     * Method to add item to arraylist.
     *
     * @param item
     */
    public void addReservable(ItemType item) {
        items.add(item);
    }

    /**
     * Method for making a reservation.
     * <p>
     * It uses checkers to check for certain cases as described in the assignment and returns accordingly.
     *
     * @param trialRes
     */
    public Reservation makeReservation(Reservation trialRes) {
        int fitnessVal = 0;
        int index = 0;
        for (int i = 0; i < items.size(); i++) {
            int current = (((ReservableItem) items.get(i)).getFitnessValue(trialRes));
            if (current > fitnessVal) {
                fitnessVal = current;
                index = i;
            } else if (fitnessVal == 100) {
                break;
            }
        }
        if (fitnessVal > 0) {
            ((ReservableItem) items.get(index)).reservations[trialRes.getTime()] = trialRes;
            this.reserve.add((ResType) trialRes);
            trialRes.setResourceId(((((ReservableItem) items.get(index)).getId())));
            return trialRes;
        }
        return null;
    }

    /**
     * method to use Bubble sort used to sort the different reservations
     */
    public void sortReservations() {
        //uses sort
        for (int i = 0; i < reserve.size(); i++) {
            boolean sort = true;
            for (int j = 0; j < reserve.size(); j++) {
                if (reserve.get(i).compareTo(reserve.get(j)) < 0) {
                    ResType type = reserve.get(i);
                    reserve.set(i, reserve.get(j));
                    reserve.set(j, type);
                    sort = false;
                }
            }
            if (sort) {
                break;
            }
        }
    }

    /**
     * Overriden to string method
     *
     * @return formatted text
     */
    @Override
    public String toString() {
        return reserve.toString();
    }
//

}
