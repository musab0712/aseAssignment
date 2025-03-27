import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove whitespace and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        // Check if lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Convert strings to char arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Test cases
        System.out.println("Anagram Check Program");
        
        // Example 1
        String word1 = "listen";
        String word2 = "silent";
        System.out.println(word1 + " and " + word2 + " are anagrams: " + areAnagrams(word1, word2));
        
        // Example 2
        String word3 = "hello";
        String word4 = "world";
        System.out.println(word3 + " and " + word4 + " are anagrams: " + areAnagrams(word3, word4));
        
        // Interactive input
        System.out.print("\nEnter first word: ");
        String input1 = scanner.nextLine();
        System.out.print("Enter second word: ");
        String input2 = scanner.nextLine();
        
        System.out.println("Result: " + areAnagrams(input1, input2));
        
        scanner.close();
    }
}