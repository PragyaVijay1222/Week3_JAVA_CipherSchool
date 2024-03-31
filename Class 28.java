public class StringConcatenationExample {
    public static void main(String[] args) {
        // Method 1: Using the + operator for concatenation
        String str1 = "Hello";
        String str2 = "World";
        String result1 = str1 + ", " + str2;
        System.out.println("Concatenated String (Using + operator): " + result1);

        // Method 2: Using the concat() method
        String result2 = str1.concat(", ").concat(str2);
        System.out.println("Concatenated String (Using concat() method): " + result2);

        // Method 3: Using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(", ").append(str2);
        String result3 = sb.toString();
        System.out.println("Concatenated String (Using StringBuilder): " + result3);

        // Method 4: Using StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str1).append(", ").append(str2);
        String result4 = stringBuffer.toString();
        System.out.println("Concatenated String (Using StringBuffer): " + result4);
    }
}
Explanation:

Using the + Operator:
We can concatenate strings using the + operator directly.
Strings are immutable in Java, so each concatenation operation creates a new string object.
Using the concat() Method:
The concat() method concatenates the specified string to the end of the invoking string.
It returns a new string that represents the concatenation of the two strings.
Using StringBuilder:
StringBuilder is a mutable sequence of characters. It is more efficient for concatenating strings than using the + operator or concat() method.
We can append strings using the append() method and convert the StringBuilder object to a string using toString() method.
Using StringBuffer:
StringBuffer is similar to StringBuilder, but it is thread-safe, i.e., it is synchronized and therefore safe for use by multiple threads.
It is less efficient than StringBuilder because of the synchronization overhead, but it can be used in multi-threaded environments.
All four methods produce the same concatenated string "Hello, World" from the strings "Hello" and "World".
