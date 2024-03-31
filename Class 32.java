public class StringManipulationExample {
    public static void main(String[] args) {
        // compareTo() method
        String str1 = "apple";
        String str2 = "banana";
        int compareResult = str1.compareTo(str2);
        System.out.println("Compare result of 'apple' and 'banana': " + compareResult);

        // trim() method
        String stringWithSpaces = "  Hello, World!   ";
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed string: '" + trimmedString + "'");

        // toLowerCase() method
        String originalString = "HELLO";
        String lowerCaseString = originalString.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseString);

        // toUpperCase() method
        String lowercaseString = "hello";
        String upperCaseString = lowercaseString.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseString);

        // replace() method
        String originalSentence = "I like programming";
        String replacedSentence = originalSentence.replace("programming", "coding");
        System.out.println("Replaced sentence: " + replacedSentence);

        // isEmpty() method
        String emptyString = "";
        String nonEmptyString = "Hello";
        boolean isEmptyResult1 = emptyString.isEmpty();
        boolean isEmptyResult2 = nonEmptyString.isEmpty();
        System.out.println("Is empty string empty? " + isEmptyResult1);
        System.out.println("Is non-empty string empty? " + isEmptyResult2);

        // Other methods
        String str3 = "Hello World";
        System.out.println("Length of 'Hello World': " + str3.length()); // Length of the string
        System.out.println("Character at index 4: " + str3.charAt(4)); // Character at index
        System.out.println("Substring from index 6: " + str3.substring(6)); // Substring from index
        System.out.println("Index of 'World': " + str3.indexOf("World")); // Index of substring
    }
}
