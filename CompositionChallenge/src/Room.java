/**
 * Created by vinoth on 07-Oct-17.
 */
public class Room {

    private double size;
    private int noOfDoors;
    private int noOfWindows;
    private boolean isFurnished;

    public Room(double size, int noOfDoors, int noOfWindows, boolean isFurnished) {
        this.size = size;
        this.noOfDoors = noOfDoors;
        this.noOfWindows = noOfWindows;
        this.isFurnished = isFurnished;
    }

    public double getSize() {
        return size;
    }

    public int getNoOfDoors() {
        return noOfDoors;
    }

    public int getNoOfWindows() {
        return noOfWindows;
    }

    public boolean isFurnished() {
        return isFurnished;
    }
}
