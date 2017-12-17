/**
 * Created by vinoth on 07-Oct-17.
 */
public class BedRoom extends Room{

    private boolean isMaster;
    private Bed bed;

    public BedRoom(double size, int noOfDoors, int noOfWindows, boolean isFurnished, boolean isMaster, Bed bed) {
        super(size, noOfDoors, noOfWindows, isFurnished);
        this.isMaster = isMaster;
        this.bed = bed;
    }
}
