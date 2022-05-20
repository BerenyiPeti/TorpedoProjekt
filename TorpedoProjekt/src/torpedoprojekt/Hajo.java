
package torpedoprojekt;

public class Hajo {

    private int[] pozicio;

    public Hajo(int[] pozicio) {
        this.pozicio = pozicio;
    }
    
    public String talalat(int poz) {
        if (poz == 3) {
            return "talált";

        } else {
            return "nem talált";

        }

    }
}
