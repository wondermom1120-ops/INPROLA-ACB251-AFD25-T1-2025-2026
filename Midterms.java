// Midterms1.java
public class Midterms1 {
    public static void main(String[] args) {
        String word = "radar";  // Change this word to test

        boolean isPalindrome = true;

        word = word.toLowerCase();

        for (int i = 0; i < word.length() / 2; i++) {
            char left = word.charAt(i);
            char right = word.charAt(word.length() - 1 - i);

            switch (left == right ? 1 : 0) {
                case 1:
                    break;
                case 0:
                    isPalindrome = false;
                    break;
            }

            if (!isPalindrome) break;
        }

        switch (isPalindrome ? 1 : 0) {
            case 1:
                System.out.println(word + " is a Palindrome!");
                break;
            case 0:
                System.out.println(word + " is NOT a Palindrome.");
                break;
        }
    }
}
