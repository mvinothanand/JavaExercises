/**
 * Created by vinoth on 07-Oct-17.
 */
public class WaterSupply {

    private String supplier;
    private double rate;

    public WaterSupply(String supplier, double rate) {
        this.supplier = supplier;
        this.rate = rate;
    }

    public void turnOn(){
        System.out.println("Water supply turned on");
    }
}
