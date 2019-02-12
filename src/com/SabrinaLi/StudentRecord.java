package com.SabrinaLi;

public class StudentRecord {
    private static int[] scores;

    public StudentRecord(int[] scores) {
        this.scores = scores;
    }

    public static double average(int first, int last) {
        int sum = 0;
        for (int i = first; i <= last; i ++) {
            sum += scores[i];
        }
        return sum / (double)(last - first + 1);
    }

    public static boolean hasImproved() {
        for (int i = 0; i < scores.length - 1; i ++) {
            if (scores[i] > scores[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public double finalAverage() {
        if (hasImproved()) {
            return (average(scores.length / 2, scores.length - 1));
        }
        return average(0, scores.length - 1);
    }
}
