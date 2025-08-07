package String;

public class StringAdvancedMethods {
    public static void main(String[] args) {
         // 1. replaceAll()
        String data = "abc123xyz456";
        System.out.println("replaceAll: " + data.replaceAll("\\d", "")); // Remove digits

        // 2. matches()
        String email = "test@example.com";
        System.out.println("matches (email): " + email.matches("^[\\w.-]+@[\\w.-]+\\.\\w+$"));

        // 3. split()
        String words = "apple-orange-banana";
        String[] splitWords = words.split("-", 2);
        System.out.println("split (limit=2): " + splitWords[0] + " | " + splitWords[1]);

        // 4. intern()
        String a = new String("hello");
        String b = a.intern();
        String c = "hello";
        System.out.println("intern comparison: " + (b == c)); // true

        // 5. format()
        String formatted = String.format("My score is %d out of %d", 90, 100);
        System.out.println("format: " + formatted);

        // 6. getBytes()
        byte[] bytes = "ABC".getBytes();
        System.out.print("getBytes: ");
        for (byte bByte : bytes) System.out.print(bByte + " ");
        System.out.println();

        // 7. toCharArray()
        char[] chars = "Java".toCharArray();
        System.out.print("toCharArray: ");
        for (char ch : chars) System.out.print(ch + " ");
        System.out.println();

        // 8. String.join()
        String joined = String.join("-", "2025", "08", "07");
        System.out.println("join: " + joined);

        // 9. codePointAt()
        int codePoint = "💖".codePointAt(0);
        System.out.println("codePointAt: " + codePoint);

        // 10. repeat()
        String laugh = "ha".repeat(3);
        System.out.println("repeat: " + laugh);

        // 11. strip()
        String messy = "\u2003 hello \u2003"; // Includes Unicode whitespace
        System.out.println("strip: '" + messy.strip() + "'");
    }
}




// | Method          | Purpose                                   | Syntax                               | Example                                | Output         |
// | --------------- | ----------------------------------------- | ------------------------------------ | -------------------------------------- | -------------- |
// | `replaceAll()`  | Replaces all substrings matching regex    | `str.replaceAll(regex, replacement)` | `"a1b2c3".replaceAll("\\d", "")`       | `"abc"`        |
// | `matches()`     | Checks if the entire string matches regex | `str.matches(regex)`                 | `"abc123".matches("[a-z]+\\d+")`       | `true`         |
// | `split()`       | Splits the string by regex delimiter      | `str.split(regex, limit)`            | `"a-b-c".split("-", 2)`                | `["a", "b-c"]` |
// | `intern()`      | Returns reference from String pool        | `str.intern()`                       | `"hello".intern() == "hello"`          | `true`         |
// | `format()`      | Formats string with placeholders          | `String.format(format, args...)`     | `String.format("%s is %d", "Java", 8)` | `"Java is 8"`  |
// | `getBytes()`    | Converts string to byte array             | `str.getBytes()`                     | `"ABC".getBytes()`                     | `[65, 66, 67]` |
// | `toCharArray()` | Converts to char array                    | `str.toCharArray()`                  | `"hi".toCharArray()`                   | `['h', 'i']`   |
// | `String.join()` | Joins elements with delimiter             | `String.join(delimiter, elems)`      | `String.join("-", "2025", "08", "07")` | `"2025-08-07"` |
// | `codePointAt()` | Returns Unicode code point                | `str.codePointAt(index)`             | `"💖".codePointAt(0)`                  | `128150`       |
// | `repeat()`      | Repeats string multiple times             | `str.repeat(count)`                  | `"ha".repeat(3)`                       | `"hahaha"`     |
// | `strip()`       | Removes Unicode whitespace                | `str.strip()`                        | `"  hello  ".strip()`                  | `"hello"`      |
