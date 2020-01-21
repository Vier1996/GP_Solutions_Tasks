package GP_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_53 {

    public static void Raskraska(int A, int B) {
        int Red = 0, Green = 0, Blue = 0, Black = 0;

        for(int i = B; i >= 1; i--) {
            for(int j = A; j >= 1; j--) {
                if((i * j) % 5 == 0)
                    Blue++;
                else
                    if((i * j) % 3 == 0)
                        Green++;
                    else
                        if((i * j) % 2 == 0)
                            Red++;
                        else
                            Black++;
            }
        }
        System.out.println("RED : " + Red);
        System.out.println("GREEN : " + Green);
        System.out.println("BLUE : " + Blue);
        System.out.println("BLACK : " + Black);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] MASS = reader.readLine().split(" ");
         Raskraska(Integer.parseInt(MASS[0]), Integer.parseInt(MASS[1]));
    }
}
