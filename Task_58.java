package GP_Solutions;

import java.util.Scanner;

public class Task_58 {

    private static String Check(int[][] Mx, int N, int M) {
        for(int i = 0; i < N - 1; i++) {
            for(int j = 0; j < M - 1; j++) {
                if(Mx[i][j] == Mx[i + 1][j] && Mx[i][j] == Mx[i][j + 1] && Mx[i][j] == Mx[i + 1][j + 1])
                    return "NO\n";
            }
        }
        return "YES\n";
    }

    public static void main(String[] args) {

        Scanner IN = new Scanner(System.in);
        int Reaptr = IN.nextInt();
        String OUTPUT = "";
        for(int i = 0; i < Reaptr; i++) {
            int N = IN.nextInt(), M = IN.nextInt();
            int[][] Matrix = new int[N][M];

            for(int J = 0; J < N; J++) {
                for(int K = 0; K < M; K++) {
                    Matrix[J][K] = IN.nextInt();
                }
            }
            if(N < 2 | M < 2)
                OUTPUT += "YES\n";
            else
                OUTPUT += Check(Matrix, N, M);
        }
        System.out.println(OUTPUT);
    }
}