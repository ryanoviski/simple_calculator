# Simple Calculator 

## Overview
Simple Calculator is a simple Java console application that allows users to perform basic arithmetic operations: addition, subtraction, multiplication, and division.

## Features
- Addition, subtraction, multiplication, and division of two numbers
- Validation to prevent division by zero
- Input validation for numbers and menu options 
- Interactive console menu for easy navigation
- Loop allowing multiple calculations until the program is exited

## Technologies Used
- Java SE (Console Application)
- Object-oriented programming (OOP) with classes and methods
- Basic exception handling

## Requirements
- Java Development Kit (JDK) version 14 or higher is required to compile and run this project, because it uses the modern switch expression syntax introduced in Java 14.
- To check your Java version, run:
```bash
  javac -version
```
```bash
  java -version
```

## Installation
1. Clone the repository:
```bash
git clone https://github.com/ryanoviski/simple_calculator.git
```
2. Navigate to the project directory:
```bash
cd simple_calculator
```
3. Compile the Java files:
```bash
javac -d bin src/application/Main.java src/entities/Calculator.java
```
4. Run the program:
```bash
java -cp bin application/Main
```

## How to Use
- Upon running, you will see a menu with operation options.
- Enter the number corresponding to the desired operation.
- Input the two numbers when prompted.
- View the result in the console.
- The program will repeatedly prompt for operations until you choose to exit (0).

## Contributions
Contributions are welcome! Feel free to open issues or pull requests.

## License
This project is licensed under the MIT License (LICENSE).

## Contact
Ryan dos Santos — ryanoviski@gmail.com
GitHub: https://github.com/ryanoviski
