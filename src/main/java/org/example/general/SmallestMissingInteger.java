package org.example.general;

public class SmallestMissingInteger {
    public static int findSmallestMissingPositive(int[] A) {
        int N = A.length;

        // Create a boolean array to track the presence of integers from 1 to N
        boolean[] presence = new boolean[N + 1];

        // Mark the presence of integers from 1 to N in the presence array
        for (int i = 0; i < N; i++) {
            if (A[i] > 0 && A[i] <= N) {
                presence[A[i]] = true;
            }
        }

        // Find the smallest integer from 1 to N that is not present in the array
        for (int i = 1; i <= N; i++) {
            if (!presence[i]) {
                return i;
            }
        }

        // If all integers from 1 to N are present, the smallest missing positive integer is N + 1
        return N + 1;
    }

    public static void main(String[] args) {
        int[] A = {3, 4, -1, 1};
        int result = findSmallestMissingPositive(A);
        System.out.println("The smallest positive integer missing from the array is: " + result);

        // Example test case
        int[] B = {1, 2, 0};
        System.out.println("The smallest positive integer missing from the array is: " + findSmallestMissingPositive(B));
    }
}
