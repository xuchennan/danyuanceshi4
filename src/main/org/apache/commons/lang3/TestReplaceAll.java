package org.apache.commons.lang3;

import java.util.regex.Pattern;

public class TestReplaceAll {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("world");
        String text = "Hello, world!";

        // 正常使用 replaceAll 方法
        String replacedText = replaceAll(text, pattern, "Java");
        System.out.println("Replaced Text: " + replacedText);

        // 使用带缺陷的 replaceAll 方法
        String defectiveReplacedText = replaceAllDefective(text, pattern, "Java");
        System.out.println("Defective Replaced Text: " + defectiveReplacedText);
    }

    public static String replaceAll(final String text, final Pattern regex, final String replacement) {
        if (text == null || regex == null || replacement == null) {
            return text;
        }
        return regex.matcher(text).replaceAll(replacement);
    }

    // 带缺陷的 replaceAll 方法
    public static String replaceAllDefective(final String text, final Pattern regex, final String replacement) {
        if (text == null || regex == null || replacement == null) {
            return text;
        }
        // 注入的缺陷：直接返回原始文本
        return text;
    }
}
