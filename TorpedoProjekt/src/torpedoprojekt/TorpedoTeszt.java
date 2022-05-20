/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torpedoprojekt;

/**
 *
 * @author szf1_a2
 */
public class TorpedoTeszt {
    
    public static void main(String[] args) {
        tesztLoves(3);
    }

    private static String tesztLoves(int poz) {
        Hajo hajo = new Hajo();
        String t = hajo.talalat(4);
        assert t.equals("talált"): "nem jó a találat ellenőrzése";
        return "";
    }
    
    
    
    
}
