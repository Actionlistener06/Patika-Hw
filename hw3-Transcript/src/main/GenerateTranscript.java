package main;
import util.Grade;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Locale;

import static main.CourseGrade.CourseDepartment.CENG;

public class GenerateTranscript {
    public void takeInputFromUser(){
        Scanner scanner = new Scanner(System.in);
        // take input from user to create Transcript object
        System.out.println("Enter Student ID:");
        String studentID = scanner.nextLine();
        Transcript transcript = new Transcript(studentID);

        // take input from user to add course grades to Transcript object
        System.out.println("Enter number of classes:");
        int numClasses = scanner.nextInt();
        scanner.nextLine(); // consume newline character

        for (int i = 0; i < numClasses; i++) {
            CourseGrade.CourseDepartment courseDepartment=CENG;
            try {
                System.out.println("Enter Department:");
                String department = scanner.nextLine();
                courseDepartment = CourseGrade.CourseDepartment.valueOf(department);
            }
            catch (IllegalArgumentException e){
                System.out.println("Enter a valid Departmant name");
                System.exit(0);
            }

            System.out.println("Enter Course Code:");
            int courseCode = scanner.nextInt();

            System.out.println("Enter Credit:");
            int credit = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            System.out.println("Enter Grade:");
            int gradeInt = scanner.nextInt();
            Grade grade = Grade.getGrade(gradeInt);

            // create CourseGrade object and add it to Transcript object
            CourseGrade courseGrade = new CourseGrade(courseDepartment, courseCode, credit, grade);
            transcript.addCourseTaken(courseGrade);
        }
        // print transcript
        System.out.println(transcript.toString());
    }


    public void takeInputFromFile(){
        //Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);
        //Open the file
        Scanner inputFile=null;
        FileInputStream file=null;
        boolean fileNotReady = true;
        do{
            //Get the name of the file
            System.out.println("Enter the filename ");
            String fileName ="week-6-hw/src/resources/" + keyboard.nextLine();
            //Attempt to open the file
            try{
                file = new FileInputStream(fileName);
                fileNotReady=false;
            }
            catch (FileNotFoundException e){
                System.out.println("File not found");
            }
        } while(fileNotReady);

        keyboard.close();
        inputFile = new Scanner(file);
        inputFile.useLocale(Locale.US);
        //Read lines from the file until no more are left
        String studentID=inputFile.nextLine();
        Transcript transcript = new Transcript(studentID);
        while(inputFile.hasNext()){
            CourseGrade.CourseDepartment courseDepartment=CENG;
            String courseDepartmentInput= inputFile.next();
            courseDepartment = CourseGrade.CourseDepartment.valueOf(courseDepartmentInput);
            int courseNumber = inputFile.nextInt();
            int creditHours = inputFile.nextInt();
            double gradeNum = inputFile.nextDouble();
            Grade grade=Grade.getGrade(gradeNum);
            CourseGrade courseGrade = new CourseGrade(courseDepartment,courseNumber,creditHours,grade);
            transcript.addCourseTaken(courseGrade);
        }
        inputFile.close(); // Close the file
        System.out.println(transcript.toString());
    }
}
