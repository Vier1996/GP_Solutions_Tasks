package GP_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_254 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String OUTPUT = "";

        int Raz = Integer.parseInt(reader.readLine());
        int[] Org = new int[Raz];

        String[] C = reader.readLine().split(" ");

        for(int i = 0; i < Raz; i++) {
            Org[i] = Integer.parseInt(C[i]);
        }

        int Coupls = Integer.parseInt(reader.readLine());
        int[] Zam = new int[Coupls * 2];

        for(int i = 0; i < Coupls * 2; i += 2) {
            String[] SW = reader.readLine().split(" ");
            Zam[i] = Integer.parseInt(SW[0]);
            Zam[i + 1] = Integer.parseInt(SW[1]);
        }

        for(int i = 0; i < Org.length; i++) {
            for(int P = 0; P < Zam.length; P += 2) {
                if(Org[i] == Zam[P]) {
                    Org[i] = Zam[P + 1];
                    break;
                }
            }
        }

        for (int value : Org) {
            OUTPUT += value + " ";
        }

        System.out.println(OUTPUT);
    }
}
