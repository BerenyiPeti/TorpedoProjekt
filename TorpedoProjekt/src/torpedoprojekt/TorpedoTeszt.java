/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torpedoprojekt;

import java.util.Random;

/**
 *
 * @author szf1_a2
 */
public class TorpedoTeszt {

    private static Random rnd = new Random();
    private static int[] pozicio = {1, 2, 3};
    private static int hajoHelye = rnd.nextInt(3) + 1;

    public static void main(String[] args) {
        //System.out.println(tesztLoves(2));
        tesztLoves(2);
    }

    public static int getHajoHelye() {
        return hajoHelye;
    }

    public static String tesztLoves(int poz) {
        int tipp = poz - 1;
        if (pozicio[tipp] == hajoHelye) {
            return "talált";
        } else {
            return "nem talált";

        }
    }

}
