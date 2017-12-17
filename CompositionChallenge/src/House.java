/**
 * Created by vinoth on 07-Oct-17.
 */
public class House {

    private Room room;
    private Roof roof;
    private Wall walls;
    private Door door;
    private Window window;
    private PowerSupply powerSupply;
    private WaterSupply waterSupply;
    private Flooring flooring;
    private Garden garden;

    public House(Roof roof, Wall walls, Door door, Window window, PowerSupply powerSupply, WaterSupply waterSupply, Flooring flooring, Garden garden) {
        this.roof = roof;
        this.walls = walls;
        this.door = door;
        this.window = window;
        this.powerSupply = powerSupply;
        this.waterSupply = waterSupply;
        this.flooring = flooring;
        this.garden = garden;
    }

    public void buildHouse(){

        addBedRooms();
        //getWalls().paintWalls(); --> Below line will also work.
        walls.paintWalls();

        powerSupply.turnOn();
        waterSupply.turnOn();
    }

    private void addBedRooms (){

        Bed masterBed = new Bed ("King", "Spring");
        BedRoom masterBedRoom = new BedRoom(100, 1, 2, true, true, masterBed);
        System.out.println("Master Bedroom added");

        BedRoom childrenBedRoom = new BedRoom(80, 1, 1, true, true, new Bed("Double", "Coir"));
        System.out.println("Children bed room added");
    }

    public Room getRoom() {
        return room;
    }

    public Roof getRoof() {
        return roof;
    }

    private Wall getWalls() {
        return walls;
    }

    public Door getDoor() {
        return door;
    }

    public Window getWindow() {
        return window;
    }


    public Flooring getFlooring() {
        return flooring;
    }

    public Garden getGarden() {
        return garden;
    }
}
