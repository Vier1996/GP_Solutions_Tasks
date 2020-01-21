package GP_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_46 {

    private static String ROUND(int A){
        if(A == 0)
            return "3";
        if(A == 25)
            return "2.7182818284590452353602875";

        String F = "2";
        String S = "7182818284590452353602875";
        StringBuilder Ret_S = new StringBuilder();
        char[] char_S = S.toCharArray();

        if(Integer.parseInt(Character.toString(char_S[A])) >= 5) {
            int ADD = Integer.parseInt(Character.toString(char_S[A - 1]));
            ADD++;
            char_S[A - 1] = Integer.toString(ADD).charAt(0);
        }

        for(int i = 0; i < A; i++) {
            Ret_S.append(Character.toString(char_S[i]));
        }

        return F + "." + Ret_S;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(ROUND(Integer.parseInt(reader.readLine())));
    }
}
