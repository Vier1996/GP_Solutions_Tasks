package GP_Solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
public class Task_99 {

    public static class Wave {
        private int SAVE_I, SAVE_J, I, J, Lvl;
        private String[][][] M;

        Wave(String[][][] M, int I, int J, int Lvl) throws InterruptedException {
            this.I = I;
            this.J = J;
            this.Lvl = Lvl;
            this.M = M;

            T_THREAD T = new T_THREAD(I, J, M);
            T.start();
            T.join();
            this.SAVE_I = T.SI;
            this.SAVE_J = T.SJ;
        }

        private int Rec_Wave(int I, int J, int L, int W, String[][][] M, int LVL, int Old_Pos_I, int Old_Pos_J, int Counter, int WHO, ArrayList<Integer> DATA) {

            if (I >= L || J >= W || I < 0 || J < 0 || M[LVL][I][J].equals("o") || Old_Pos_I == I && Old_Pos_J == J || M[LVL][I][J].equals("..")) {
                return 0;
            }
            if(WHO == 0) {
                if (M[LVL][I][J].equals(M[LVL + 1][I][J])) {
                    DATA.add(++Counter);
                    SAVE_I = I;
                    SAVE_J = J;
                    return 1;
                }
            }
            else {
                if (M[LVL][I][J].equals("2")) {
                    DATA.add(Counter);
                    SAVE_I = I;
                    SAVE_J = J;
                    return 1;
                }
            }

            M[LVL][I][J] = "..";

            if(Rec_Wave(I, J + 1, 3, 3, M, LVL, I, J, Counter + 1, WHO, DATA) != 1)
                if(Rec_Wave(I + 1, J, 3, 3, M, LVL, I, J, Counter + 1, WHO, DATA) != 1)
                    if(Rec_Wave(I, J - 1, 3, 3, M, LVL, I, J, Counter + 1, WHO, DATA) != 1)
                        Rec_Wave(I - 1, J, 3, 3, M, LVL, I, J, Counter + 1, WHO, DATA);

            return -1;
        }

        private int RUN() {
            int OUR_TIME = 0;

            for(int i = 0; i < Lvl - 1; i++) {
                ArrayList<Integer> DATA = new ArrayList<>();
                Rec_Wave(SAVE_I, SAVE_J, 3, 3, M, i, -3, -3, 0, 0, DATA);
                Collections.sort(DATA);
                OUR_TIME += DATA.get(0);
            }
            ArrayList<Integer> DATA = new ArrayList<>();
            Rec_Wave(SAVE_I, SAVE_J, 3, 3, M, Lvl - 1, -3, -3, 0, 1, DATA);
            Collections.sort(DATA);
            OUR_TIME += DATA.get(0);

            return OUR_TIME;
        }
    }

    public static class T_THREAD extends Thread {
        public int SI, SJ, I, J;
        public String[][][] M;

        T_THREAD(int I, int J, String[][][] M) {
            this.SI = 0;
            this.SJ = 0;
            this.I = I;
            this.J = J;
            this.M = M;

        }

        @Override
        public void run() {
            for(int i = 0; i < I; i++) {
                for(int j = 0; j < J; j++) {
                    if (M[0][i][j].equals("1")) {
                        SI = i;
                        SJ = j;
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        String[][][] MASS = new String[][][] {{{"1", ".", "."},
                                               {"o", "o", "."},
                                               {".", ".", "."}},

                                               {{"o", "o", "o"},
                                                {".", ".", "o"},
                                                {".", "o", "o"}},

                                               {{"o", "o", "o"},
                                                {"o", ".", "."},
                                                {"o", ".", "2"}}
                                                };
        Wave W = new Wave(MASS, 3, 3,3);

        Date date1 = new Date();
        System.out.println(date1.toInstant());
        System.out.println(W.RUN());

        Date date2 = new Date();
        System.out.println(date2.toInstant());
        System.exit(0);
    }
}
