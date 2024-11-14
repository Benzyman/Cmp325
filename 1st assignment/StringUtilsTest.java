public class StringUtilsTest {
    public static void main(String[] args) {
        System.out.println("Test isPalindrome method:");

        System.out.println("madam is palindrome: " + StringUtils.isPalindrome("madam")); // Expected: true
        System.out.println("hannah is palindrome: " + StringUtils.isPalindrome("racecar")); // Expected: true
        System.out.println("hello is palindrome: " + StringUtils.isPalindrome("hello")); // Expected: false
        System.out.println("empty string is palindrome: " + StringUtils.isPalindrome("")); // Expected: true
    }
}