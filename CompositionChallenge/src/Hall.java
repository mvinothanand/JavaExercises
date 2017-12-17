/**
 * Created by vinoth on 07-Oct-17.
 */
public class Hall extends Room{

    private boolean hasABalcony;

    public Hall(double size, int noOfDoors, int noOfWindows, boolean isFurnished, boolean hasABalcony) {
        super(size, noOfDoors, noOfWindows, isFurnished);
        this.hasABalcony = hasABalcony;
    }
}
