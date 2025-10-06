package com.nasdaq.challenge.loopprinter.utils;

public class LoopPrinter {

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

    public void doSomethingAlternative(int count) {
        int start = count * 10;
        for (int i = 0; i < 10; i++) {
            System.out.println("Outer: " + (i + 1));
            int innerStart = start - (i * 10);
            int innerEnd = innerStart - 9;

            for (int j = innerStart; j >= innerEnd && innerEnd>=1; j--) {
                System.out.println("Inner: " + j);
            }
        }
    }
}