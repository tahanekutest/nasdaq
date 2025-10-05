// File: LoopPrinter.java

public class LoopPrinter {

    public static void doSomething(int count) {
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

    public static void doSomethingAlternative(int count) {
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
    // Basic test runner
    public static void main(String[] args) {
        System.out.println("=== Test with count = 1 ===");
        doSomething(1);
        
        System.out.println("\n=== Test with count = 10 ===");
        doSomething(10);

        // System.out.println("\n=== Test with count = 1 ===");
        // doSomethingAlternative(1);

        // System.out.println("\n=== Test with count = 10 ===");
        // doSomethingAlternative(10);

    }
}
