package GP_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_317 {

    private static void Presents(int X, int Y, int Z, int W) {
        int pres = 0;
        int R;
        for(int i = 0; i <= ((W / X)); i++) {
            for(int j = 0; j <= ((W / Y)); j++) {
                R = W - (X * i + Y * j);
                if(R >= 0 && R % Z == 0)
                    pres++;
            }
        }
        System.out.println(pres);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] MASS = reader.readLine().split(" ");
        Presents(Integer.parseInt(MASS[0]), Integer.parseInt(MASS[1]), Integer.parseInt(MASS[2]), Integer.parseInt(MASS[3]));
    }
}
