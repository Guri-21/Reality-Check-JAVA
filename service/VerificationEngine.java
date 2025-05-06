package service;

import data.NewsDatabase;
import model.NewsCheckRecord;

public class VerificationEngine {
    private static int newsIDCounter = 1;

    public static NewsCheckRecord analyzeNews(String inputContent) {
        double matchScore = keywordMatchScore(inputContent);
        int fakeSimilarity = matchSamples(inputContent, NewsDatabase.fakeNewsSamples);
        int realSimilarity = matchSamples(inputContent, NewsDatabase.realNewsSamples);

        double credibilityScore = (realSimilarity - fakeSimilarity - matchScore) / 10.0;
        credibilityScore = Math.max(0, Math.min(1, credibilityScore));

        String status = credibilityScore < 0.5 ? "Likely Fake" : "Likely Real";

        return new NewsCheckRecord(newsIDCounter++, inputContent, credibilityScore, status);
    }

    private static double keywordMatchScore(String content) {
        double score = 0.0;
        for (String keyword : NewsDatabase.flaggedKeywordScores.keySet()) {
            if (content.toLowerCase().contains(keyword.toLowerCase())) {
                score += NewsDatabase.flaggedKeywordScores.get(keyword);
            }
        }
        return score;
    }

    private static int matchSamples(String input, String[] samples) {
        int count = 0;
        for (String sample : samples) {
            if (input.toLowerCase().contains(sample.toLowerCase())) {
                count++;
            }
        }
        return count;
    }
}