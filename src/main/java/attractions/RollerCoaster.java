
package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed, IReviewed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo() {
        return false;
    }

    @Override
    public double defaultPrice() {
        return 0;
    }

    @Override
    public double priceFor() {
        return 0;
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
