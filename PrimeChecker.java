public class PrimeChecker {
    public static boolean is_prime(long num) {
        if (num == 1) {
            System.out.println("Neither Prime Nor Composite");
            return false;
        }
        if (num == 2) {
            System.out.println("Prime Number Found!!!");
            return true;
        }
        for (long i = 2; i <= Math.sqrt(num); i++) { 
            if (num % i == 0) {
                return false;  // Not prime if divisible by i
            }
        }
        System.out.println("Prime Number Found!!!");
        return true;
    }

    public static void main(String[] args) {
        long num = Long.parseLong(args[0]);
        System.out.println(is_prime(num));
    }
}
