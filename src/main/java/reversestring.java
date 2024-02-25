public class reversestring {
    public static void main(String[] args) {
        String str = "codeboard";
        int len = str.length();
        System.out.println(len);
        String reversedStr = "";

        // Iterate through each character of the string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i); // Append each character to the reversed string
        }

        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversedStr);
    }
}
