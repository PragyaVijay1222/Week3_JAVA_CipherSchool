public class StringConcatenationAndComparison {
    public static void main(String[] args) {
        // String concatenation
        String str1 = "Hello";
        String str2 = "World";
        String concatenatedString = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatenatedString);

        // Comparison using == operator
        String str3 = "Hello";
        String str4 = "Hello";
        boolean isEqualUsingEqualsOperator = (str3 == str4); // Reference equality
        boolean isEqualUsingEqualsMethod = str3.equals(str4); // Content equality
        System.out.println("Comparison using == operator: " + isEqualUsingEqualsOperator);
        System.out.println("Comparison using equals() method: " + isEqualUsingEqualsMethod);
    }
}
