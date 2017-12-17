/**
 * Created by vinoth on 07-Oct-17.
 */
public class Wall {

    private String madeOf;
    private double thickness;
    private boolean isPainted;

    public Wall(String madeOf, double thickness, boolean isPainted) {
        this.madeOf = madeOf;
        this.thickness = thickness;
        this.isPainted = isPainted;
    }

    public void paintWalls(){
        System.out.println("Wall.paintWalls: + Painting done");
    }
}
