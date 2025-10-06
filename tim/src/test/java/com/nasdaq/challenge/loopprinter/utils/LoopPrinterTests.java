package com.nasdaq.challenge.loopprinter.utils;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.system.OutputCaptureExtension;

import org.springframework.boot.test.system.CapturedOutput;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@ExtendWith(OutputCaptureExtension.class)
class LoopPrinterTests {

    @Test
	void contextLoads() {
	}

   	@Test
    void testDoSomething_withCount1_shouldPrintDescending(CapturedOutput output) {
        // Act
        LoopPrinter loopPrinter = new LoopPrinter();
        loopPrinter.doSomething(1);

        // Assert
        String result = output.getOut();
        assertThat(result).contains("Outer: 1");
        assertThat(result).contains("Inner: 10");
        assertThat(result).contains("Inner: 1");
    }

	@Test
    void testDoSomething_withCount10_shouldPrintDescending(CapturedOutput output) {
        // Act
        LoopPrinter loopPrinter = new LoopPrinter();
        loopPrinter.doSomething(10);

        // Assert
        String result = output.getOut();
        assertThat(result).contains("Outer: 1");
        assertThat(result).contains("Inner: 100");
        assertThat(result).contains("Inner: 1");
    }

	@Test
    void testDoSomething_withZeroCount_shouldPrintError(CapturedOutput output) {
        // Act
		LoopPrinter loopPrinter = new LoopPrinter();
        loopPrinter.doSomething(0);
		String result = output.getOut();
		assertThat(result).contains("Count must be a positive integer.");
    }

    @Test
    void testDoSomething_withNegativeCount_shouldPrintError(CapturedOutput output) {
        // Act
		LoopPrinter loopPrinter = new LoopPrinter();
        loopPrinter.doSomething(-5);
		String result = output.getOut();
		assertThat(result).contains("Count must be a positive integer.");
    }

	@Test
    void testDoSomething_withInvalidCount_shouldNotPrintInnerOuterStatments(CapturedOutput output) {
        LoopPrinter loopPrinter = new LoopPrinter();
        loopPrinter.doSomething(0);
		String result = output.getOut();
        assertThat(result).doesNotContain("Outer: 1");
		assertThat(result).doesNotContain("Inner: 1");
		
    }
}