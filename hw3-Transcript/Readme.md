# Transcript Generator

This is a Java program that generates transcripts of students based on their course grades. The program allows the user to input course grades either from the console or from a file, and generates a transcript that includes the student's ID, course grades, and GPA.

## Getting Started

To run the program, you will need to have Java installed on your computer. You can download the latest version of Java from the [official website](https://www.java.com/en/download/).

Once you have Java installed, you can compile and run the program using the following commands:

```
javac *.java
java GenerateTranscript
```

This will compile all the Java source files and run the main class, `GenerateTranscript`.

## Usage

The program provides two ways to input course grades: from the console and from a file.

### Input from Console

To input course grades from the console, run the program and follow the prompts. You will be asked to enter the student ID, department, course code, credit, and grade for each course grade. Once you have entered all the course grades, the program will generate a transcript and print it to the console.

### Input from File

To input course grades from a file, create a text file that contains the course grades in the following format:

```
<department> <course code> <credit> <grade>
```

Each course grade should be on a separate line. Once you have created the input file, run the program and enter the filename when prompted. The program will read the course grades from the file, generate a transcript, and print it to the console.

## Classes

The program consists of the following classes:

### CourseGrade

Represents a course grade, with fields for the department, course code, credit, and grade.

### Grade

An enum type that represents a letter grade, with values A, B, C, D, and F.

### Transcript

Represents a transcript, with fields for the student ID and a list of course grades. Provides methods for adding course grades and calculating the GPA.

### GenerateTranscript

The main class that runs the program. Provides methods for taking input from the console and from a file, and generates a transcript based on the input.

## Packages

The program is organized into two packages:

### hw3.util

Contains the definition of the `Grade` enum type, and a test class for it, `GradeTest`.

### hw3