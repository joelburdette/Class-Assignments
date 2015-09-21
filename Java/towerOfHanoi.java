import java.io.*;
import java.lang.*;

public class HanoiTower {
    //n-1 to 
    public static void clk(int n, int startPole, int endPole) {
        if (n == 0) {
            return;
        }
        // here 6 is summation of poles, i.e, sigma(3) = 2+1+0 = 3
        int interPole = 3 - startPole - endPole;

        //System.out.println("Move n–1 disks from disk 1 to disk 3, using disk 2 as a temporary holding area.");
        clk(n - 1, startPole, endPole);

        System.out.println(n + ": " + startPole + "->" + endPole);

        //System.out.println("Move n–1 disks from disk 3 to disk 1, using disk 2 as a temporary holding area.");
        anticlk(n - 1, endPole, startPole);

        //System.out.println("Move n disk from disk 2 to disk 3.");
        System.out.println(n + ": " + interPole + "->" + endPole);

        //System.out.println("Move n - 1 disks from disk 1 to disk 3, using disk 2 as a temporary holding area.");
        anticlk(n - 1, startPole, endPole);
    }

    public static void anticlk(int n, int startPole, int endPole) {
       if (n == 0) {
            return;
        }
        // here 3 is summation of poles, i.e, sigma(3) = 2+1+0 = 3
        int interPole = 3 - startPole - endPole;

        //System.out.print("Move n–1 disks from disk 1 to disk 2, using disk 3 as a temporary holding area.");
       anticlk(n - 1, startPole, interPole);

        //System.out.print("Move the last disk (the largest) from disk 1 to disk 3.");
        System.out.println(n + ": " + startPole + "->" + endPole);

        //System.out.print("Move n–1 disks from disk 2 to disk 3, using disk 1 as a temporary holding area.");
        anticlk(n - 1, interPole, endPole);
    }

    public static void main(String[] args) {
        anticlk(1, 0, 2);
        System.out.println();
        clk(2, 0, 2);
        System.out.println();
        clk(3, 0, 2);
        System.out.println();
    }
}
