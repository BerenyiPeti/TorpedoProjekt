package torpedoprojekt;

import java.util.Scanner;

public class TorpedoProjgram {
    
    private static int lovesek = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add meg hova szeretnél lőni:");
        boolean talalt;
        do {
            int loves = sc.nextInt();
            System.out.println(TorpedoTeszt.tesztLoves(loves));
            talalt = TorpedoTeszt.tesztLoves(loves).equals("talált");
            lovesek++;

        } while (!talalt);
        System.out.println("próbák száma: " + lovesek);

    }

}
