package com.nasdaq.challenge.loopprinter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;

import com.nasdaq.challenge.loopprinter.utils.ILoopPrinter;

@SpringBootApplication
public class LoopPrinterApplication implements CommandLineRunner {

    private final ILoopPrinter loopPrinter;

    @Autowired
    public LoopPrinterApplication(ILoopPrinter loopPrinter) {
        this.loopPrinter = loopPrinter;
    }

    public static void main(String[] args) {
        SpringApplication.run(LoopPrinterApplication.class, args);
    }

    @Override
    public void run(String... args) {

        System.out.println("=== Test with count = 0 ===");
        loopPrinter.doSomething(0);
        
        System.out.println("=== Test with count = 1 ===");
        loopPrinter.doSomething(1);

        System.out.println("\n=== Test with count = 10 ===");
        loopPrinter.doSomething(10);
    }
}
