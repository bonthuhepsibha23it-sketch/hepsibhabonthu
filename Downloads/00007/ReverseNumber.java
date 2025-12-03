public class ReverseNumber {

    public static void main(String[] args) {
        int originalNumber = 12345;
        int reversedNumber = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + digit; 
            originalNumber /= 10; 
        }
        System.out.println("Original Number: " + 12345); 
        System.out.println("Reversed Number: " + reversedNumber);
    }
}