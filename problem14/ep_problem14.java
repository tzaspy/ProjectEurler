
/*
Longest Collatz sequence
========================

The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.
*/


public class ep_problem14 {

    public static void main(String[] args) {

        final long STARTING_NUMBER = 1000000;

        long startTime = System.currentTimeMillis();
        long n;
        long downLimit = STARTING_NUMBER / 2;
        long upLimit = STARTING_NUMBER % 2 == 0 ? STARTING_NUMBER -1 : STARTING_NUMBER;
        int counter;
        int longestCounter = 1;
        long startingNumber = STARTING_NUMBER;

        for (long i = upLimit; i > downLimit / 2; i -=2 ) {
            n = i;
            counter = 1;
            while (n > 1) {
                if (n % 2 == 0) {
                    n = (n / 2);
                    counter++;
                } else {
                    n = (3 * n + 1) / 2;
                    counter += 2;
                }
            }

            if (longestCounter < counter) {
                longestCounter = counter;
                startingNumber = i;
            }

        }
        long endTime   = System.currentTimeMillis();
        long totalTime = (endTime - startTime);
        System.out.println("Max counts: Number : " + startingNumber + " Steps  : " + longestCounter);
        System.out.println("Took " + totalTime + "ms");
        // OS:        Ubuntu 14.04.5 LTS
        // OS type:   64-bit
        // CPU model: Intel(R) Core(TM) i3-3220 CPU @ 3.30GHz
        // Time:      180ms
    }
}
