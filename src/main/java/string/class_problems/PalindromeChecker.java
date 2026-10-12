import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindromeIterative(String text) {
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) return false;
            left++; right--;
        }
        return true;
    }
    public static boolean isPalindromeRecursive(String text) {
        return checkRecursive(text, 0, text.length() - 1);
    }
    private static boolean checkRecursive(String text, int left, int right) {
        if (left >= right) return true;
        if (text.charAt(left) != text.charAt(right)) return false;
        return checkRecursive(text, left + 1, right - 1);
    }
    public static boolean isPalindromeArrayReversal(String text) {
        char[] characters = text.toCharArray();
        int left = 0, right = characters.length - 1;
        while (left < right) {
            char temp = characters[left]; characters[left] = characters[right]; characters[right] = temp;
            left++; right--;
        }
        return text.equals(new String(characters));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or text: ");
        String text = scanner.nextLine();
        System.out.println();
        System.out.println("Iterative: " + (isPalindromeIterative(text) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Recursive: " + (isPalindromeRecursive(text) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Array Reversal: " + (isPalindromeArrayReversal(text) ? "Palindrome" : "Not Palindrome"));
        scanner.close();
    }
}