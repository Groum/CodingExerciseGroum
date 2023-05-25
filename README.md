# CodingExerciseGroum

## Description
Please note that this application is developed for a coding assessment exercise 
and serves as a demonstration of skills.
This application collects a list of numbers from users and display perfect squares. 
The application allows users to enter numbers until they type `0` to indicate the completion of input. 
It then displays the received numbers and highlights the perfect squares in the list.

## Assumptions

The following assumptions are made for the application:

- The user will type numbers and press enter on the console.
- The number `0` is used to indicate the completion of user input and cannot be part of the number list. 
- However, it is highlighted as a perfect square number in the console output.

## Running the Application

To run the application, follow these steps:

1. Traverse to the main folder where your code is stored.
2. Execute the following command in the terminal:

```bash
mvn exec:java -Dexec.mainClass="Runner"
```

This command will compile and execute the application.

## Tests

The application includes positive and negative tests:

1. Positive Test: This test checks if there are perfect square numbers in the user's input list. It expects the perfect square numbers to be displayed.
2. Negative Test: This test checks if there are no perfect square numbers in the user's input list. It expects no perfect square numbers to be displayed.

Feel free to explore these tests to verify the behavior of the application.
```bash
mvn test 
```

