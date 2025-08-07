package String;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexStringMethods {
    public static void main(String[] args) {
         // 1. matches()
        String str1 = "abc123";
        System.out.println("matches: " + str1.matches("[a-z]+\\d+")); // true

        // 2. replaceAll()
        String str2 = "H3ll0 W0rld";
        System.out.println("replaceAll digits: " + str2.replaceAll("\\d", "")); // remove digits

        // 3. replaceFirst()
        String str3 = "abc123xyz456";
        System.out.println("replaceFirst digits: " + str3.replaceFirst("\\d+", "#")); // replace first digit group

        // 4. split()
        String str4 = "java,python,c++,go";
        String[] langs = str4.split(",");
        System.out.print("split: ");
        for (String lang : langs) {
            System.out.print(lang + " ");
        }
        System.out.println();

        // 5. Pattern.compile and matcher
        String text = "My email is test123@mail.com and yours is hello@world.net";
        Pattern emailPattern = Pattern.compile("[\\w.-]+@[\\w.-]+\\.\\w+");
        Matcher matcher = emailPattern.matcher(text);

        System.out.println("matcher.find():");
        while (matcher.find()) {
            System.out.println(" - Found: " + matcher.group());
            System.out.println("   Start at: " + matcher.start());
            System.out.println("   End at: " + matcher.end());
        }

        // 6. Count total digits in a string
        String data = "Order123Amount456";
        Matcher digitMatcher = Pattern.compile("\\d").matcher(data);
        int count = 0;
        while (digitMatcher.find()) {
            count++;
        }
        System.out.println("Total digits in string: " + count);
    }
}



//op
// matches: true
// replaceAll digits: Hll Wrld
// replaceFirst digits: abc#xyz456
// split: java python c++ go
// matcher.find():
//  - Found: test123@mail.com
//    Start at: 12
//    End at: 28
//  - Found: hello@world.net
//    Start at: 45
//    End at: 61
// Total digits in string: 6




//Regex Methods
// | Method                 | Purpose                                | Syntax                                 | Example                              | Output                |
// | ---------------------- | -------------------------------------- | -------------------------------------- | ------------------------------------ | --------------------- |
// | `matches()`            | Checks if entire string matches regex  | `str.matches(regex)`                   | `"abc123".matches("[a-z]+\\d+")`     | `true`                |
// | `replaceAll()`         | Replaces all regex matches with text   | `str.replaceAll(regex, replacement)`   | `"a1b2".replaceAll("\\d", "")`       | `"ab"`                |
// | `replaceFirst()`       | Replaces first match only              | `str.replaceFirst(regex, replacement)` | `"123abc".replaceFirst("\\d+", "#")` | `"#abc"`              |
// | `split()`              | Splits string using regex              | `str.split(regex)`                     | `"apple,orange".split(",")`          | `["apple", "orange"]` |
// | `Pattern.compile()`    | Compiles a regex string into a Pattern | `Pattern.compile(regex)`               | -                                    | Pattern object        |
// | `pattern.matcher(str)` | Creates Matcher from Pattern           | `pattern.matcher(str)`                 | -                                    | Matcher object        |
// | `matcher.find()`       | Finds the next regex match             | `matcher.find()`                       | Used in loop                         | `true`/`false`        |
// | `matcher.group()`      | Returns the matched text               | `matcher.group()`                      | Inside `find()` loop                 | Match text            |
// | `matcher.start()`      | Start index of the match               | `matcher.start()`                      | Inside loop                          | int                   |
// | `matcher.end()`        | End index of the match                 | `matcher.end()`                        | Inside loop                          | int                   |
