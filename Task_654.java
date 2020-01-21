package GP_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_654 {

    private static void Amplfy(int[] VALUES, int L) {
        long S = 0;
        int SB = VALUES[0];
        int M = SB;

        for(int i = 1; i < L; i++) {
            int SN = VALUES[i];
            M = Math.max(M, SN);
            if(SN > SB)
                S += SN - SB;
            SB = SN;
        }
        S += M - SB;
        System.out.println(S);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(reader.readLine());
        String[] VS = reader.readLine().split(" ");
        int[] V = new int[L];
        for(int i = 0; i < L; i++) {
            V[i] = Integer.parseInt(VS[i]);
        }
        Amplfy(V, L);
    }
}
