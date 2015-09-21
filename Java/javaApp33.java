package javaapplication33;

 // @author Joel Burdette
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class JavaApplication33 {

    public static void main(String args[]) throws IOException {
        String fileName = "test.xls";
        PrintWriter out = new PrintWriter(new FileWriter(fileName));
        JavaApplication33 a = new JavaApplication33();
        double rand;
        for (int i = 2; i <= 10; i++) {// each node
            double success = 0.0;
            for (double prob = .1; prob <= .9; prob += .1) { //each probability
                for (int k = 0; k <= 999; k++) { //each case
                    rand = Math.random();
                    if (rand <= prob) {
                        success++;
                    }
                }
                double percent = success / 1000.0;
                System.out.print(percent + " ");
                out.print(percent);
            }
            System.out.println();
            out.println();
        }
        out.close();
    }
}
