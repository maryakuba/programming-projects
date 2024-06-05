## App Flow

1. **Read the input sentence from the user.**
2. **Split the sentence into words.**
3. **For each word, push its characters onto a stack.**
4. **Pop the characters from the stack to reverse the word.**
5. **Print the reversed words to form the final sentence.**

### Explanation:

1. **Reading Input**:
   - A `Scanner` object reads a sentence from the user.

2. **Splitting the Sentence**:
   - The sentence is split into words using the `split(" ")` method, which splits the string based on spaces.

3. **Reversing Each Word**:
   - For each word, a `Stack<Character>` is used to reverse the characters.
   - Characters of the word are pushed onto the stack.
   - Characters are then popped from the stack, effectively reversing the word.

4. **Building the Result**:
   - The reversed words are appended to a `StringBuilder` object to form the final result.
   - A space is added after each reversed word to maintain word separation.

5. **Output**:
   - The final reversed sentence is printed after trimming any trailing spaces.

### Running the Program:
To run the program:
1. Save the code in a file named `ReverseWordsInSentence.java`.
2. Compile the program using `javac ReverseWordsInSentence.java`.
3. Run the compiled program using `java ReverseWordsInSentence`.

This will prompt you to enter a sentence, and then it will print the sentence with the characters of each word reversed.





