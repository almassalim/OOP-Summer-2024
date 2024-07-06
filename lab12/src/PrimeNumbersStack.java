import java.util.Stack;

public class PrimeNumbersStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        int number = 2;

        while (count < 50) {
            if (isPrime(number)) {
                stack.push(number);
                count++;
            }
            number++;
        }

        System.out.println("First 50 prime numbers in descending order:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
