package models;

public class Camera {
    //Private fields
    private String cameraId;
    private String location;
    private String zone;
    private boolean isActive;
    
    //Constructor
    public Camera(String cameraId, String location, String zone, boolean isActive) {
        this.cameraId = cameraId;
        this.location = location;
        this.zone = zone;
        this.isActive = isActive;
    }

    //Getters
    public String getCameraId() {
        return cameraId;
    }

    public String getLocation() {
        return location;
    }

    public String getZone() {
        return zone;
    }

    public boolean isActive() {
        return isActive;
    }

    // toString for printing
    @Override
    public String toString() {
        String status = isActive ? "ACTIVE" : "INACTIVE";
        return "Camera[" + cameraId + "] " + location + " (" + zone + ") - " + status; 
    }
}
