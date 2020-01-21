package GP_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2 {

    private static void ArPr(int i) {
        if(i == 0)
            System.out.println(1);
        else {
            boolean D = i < 0;

            if (D) {
                i *= -1;
                System.out.println(((i*(i + 1)/2) - 1) * -1);
            } else
                System.out.println(i*(i + 1)/2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArPr(Integer.parseInt(reader.readLine()));
    }
}
