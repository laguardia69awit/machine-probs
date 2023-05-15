package ClassPack;

public class TrafficLight {
    protected String color;
    protected int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void printStatus() {
        if (color.equalsIgnoreCase("red")) {
            System.out.println("Stop");
        } else if (color.equalsIgnoreCase("green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid color");
        }
    }
}
