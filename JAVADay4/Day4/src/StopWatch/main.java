package StopWatch;

import java.util.Scanner;

public class main {
        public static void main(String[] args) {
            StopWatch st = new StopWatch();
            Scanner sc = new Scanner(System.in);
            st.Start();
            for (int i = 0; i < 1000000000; i++) {
                for (int j = 0; j < 1000000000; j++) {

                }
            }
            st.Stop();
            System.out.println(st.getElapsedTime());
        }
}
