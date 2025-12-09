package models;

import java.time.LocalDateTime;

public class Detection {
    //Private fields
    private String detectionId;
    private String cameraId;
    private LocalDateTime timestamp;
    private String personId;
    private String matchedIdentity;
    private double confidence;
    private String activity;
    private int durationSeconds;

    //Constructor - FIX
    public Detection(String detectionId, String cameraId, LocalDateTime timestamp, String personId, String matchedIdentity, double confidence, String activity, int durationSeconds) {
        this.detectionId = detectionId;
        this.cameraId = cameraId;
        this.timestamp = timestamp;
        this.personId = personId;
        this.matchedIdentity = matchedIdentity;
        this.confidence = confidence;
        this.activity = activity;
        this.durationSeconds = durationSeconds;
    }

    //Getters
    public String getDetectionId() {
        return detectionId;
    }
    public String getCameraId() {
        return cameraId;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public String getPersonId() {
        return personId;
    }
    public String getMatchedIdentity() {
        return matchedIdentity;
    }
    public double getConfidence() {
        return confidence;
    }
    public String getActivity() {
        return activity;
    }
    public int getDurationSeconds() {
        return durationSeconds;
    }

    //Methods - FIX
    public static boolean isUnknown() {
        if (matchedIdentity == null || matchedIdentity == "null") {
            return true;
        }
        else {
            return false;
        }
    }
}
