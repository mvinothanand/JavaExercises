/**
 * Created by vinoth on 07-Oct-17.
 */
public class Main {

    public static void main (String[] args){

        Roof roof = new Roof("RCC", "Flat");
        Wall walls = new Wall("ClayBricks", 4.0, false);
        Door door = new Door(8, 3, .25);
        PowerSupply powerSupply = new PowerSupply(3, 240, "Dodo");
        WaterSupply waterSupply = new WaterSupply("Dodo", 10);
        Flooring floor = new Flooring("Carpet", "Smooth");
        Garden garden = new Garden(100);

        House myHouse = new House(roof, walls,door, new Window("Glass", 4, 2.5), powerSupply, waterSupply, floor, garden);

        myHouse.buildHouse();
    }
}
