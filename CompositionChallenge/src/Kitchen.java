/**
 * Created by vinoth on 07-Oct-17.
 */
public class Kitchen extends Room{

    private Stove stove;
    private boolean isModular;
    private double sinkType;
    private boolean hasMicroWave;

    public Kitchen(double size, int noOfDoors, int noOfWindows, boolean isFurnished, Stove stove, boolean isModular, double sinkType, boolean hasMicroWave) {
        super(size, noOfDoors, noOfWindows, isFurnished);
        this.stove = stove;
        this.isModular = isModular;
        this.sinkType = sinkType;
        this.hasMicroWave = hasMicroWave;
    }
}
