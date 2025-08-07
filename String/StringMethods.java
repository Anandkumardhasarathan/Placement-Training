package String;

public class StringMethods {
    public static void main(String[] args) {
         String str = "  Java Programming  ";
        System.out.println("Original: " + str);
        System.out.println("Trimmed: " + str.trim());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Char at 5: " + str.charAt(5));
        System.out.println("Substring(2, 7): " + str.substring(2, 7));
        System.out.println("Contains 'Pro': " + str.contains("Pro"));
        System.out.println("Index of 'a': " + str.indexOf('a'));
        System.out.println("Replace 'a' with 'o': " + str.replace('a', 'o'));
    }
}




// | Method                                         | Description                                      | Example                                    |
// | ---------------------------------------------- | ------------------------------------------------ | ------------------------------------------ |
// | `length()`                                     | Returns the length of the string                 | `"hello".length()` → `5`                   |
// | `charAt(int index)`                            | Returns character at given index                 | `"java".charAt(2)` → `'v'`                 |
// | `substring(int beginIndex)`                    | Returns substring from index                     | `"coding".substring(3)` → `"ing"`          |
// | `substring(int beginIndex, int endIndex)`      | Returns substring between indexes                | `"developer".substring(0, 4)` → `"deve"`   |
// | `toLowerCase()`                                | Converts all characters to lowercase             | `"Java".toLowerCase()` → `"java"`          |
// | `toUpperCase()`                                | Converts all characters to uppercase             | `"Java".toUpperCase()` → `"JAVA"`          |
// | `trim()`                                       | Removes leading and trailing spaces              | `"  hello  ".trim()` → `"hello"`           |
// | `equals(String another)`                       | Checks if two strings are equal (case-sensitive) | `"abc".equals("abc")` → `true`             |
// | `equalsIgnoreCase(String another)`             | Case-insensitive comparison                      | `"Java".equalsIgnoreCase("java")` → `true` |
// | `contains(CharSequence s)`                     | Checks if string contains a sequence             | `"coding".contains("cod")` → `true`        |
// | `startsWith(String prefix)`                    | Checks if string starts with prefix              | `"hello".startsWith("he")` → `true`        |
// | `endsWith(String suffix)`                      | Checks if string ends with suffix                | `"hello".endsWith("lo")` → `true`          |
// | `indexOf(char c)`                              | Returns index of first occurrence                | `"banana".indexOf('a')` → `1`              |
// | `lastIndexOf(char c)`                          | Index of last occurrence                         | `"banana".lastIndexOf('a')` → `5`          |
// | `replace(char old, char new)`                  | Replaces all occurrences of a char               | `"apple".replace('p', 'b')` → `"abble"`    |
// | `replaceAll(String regex, String replacement)` | Replaces using regex                             | `"a1b2c3".replaceAll("\\d", "")` → `"abc"` |
// | `split(String regex)`                          | Splits the string by delimiter                   | `"a,b,c".split(",")` → `["a", "b", "c"]`   |
// | `isEmpty()`                                    | Returns `true` if string is empty (`""`)         | `"".isEmpty()` → `true`                    |
// | `compareTo(String another)`                    | Lexicographically compares strings               | `"apple".compareTo("banana")` → `< 0`      |
// | `matches(String regex)`                        | Returns true if string matches regex             | `"abc123".matches("[a-z]+\\d+")` → `true`  |

