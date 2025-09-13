public class PrimeAndArmstrong {
    public static void main(String[] args) {
        int n = 1000;
        
        System.out.println("Prime numbers between 1 and " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nArmstrong numbers between 1 and " + n + ":");
        for (int i = 1; i <= n; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static boolean isArmstrong(int num) {
        int originalNum = num, result = 0, digits = countDigits(num);
        while (originalNum != 0) {
            int remainder = originalNum % 10;
            result += Math.pow(remainder, digits);
            originalNum /= 10;
        }
        return result == num;
    }
    public static int countDigits(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}
