public class PrimeChecker {
    public static boolean is_prime(int num) {
        boolean prime = true;
        int amount = 1;
        if (num == 1) {
            System.out.println("Neither Prime Nor Composite");
        } else if (num == 2) {
            System.out.println("Prime Number Found!!!");
        } else {
            for (int i = 0; i < num - 2; i++) { 
                amount = amount + 1;
                if (num % amount == 0) {
                    prime = false;
                    break;
                }
            }
        }
	
	return prime;
    }

    public static void main(String[] args) {
	int num = Integer.parseInt(args[0]);
	System.out.println(PrimeChecker.is_prime(num));
	
	}
}
