package com.nasdaq.challenge.loopprinter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nasdaq.challenge.loopprinter.utils.LoopPrinter;

@SpringBootApplication
public class LoopPrinterApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoopPrinterApplication.class, args);
        LoopPrinter loopPrinter = new LoopPrinter();
        System.out.println("=== Test with count = 1 ===");
        loopPrinter.doSomething(1);
        
        System.out.println("\n=== Test with count = 10 ===");
        loopPrinter.doSomething(10);
	}

}

