package com.bridgelabz;
import java.util.Scanner;
// calculate lenght
public class LineComparison {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Welome to Line Comparison Computation Problem");
            //accepting co-ordinates for line one
            System.out.println("Enter co-ordinates  For X1");
            int x1 = sc.nextInt();
            System.out.println("Enter co-ordinates  For Y1");
            int y1 = sc.nextInt();
            System.out.println("Enter co-ordinates  For X2");
            int x2 = sc.nextInt();
            System.out.println("Enter co-ordinates  For Y1");
            int y2 = sc.nextInt();

            //calculating line 1
            Integer length1 = (int) Math.sqrt((x2 - x1) * 2 + (y2 - y1) * 2);

            System.out.println("\n");
            //Accepting co-ordinates for line 2
            System.out.println("Enter co-ordinates  For A1");
            int a1 = sc.nextInt();
            System.out.println("Enter co-ordinates  For B1");
            int b1 = sc.nextInt();
            System.out.println("Enter co-ordinates  For A2");
            int a2 = sc.nextInt();
            System.out.println("Enter co-ordinates For B2");
            int b2 = sc.nextInt();
            //calculating Line 2
            Integer length2 = (int) Math.sqrt((a2 - a1) * 2 + (b2 - a1) * 2);

            //printing Both lines
            System.out.println("Length of 1st line is : " + length1);
            System.out.println("Length of second line is : " + length2);
            // Compare the lengths of the lines using the compareTo method
            if (Double.compare(length1, length2) == 0) {
                System.out.println("The two lines are equal in length.");
            } else if (Double.compare(length1, length2) < 0) {
                System.out.println("The first line is shorter than the second line.");
            } else {
                System.out.println("The first line is longer than the second line.");
            }
        }
    }