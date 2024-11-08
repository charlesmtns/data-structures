package br.com.java.datastructures.stack.reversestring;

public class RunReverseString {

    public static void main(String[] args) {

        String myString = "hello";
        String reversedString = reverseString(myString);
        System.out.println(reversedString);

        /*
            EXPECTED OUTPUT:
            ----------------
            olleh
        */

    }

    private static String reverseString(String myString) {
        StackReverseString<Character> stack = new StackReverseString<>();
        String reversedString = "";
        for (char c : myString.toCharArray()) {
            stack.push(c);
        }
        while (!stack.isEmpty()) {
            reversedString += stack.pop();
        }
        return reversedString;
    }
}
