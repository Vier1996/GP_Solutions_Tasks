package GP_Solutions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_550 {

    private static String DayOfProgrm(int D) {
        int Day = 13;

        if(D % 400 == 0 | D % 4 == 0 & D % 100 != 0)
            Day--;

        if(D < 10) return Day + "/09/000" + D;
        if(D < 100) return Day + "/09/00" + D;
        if(D < 1000)
            return Day + "/09/0" + D;
        else
            return Day + "/09/" + D;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(DayOfProgrm(Integer.parseInt(reader.readLine())));
    }
}


