import java.io.*;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers separated by commas:");
        String input = sc.nextLine();

        try {
            String[] nums = input.split(",");
            for (String num : nums) {
                int n = Integer.parseInt(num.trim());
                if (n % 2 == 0) {
                    Writer out = new FileWriter("even.txt", true);
                    out.write(num + "\n");
                    out.close();
                } else {
                    Writer out = new FileWriter("odd.txt", true);
                    out.write(num + "\n");
                    out.close();
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: " + e.getMessage());
            return;
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
            return;
        }

        // Process odd.txt and even.txt with multithreading
        PrimeThread primeThread1 = new PrimeThread("odd.txt", "prime.txt");
        NonPrimeThread nonPrimeThread1 = new NonPrimeThread("odd.txt", "nonprime.txt");
        PrimeThread primeThread2 = new PrimeThread("even.txt", "prime.txt");
        NonPrimeThread nonPrimeThread2 = new NonPrimeThread("even.txt", "nonprime.txt");

        primeThread1.start();
        nonPrimeThread1.start();
        primeThread2.start();
        nonPrimeThread2.start();
    }

    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static class PrimeThread extends Thread {
        String inputFile;
        String outputFile;

        public PrimeThread(String inputFile, String outputFile) {
            this.inputFile = inputFile;
            this.outputFile = outputFile;
        }

        public void run() {
            try {
                Scanner sc = new Scanner(new File(inputFile));
                while (sc.hasNextLine()) {
                    String line = sc.nextLine().trim();
                    int num = Integer.parseInt(line);
                    if (isPrime(num)) {
                        Writer out = new FileWriter(outputFile, true);
                        out.write(num + "\n");
                        out.close();
                    }
                }
                sc.close();
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
                return;
            }
        }
    }

    static class NonPrimeThread extends Thread {
        String inputFile;
        String outputFile;

        public NonPrimeThread(String inputFile, String outputFile) {
            this.inputFile = inputFile;
            this.outputFile = outputFile;
        }

        public void run() {
            try {
                Scanner sc = new Scanner(new File(inputFile));
                while (sc.hasNextLine()) {
                    String line = sc.nextLine().trim();
                    int num = Integer.parseInt(line);
                    if (!isPrime(num)) {
                        Writer out = new FileWriter(outputFile, true);
                        out.write(num + "\n");
                        out.close();
                    }
                }
                sc.close();
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
                return;
            }
        }
    }
}

