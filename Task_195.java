package GP_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_195 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] NAB = reader.readLine().split(" ");
        System.out.println((Integer.parseInt(NAB[1]) * Integer.parseInt(NAB[2])) * 2 * Integer.parseInt(NAB[0]));
    }
}
