
package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;


public class Playground extends Attraction implements ISecurity, IReviewed {

    public Playground(String name, int rating) {
        super(name, rating);
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
