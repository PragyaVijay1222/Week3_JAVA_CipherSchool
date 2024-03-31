public class StringSplitExample {
    public static void main(String[] args) {
        // Example string to be split
        String str = "Java,is,a,programming,language";

        // Splitting the string using comma as delimiter
        String[] parts = str.split(",");

        // Printing each substring after splitting
        System.out.println("After splitting using comma as delimiter:");
        for (String part : parts) {
            System.out.println(part);
        }

        // Splitting the string using space as delimiter
        String[] partsWithSpaceDelimiter = str.split(" ");

        // Printing each substring after splitting
        System.out.println("\nAfter splitting using space as delimiter:");
        for (String part : partsWithSpaceDelimiter) {
            System.out.println(part);
        }

        // Splitting the string using multiple characters as delimiter
        String str2 = "Java is a programming language";
        String[] partsWithMultipleDelimiter = str2.split("a| ");

        // Printing each substring after splitting
        System.out.println("\nAfter splitting using multiple characters as delimiter:");
        for (String part : partsWithMultipleDelimiter) {
            System.out.println(part);
        }
    }
}
