public class StringExample {
    public static void main(String[] args) {

        //length()
        //Returns the number of characters in the string.
        String str = "Welcome";
        System.out.println("Length of string: " +str.length());
        System.out.println();

        //toLowerCase()/toUpperCase()
        //Converts the string to lower case or upper case.
        System.out.println("Convert to lowercase: " +str.toLowerCase());
        System.out.println("Convert to uppercase: " +str.toUpperCase());
        System.out.println();


        //charAt
        // Returns the character at a specific index (index starts from 0).
        System.out.println("Character at a specific index location: " +str.charAt(2));
        System.out.println();


        //trim()
        //Removes leading and trailing spaces.
        String str1 = " Hello ";
        System.out.println("After removing Space: " + str1.trim());
        System.out.println();


        //substring()
        //Extracts a part of the string based on the given index.
        System.out.println("Extracting substring based on given start index: " + str.substring(2,6));
        System.out.println("Extracting substring based on given start and end index: " + str.substring(3));
        System.out.println();

        //startsWith()/endsWith()
        //Checks if the string starts with given text(prefix) or ends with the given text (suffix).
        String str2 = "Welcome to Java Programs";
        System.out.println("Checking string startswith: " +str2.startsWith("W"));
        System.out.println("Checking string endswith: "+str2.endsWith("m"));
        System.out.println();

        //replace()
        //Replaces a character or substring.
        System.out.println("Replace string with new one: "+str2.replace("Programs","File"));
        System.out.println();

        //indexOf()/lastIndexOf()
        //Finds the first or last occurrence of a character/substring
        System.out.println("First occurence of character: " +str2.indexOf("o"));
        System.out.println("Last occurence of character: " +str2.lastIndexOf("a"));
        System.out.println();

        //contains()
        //Checks if the string contains a specific sequence of characters.
        System.out.println("Checks string contain specific sequence: " +str2.contains("Java"));
        System.out.println();

        //equals()
        //Checks if two strings are equal.
        String s1 = "java";
        String s2 = "Java";
        System.out.println("Checks two strings are equal: " +s1.equals(s2));
        System.out.println("Check two strings are equal ignoring case: " +s1.equalsIgnoreCase(s2));
    }
}
