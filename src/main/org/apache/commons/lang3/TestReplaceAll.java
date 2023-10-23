package org.apache.commons.lang3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RegExUtilsExampleTest {

    @Test
    public void testReplaceAll() {
        String inputString = "The quick brown fox jumps over the lazy dog. The dog is very lazy.";
        String result = RegExUtils.replaceAll(inputString, "lazy", "clever");
        String expectedOutput = "The quick brown fox jumps over the clever dog. The dog is very clever.";
        assertEquals(expectedOutput, result);
    }

    @Test
    public void testRemovePattern() {
        String inputString = "The quick brown fox jumps over the lazy dog. The dog is very lazy.";
        String result = RegExUtils.removePattern(inputString, "the");
        String expectedOutput = "The quick brown fox jumps over  lazy dog. The dog is very lazy.";
        assertEquals(expectedOutput, result);
    }

    @Test
    public void testReplaceFirst() {
        String inputString = "The quick brown fox jumps over the lazy dog. The dog is very lazy.";
        String result = RegExUtils.replaceFirst(inputString, "dog", "cat");
        String expectedOutput = "The quick brown fox jumps over the lazy cat. The dog is very lazy.";
        assertEquals(expectedOutput, result);
    }
}
