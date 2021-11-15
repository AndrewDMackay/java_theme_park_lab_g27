
package attractions;

import behaviours.IReviewed;
import behaviours.ITicketed;

public class Dodgems extends Attraction implements ITicketed, IReviewed {

    public Dodgems(String name, int rating) {
        super(name, rating);
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
