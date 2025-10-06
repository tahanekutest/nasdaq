package com.nasdaq.challenge.loopprinter.utils;

public class LoopPrinter {

    /**
 * Prints a nested loop pattern of "Outer" and "Inner" labels based on the given {@code count}.
 * <p>
 * The method always runs 10 outer iterations. For each outer iteration:
 * <ul>
 *   <li>Prints {@code "Outer: X"} (1-based index).</li>
 *   <li>Prints a descending sequence of {@code "Inner: N"} values.</li>
 * </ul>
 * The total number of inner values is {@code count * 10}, distributed evenly across the 10 outer loops.
 * For {@code count = 1}, one inner value is printed per outer; for {@code count = 10}, ten per outer.
 * </p>
 *
 * <p>If {@code count <= 0}, prints {@code "Count must be a positive integer."} and exits.</p>
 *
 * <h4>Example</h4>
 * <pre>
 * doSomething(1):
 * Outer: 1
 * Inner: 10
 * ...
 * Outer: 10
 * Inner: 1
 *
 * doSomething(10):
 * Outer: 1
 * Inner: 100
 * Inner: 99
 * ...
 * Outer: 10
 * Inner: 1
 * </pre>
 *
 * @param count number controlling total inner prints; must be positive.
 */
    public void doSomething(int count) {
        if(count <= 0){
            System.out.println("Count must be a positive integer.");
            return;
        }
        int innerStart = count * 10;
        int offset = innerStart/10;

        for (int i = 0; i < 10; i++) {
            System.out.println("Outer: " + (i + 1));
            int innerEnd = innerStart-offset;
            for (int j = innerStart; j>innerEnd; j--) {
                System.out.println("Inner: " + j);
                innerStart--;
            }
        }
    }
}