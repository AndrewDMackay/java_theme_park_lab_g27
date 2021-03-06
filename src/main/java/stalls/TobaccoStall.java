
package stalls;

import behaviours.IReviewed;
import behaviours.ISecurity;

public class TobaccoStall extends Stall implements ISecurity, IReviewed {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public boolean isAllowedTo() {
        return false;
    }

    @Override
    public int getRating() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
}
