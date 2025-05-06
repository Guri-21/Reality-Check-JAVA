package data;

import java.util.HashMap;

public class NewsDatabase {
    public static String[] fakeNewsSamples = {
        "Cure for cancer found in banana peel",
        "Aliens land in New York",
        "Politician clones himself",
        "Government gives free cars to everyone",
        "Scientists say Earth is flat again",
        "Shocking: Water turns into wine in Delhi",
        "Celebrity reveals time travel is real",
        "You won't believe what this cat did in Parliament",
        "Secret society controls the world",
        "Miracle pill cures all diseases"
    };

    public static String[] realNewsSamples = {
        "NASA launches climate satellite",
        "India celebrates Republic Day",
        "Economy grows by 6.3%",
        "WHO reports progress on malaria vaccine",
        "New education policy approved by cabinet",
        "Supreme Court rules on privacy case",
        "Government passes infrastructure bill",
        "RBI raises repo rate to 6.5%",
        "Monsoon to arrive early in Kerala",
        "Election Commission releases polling schedule"
    };

    public static HashMap<String, Double> flaggedKeywordScores = new HashMap<>();

    static {
        flaggedKeywordScores.put("shocking", 2.0);
        flaggedKeywordScores.put("breaking", 1.5);
        flaggedKeywordScores.put("exclusive", 1.0);
        flaggedKeywordScores.put("unbelievable", 2.0);
        flaggedKeywordScores.put("miracle", 2.5);
        flaggedKeywordScores.put("secret", 1.5);
        flaggedKeywordScores.put("you won’t believe", 2.0);
        flaggedKeywordScores.put("aliens", 2.0);
        flaggedKeywordScores.put("cure", 1.5);
        flaggedKeywordScores.put("flat earth", 2.0);
        flaggedKeywordScores.put("free money", 2.5);
        flaggedKeywordScores.put("time travel", 2.0);
    }
}