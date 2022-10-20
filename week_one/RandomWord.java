package week_one;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String winner = "";
        int readTimes = 0;
        while (!StdIn.isEmpty()) {
            readTimes++;
            String tempStr = StdIn.readString();
            if (StdRandom.bernoulli((double) 1 / readTimes)) {
                winner = tempStr;
            }
        }
        System.out.println(winner);
    }
}
