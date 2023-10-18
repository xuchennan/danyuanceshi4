package org.apache.commons.lang3;

public class RegExUtilsExample {
    public static void main(String[] args) {
        // 原始字符串
        String inputString = "The quick brown fox jumps over the lazy dog. The dog is very lazy.";

        // 用 RegExUtils 替换所有匹配 "lazy" 的文本
        String result = RegExUtils.replaceAll(inputString, "lazy", "clever");

        System.out.println("Original String: " + inputString);
        System.out.println("Result String:   " + result);

        result = RegExUtils.removePattern(inputString, "the");
        System.out.println("Result String:   " + result);
        result = RegExUtils.replaceFirst(inputString, "dog", "cat");
        System.out.println("Result String:   " + result);
    }
}