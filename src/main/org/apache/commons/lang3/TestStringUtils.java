package org.apache.commons.lang3;
public class TestStringUtils {
    public static void main(String[] args) {
// 测试isEmpty方法
        System.out.println("测试isEmpty方法");
        String s1 = null;
        String s2 = "";
        String s3 = " ";
        String s4 = "abc";
        System.out.println("s1是否为空：" + StringUtils.isEmpty(s1)); // true
        System.out.println("s2是否为空：" + StringUtils.isEmpty(s2)); // true
        System.out.println("s3是否为空：" + StringUtils.isEmpty(s3)); // false
        System.out.println("s4是否为空：" + StringUtils.isEmpty(s4)); // false
        if (StringUtils.isEmpty(s1) && StringUtils.isEmpty(s2) &&
                !StringUtils.isEmpty(s3) && !StringUtils.isEmpty(s4)) {
            System.out.println("isEmpty方法测试通过");
        } else {
            System.out.println("isEmpty方法测试失败");
        }
        System.out.println();
// 测试reverse方法
        System.out.println("测试reverse方法");
        String s5 = "hello";
        String s6 = "world";
        String s7 = "racecar";
        System.out.println("s5反转后：" + StringUtils.reverse(s5)); // olle
        System.out.println("s6反转后：" + StringUtils.reverse(s6)); // dlrow
        System.out.println("s7反转后：" + StringUtils.reverse(s7)); // racecar
        if (StringUtils.reverse(s5).equals("olle") &&
                StringUtils.reverse(s6).equals("dlrow") &&
                StringUtils.reverse(s7).equals("racecar")) {
            System.out.println("reverse方法测试通过");
        } else {
            System.out.println("reverse方法测试失败");
        }
        System.out.println();
// 测试replace方法
        System.out.println("测试replace方法");
        String s8 = "The quick brown fox jumps over the lazy dog";
        String s9 = "Java is a general-purpose programming language";
        String s10 = "Hello, world!";
        System.out.println("s8替换后：" + StringUtils.replace(s8, "o", "*")); // Thequick br*wn f*x jumps *ver the lazy d*g
        System.out.println("s9替换后：" + StringUtils.replace(s9, "Java", "Python"));
// Python is a general-purpose programming language
        System.out.println("s10替换后：" + StringUtils.replace(s10, "world",
                "Bing")); // Hello, Bing!
        if (StringUtils.replace(s8, "o", "*").equals("The quick br*wn f*x jumps *ver the lazy d*g") && StringUtils.replace(s9, "Java", "Python").equals("Python is a general-purpose programming language") && StringUtils.replace(s10, "world",
                "Bing").equals("Hello, Bing!")) {
            System.out.println("replace方法测试通过");
        } else {
            System.out.println("replace方法测试失败");
        }
        System.out.println();
    }
}
