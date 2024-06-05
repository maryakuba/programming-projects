import java.util.Scanner;
import java.util.Stack;

public class ReverseWordsInSentence {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Initialize a StringBuilder to hold the final result
        StringBuilder result = new StringBuilder();

        // Iterate over each word in the sentence
        for (String word : words) {
            // Use a stack to reverse the characters of the word
            Stack<Character> stack = new Stack<>();

            // Push all characters of the word onto the stack
            for (char ch : word.toCharArray()) {
                stack.push(ch);
            }

            // Pop characters from the stack to get the reversed word
            while (!stack.isEmpty()) {
                result.append(stack.pop());
            }

            // Add a space after each reversed word (except the last one)
            result.append(" ");
        }

        // Print the final result, trimming any extra spaces at the end
        System.out.println(result.toString().trim());

        // Close the scanner
        scanner.close();
    }
}
