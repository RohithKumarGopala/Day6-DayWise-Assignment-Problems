package com.asignmentproblems;
import java.util.Scanner;


public class StopWatch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long start,end;
        double time;

        System.out.println("Type any character to start :");
        char s=scanner.next().charAt(0);

        start=System.currentTimeMillis();
        System.out.println("Type any character to stop :");
        char m=scanner.next().charAt(0);
        end=System.currentTimeMillis();

        time=(end-start)/1000.0;
        System.out.println("Time taken is :" +time);
    }
}