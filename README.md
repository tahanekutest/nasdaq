🌀 LoopPrinter Challenge

This project demonstrates a simple Java + Spring Boot application that prints a nested loop pattern based on an input count. Although the logic is small, the project is structured using production-ready practices — including an interface, dependency injection principles, and unit tests.

🧩 Overview

The main class defines a method doSomething(int count) that:

Runs an outer loop exactly 10 times.

For each iteration of the outer loop, runs an inner loop that prints descending numbers.

The total range of the inner loop is based on count × 10, counting down to 1.

Example Behavior
doSomething(1)

Outer: 1
Inner: 10
Outer: 2
Inner: 9
...
Outer: 10
Inner: 1

doSomething(10)

Outer: 1
Inner: 100
Inner: 99
...
Inner: 91
Outer: 2
Inner: 90
Inner: 89
...
Outer: 10
Inner: 10
Inner: 9
...
Inner: 1

Invalid Input

If count <= 0, the method prints:
Count must be a positive integer.
and exits early.

🧱 Architecture

The project follows clean, modular design:

ILoopPrinter – Interface defining the contract for any loop printer implementation.

LoopPrinter – Implementation of the nested loop printing logic, annotated with @Service.

LoopPrinterApplication – Main Spring Boot entry point that runs sample executions (count = 1 and count = 10).

LoopPrinterTests – JUnit 5 test class verifying output correctness and error handling.

This layout adheres to the Inversion of Control (IoC) principle — even though in unit tests, dependencies are instantiated manually (to avoid loading the Spring context unnecessarily).

🧰 Tech Stack

Java 17+

Spring Boot 3+

Gradle Build System

JUnit 5 for unit testing

AssertJ for fluent assertions

🚀 Running the Application
Run from IDE (IntelliJ / VS Code / Eclipse)

Open the project, run LoopPrinterApplication.java, and you’ll see console output for both count = 1 and count = 10.

Run from Terminal (Gradle)

If your project uses the Gradle Wrapper (recommended):

./gradlew bootRun


Run the tests:

./gradlew test


Build a JAR:

./gradlew clean build


Then execute the JAR manually:

java -jar build/libs/loopprinter-0.0.1-SNAPSHOT.jar

Expected Console Output
=== Test with count = 1 ===
Outer: 1
Inner: 10
Outer: 2
Inner: 9
...
Outer: 10
Inner: 1

=== Test with count = 10 ===
Outer: 1
Inner: 100
Inner: 99
...
Outer: 10
Inner: 1

🧪 Running Unit Tests

The project includes JUnit tests for:

Valid inputs (count = 1, count = 10)

Invalid inputs (count = 0, negative numbers`)

Run the tests with:

./gradlew test


Each test uses OutputCaptureExtension to verify console output. Spring Boot is not loaded during these tests — only the class logic is exercised, making them fast and isolated.

📂 Project Structure
com.nasdaq.challenge.loopprinter
│
├── LoopPrinterApplication.java       # Main entry point (Spring Boot)
│
└── utils
    ├── ILoopPrinter.java             # Interface defining behavior
    ├── LoopPrinter.java              # Implementation of nested loop logic
    └── LoopPrinterTests.java         # Unit tests (JUnit 5 + AssertJ)

🧠 Design Notes

Demonstrates Inversion of Control (IoC) via interface abstraction (ILoopPrinter).

LoopPrinter is annotated with @Service for potential Spring-managed injection.

In unit tests, dependencies are created manually using new LoopPrinter() (no Spring context needed).

The app can easily be extended to use real dependency injection (@Autowired) if additional components are introduced.

🌐 Making Your GitHub Repository Public

If your GitHub repository is currently private, here’s how to make it public:

Go to your repo page:
https://github.com/tahanekutest/nasdaq

Click the Settings tab at the top.

Scroll to the Danger Zone section.

Click Change repository visibility.

Choose Public, confirm the dialog, and re-enter the repo name when prompted.

Your repository will now be publicly visible and cloneable by anyone.

📜 License

MIT License — free to use, modify, and share.

✨ Author

Timothy Ahaneku
Example repository: https://github.com/tahanekutest/nasdaq
