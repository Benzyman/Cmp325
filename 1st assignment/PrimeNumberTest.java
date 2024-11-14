// Test class for PrimeNumberUtils
public class PrimeNumberTest {
    public static void main(String[] args) {
        System.out.println("Test isPrime method:");

        System.out.println("2 is prime: " + PrimeNumberUtils.isPrime(2));
        System.out.println("15 is prime: " + PrimeNumberUtils.isPrime(15));
        System.out.println("17 is prime: " + PrimeNumberUtils.isPrime(17));
        System.out.println("1 is prime: " + PrimeNumberUtils.isPrime(1));
        System.out.println("0 is prime: " + PrimeNumberUtils.isPrime(0));
    }
}
