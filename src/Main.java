import models.Camera;

public class Main {
    public static void main(String[] args) {
        System.out.println("Urban Surveillance System\n");

        Camera cam = new Camera("CAM-001", "Times Plaza North", "PUBLIC", true);
        System.out.println(cam);
    }
}