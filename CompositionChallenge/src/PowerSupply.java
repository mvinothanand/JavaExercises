/**
 * Created by vinoth on 07-Oct-17.
 */
public class PowerSupply {

    private int noOfPhases;
    private int connection;
    private String supplier;

    public PowerSupply(int noOfPhases, int connection, String supplier) {
        this.noOfPhases = noOfPhases;
        this.connection = connection;
        this.supplier = supplier;
    }

    public void turnOn(){
        System.out.println("Power Supply turned on");
    }
}
