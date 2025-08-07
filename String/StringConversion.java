package String;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class StringConversion {
    public static void main(String[] args) {
        
        // String to primitives
        int num = Integer.parseInt("123");
        long bigNum = Long.parseLong("1234567890");
        float f = Float.parseFloat("12.34");
        double d = Double.parseDouble("56.78");
        boolean flag = Boolean.parseBoolean("true");
        char c = "hello".charAt(0);
        byte b = Byte.parseByte("127");
        short s = Short.parseShort("1000");

        // Print primitive results
        System.out.println("int: " + num);
        System.out.println("long: " + bigNum);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("boolean: " + flag);
        System.out.println("char: " + c);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);

        // String to BigInteger & BigDecimal
        BigInteger bigInt = new BigInteger("98765432109876543210");
        BigDecimal bigDec = new BigDecimal("12345.6789");
        System.out.println("BigInteger: " + bigInt);
        System.out.println("BigDecimal: " + bigDec);

        // String to Date/Time
        LocalDate date = LocalDate.parse("2025-08-07");
        LocalTime time = LocalTime.parse("13:45:00");
        LocalDateTime dateTime = LocalDateTime.parse("2025-08-07T13:45:00");

        System.out.println("Date: " + date);
        System.out.println("Time: " + time);
        System.out.println("DateTime: " + dateTime);

        // char[] to String
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String fromChars = new String(chars);
        System.out.println("char[] to String: " + fromChars);

        // byte[] to String
        byte[] bytes = "Hi".getBytes();
        String fromBytes = new String(bytes);
        System.out.println("byte[] to String: " + fromBytes);

    }
}



//String conversion methods to other datatypes
// | Conversion Type            | Method / Class           | Syntax                                       | Example                      | Output Type     |
// | -------------------------- | ------------------------ | -------------------------------------------- | ---------------------------- | --------------- |
// | **String → int**           | `Integer.parseInt()`     | `Integer.parseInt("123")`                    | `"123"` → `123`              | `int`           |
// | **String → long**          | `Long.parseLong()`       | `Long.parseLong("123456789")`                | `"123456789"` → `123456789L` | `long`          |
// | **String → float**         | `Float.parseFloat()`     | `Float.parseFloat("12.34")`                  | `"12.34"` → `12.34f`         | `float`         |
// | **String → double**        | `Double.parseDouble()`   | `Double.parseDouble("12.34")`                | `"12.34"` → `12.34`          | `double`        |
// | **String → boolean**       | `Boolean.parseBoolean()` | `Boolean.parseBoolean("true")`               | `"true"` → `true`            | `boolean`       |
// | **String → char**          | `charAt(index)`          | `"hello".charAt(0)`                          | `'h'`                        | `char`          |
// | **String → byte**          | `Byte.parseByte()`       | `Byte.parseByte("127")`                      | `"127"` → `127`              | `byte`          |
// | **String → short**         | `Short.parseShort()`     | `Short.parseShort("1000")`                   | `"1000"` → `1000`            | `short`         |
// | **String → BigInteger**    | `new BigInteger(str)`    | `new BigInteger("1234567890123")`            | Big number                   | `BigInteger`    |
// | **String → BigDecimal**    | `new BigDecimal(str)`    | `new BigDecimal("123.4567")`                 | Precise decimal              | `BigDecimal`    |
// | **String → LocalDate**     | `LocalDate.parse()`      | `LocalDate.parse("2025-08-07")`              | Date string                  | `LocalDate`     |
// | **String → LocalTime**     | `LocalTime.parse()`      | `LocalTime.parse("13:45:00")`                | Time string                  | `LocalTime`     |
// | **String → LocalDateTime** | `LocalDateTime.parse()`  | `LocalDateTime.parse("2025-08-07T13:45:00")` | DateTime                     | `LocalDateTime` |
// | **char\[] → String**       | `new String(char[])`     | `new String(new char[]{'H','i'})`            | `"Hi"`                       | `String`        |
// | **byte\[] → String**       | `new String(byte[])`     | `new String(bytes)`                          | Decoded string               | `String`        |
