package com.SabrinaLi;

public class Runner {

    public static void main(String[] args) {
	    int[] s1 = {50, 50, 20, 80, 53};
	    System.out.println(printArr(s1));
	    StudentRecord r1 = new StudentRecord(s1);
	    //System.out.println("Average: " + r1.average(0, 4));
	    System.out.println("Has Improved: " + r1.hasImproved());
	    System.out.println("Final Average: " + r1.finalAverage());

	    System.out.println();
	    int[] s2 = {20, 50, 50, 53, 80};
        System.out.println(printArr(s2));
        StudentRecord r2 = new StudentRecord(s2);
        //System.out.println("Average: " + r2.average(0, 4));
        System.out.println("Has Improved: " + r2.hasImproved());
        System.out.println("Final Average: " + r2.finalAverage());

        System.out.println();
	    int[] s3 = {20,50,50,80};
        System.out.println(printArr(s3));
        StudentRecord r3 = new StudentRecord(s3);
        //System.out.println("Average: " + r3.average(0, 3));
        System.out.println("Has Improved: " + r3.hasImproved());
        System.out.println("Final Average: " + r3.finalAverage());
    }

    public static String printArr(int[] arr)
    {
        String str = "Student Scores: ";
        for (int i = 0; i < arr.length; i++)
        {
            if (i != arr.length - 1)
                str += arr[i] + ", ";
            else
                str += arr[i];
        }
        return str;
    }
}
