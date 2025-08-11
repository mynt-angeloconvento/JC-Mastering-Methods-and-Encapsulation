package org.example;

public class VarargsExample {
    public static void printMessages(String... messages) {
        System.out.println("Number of messages: " + messages.length);
        for (String msg : messages) {
            System.out.print(msg + " ");
        }
        System.out.println("\n");
    }

    public static int findLargest(int... numbers) {
        int largest = Integer.MIN_VALUE;
        for (int n : numbers) {
            if (n > largest)
                largest = n;
        }
        return largest;
    }
}