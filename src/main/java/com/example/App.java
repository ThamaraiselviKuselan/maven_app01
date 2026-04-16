package com.example;

public class App {

    public double calculateAverage(int m1, int m2, int m3) {
        return (m1 + m2 + m3) / 3.0;
    }

    public String calculateGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 40) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        App student = new App();

        int mark1 = 85;
        int mark2 = 90;
        int mark3 = 80;

        double average = student.calculateAverage(mark1, mark2, mark3);
        String grade = student.calculateGrade(average);

        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}
