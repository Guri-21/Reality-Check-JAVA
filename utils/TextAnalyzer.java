package utils;

public class TextAnalyzer {
    public static String cleanText(String input) {
        return input.trim().replaceAll("[^a-zA-Z0-9 ", "").toLowerCase();
    }
}