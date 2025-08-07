package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// public class RegexString {
//     public static void main(String[] args) {
//         // 1. matches()
//         String phone = "9876543210";
//         System.out.println("Is valid phone: " + phone.matches("[6-9]\\d{9}")); // Indian number

//         // 2. replaceAll()
//         String messy = "He11o W0rld!";
//         System.out.println("Cleaned: " + messy.replaceAll("\\d", "")); // Remove digits

//         // 3. replaceFirst()
//         String tags = "<html><body><p>Hello</p></body></html>";
//         System.out.println("Remove first tag: " + tags.replaceFirst("<[^>]+>", "")); // Remove first HTML tag

//         // 4. split()
//         String csv = "apple,banana,mango,grape";
//         String[] fruits = csv.split(",");
//         System.out.print("Fruits: ");
//         for (String fruit : fruits) System.out.print(fruit + " ");
//         System.out.println();

//         // 5. Pattern & Matcher
//         String text = "My email is test123@example.com and yours is hello@world.net";
//         Pattern emailPattern = Pattern.compile("[\\w.-]+@[\\w.-]+\\.\\w+");
//         Matcher matcher = emailPattern.matcher(text);
//         System.out.println("Found emails:");
//         while (matcher.find()) {
//             System.out.println(" - " + matcher.group());
//         }

//         // 6. Count all digits in a string using regex
//         String data = "Order1234Total56";
//         Pattern digitPattern = Pattern.compile("\\d");
//         Matcher digitMatcher = digitPattern.matcher(data);
//         int digitCount = 0;
//         while (digitMatcher.find()) digitCount++;
//         System.out.println("Total digits: " + digitCount);
//     }
// }



//Regex Methods in Java
// | Method              | Purpose                                     | Syntax                                 | Example                                 | Output                          |
// | ------------------- | ------------------------------------------- | -------------------------------------- | --------------------------------------- | ------------------------------- |
// | `matches()`         | Checks if full string matches regex         | `str.matches(regex)`                   | `"abc123".matches("[a-z]+\\d+")`        | `true`                          |
// | `replaceAll()`      | Replaces all substrings that match regex    | `str.replaceAll(regex, replacement)`   | `"a1b2c3".replaceAll("\\d", "")`        | `"abc"`                         |
// | `replaceFirst()`    | Replaces first substring that matches regex | `str.replaceFirst(regex, replacement)` | `"123abc456".replaceFirst("\\d+", "#")` | `"#abc456"`                     |
// | `split()`           | Splits string using regex                   | `str.split(regex)`                     | `"apple,orange,banana".split(",")`      | `["apple", "orange", "banana"]` |
// | `Pattern.compile()` | Compiles regex into pattern                 | `Pattern.compile(regex)`               | -                                       | Pattern object                  |
// | `Pattern.matcher()` | Matches regex against a string              | `pattern.matcher(str)`                 | -                                       | Matcher object                  |
// | `matcher.find()`    | Finds the next match                        | `matcher.find()`                       | In loop                                 | true/false                      |
// | `matcher.group()`   | Gets matched group                          | `matcher.group()`                      | Inside find loop                        | Matched text                    |








import java.util.regex.*;

public class RegexString {
    public static void main(String[] args) {

        // Helper method call for each pattern test
        testRegex("\\d", "My pin is 1234"); // Digit
        testRegex("\\w", "Java_101");       // Word characters (letters, digits, _)
        testRegex("\\s", "Hello World");    // Whitespace
        testRegex(".", "abc!@#");           // Any character
        testRegex("[abc]", "cat bat mat");  // Match a, b, or c
        testRegex("[^abc]", "xyz");         // Not a, b, or c
        testRegex("a|b", "apple ball car"); // Either a or b
        testRegex("ab*", "abb ab a abbb");  // a followed by 0 or more b's
        testRegex("ab+", "ab abb a abbb");  // a followed by 1 or more b's
        testRegex("ab?", "ab a abb");       // a followed by 0 or 1 b
        testRegex("\\d{3}", "My number is 4567"); // Exactly 3 digits
        testRegex("^Hello", "Hello world!");     // Starts with Hello
        testRegex("world!$", "Hello world!");    // Ends with world!
    }

    // Reusable method to test regex pattern on input string
    public static void testRegex(String pattern, String input) {
        System.out.println("\nPattern: \"" + pattern + "\"");
        Pattern compiledPattern = Pattern.compile(pattern);
        Matcher matcher = compiledPattern.matcher(input);

        boolean found = false;
        while (matcher.find()) {
            System.out.println("Matched: \"" + matcher.group() + "\" at index " + matcher.start());
            found = true;
        }

        if (!found) {
            System.out.println("No match found.");
        }
    }
}


//Common Regex Patterns (Cheat Sheet)
// | Pattern  | Meaning                            | Example Match              |            |
// | -------- | ---------------------------------- | -------------------------- | ---------- |
// | `\\d`    | Digit (0–9)                        | `3`                        |            |
// | `\\w`    | Word character (a–z, A–Z, 0–9, \_) | `A`, `z`, `9`              |            |
// | `\\s`    | Whitespace (space, tab)            | `" "`                      |            |
// | `.`      | Any character                      | `a`, `1`, `@`              |            |
// | `[abc]`  | One of a, b, or c                  | `a`, `b`                   |            |
// | `[^abc]` | Not a, b, or c                     | `d`                        |            |
// | \`a      | b\`                                | a or b                     | `a` or `b` |
// | `*`      | 0 or more times                    | `"ab*"` → `a`, `ab`, `abb` |            |
// | `+`      | 1 or more times                    | `"ab+"` → `ab`, `abb`      |            |
// | `?`      | 0 or 1 time                        | `"ab?"` → `a`, `ab`        |            |
// | `{n}`    | Exactly n times                    | `"\\d{3}"` → `123`         |            |
// | `^`      | Start of string                    | `"^abc"`                   |            |
// | `$`      | End of string                      | `"xyz$"`                   |            |


// Practical regex usecases
// | Task                          | Regex                           | Example                     |
// | ----------------------------- | ------------------------------- | --------------------------- |
// | Validate email                | `^[\\w.-]+@[\\w.-]+\\.\\w{2,}$` | `test@mail.com`             |
// | Extract domain                | `@([\\w.-]+)`                   | `@example.com`              |
// | Remove non-alphabets          | `[^a-zA-Z]`                     | `abc123` → `abc`            |
// | Validate Indian mobile number | `^[6-9]\\d{9}$`                 | `9876543210`                |
// | Extract digits                | `\\d+`                          | `abc123xyz` → `123`         |
// | Extract words                 | `\\b\\w+\\b`                    | `Hi there!` → `Hi`, `there` |
