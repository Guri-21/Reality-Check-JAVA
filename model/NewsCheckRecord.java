package model;

import java.util.Date;

public class NewsCheckRecord {
    private int newsID;
    private String content;
    private double credibilityScore;
    private String status; // "Likely Real" or "Likely Fake"
    private Date timestamp;

    public NewsCheckRecord(int newsID, String content, double credibilityScore, String status) {
        this.newsID = newsID;
        this.content = content;
        this.credibilityScore = credibilityScore;
        this.status = status;
        this.timestamp = new Date(); // current timestamp
    }

    public int getNewsID() {
        return newsID;
    }

    public String getContent() {
        return content;
    }

    public double getCredibilityScore() {
        return credibilityScore;
    }

    public String getStatus() {
        return status;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "News ID: " + newsID + "\nContent: " + content + "\nScore: " + credibilityScore + "\nStatus: " + status + "\nDate: " + timestamp;
    }
}
