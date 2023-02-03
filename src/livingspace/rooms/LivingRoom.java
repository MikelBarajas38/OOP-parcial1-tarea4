package livingspace.rooms;

public class LivingRoom {

    private int windows;
    private boolean tv;
    private boolean homeTheater;

    private int width;
    private int height;
    private String color;

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public boolean hasTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public boolean hasHomeTheater() {
        return homeTheater;
    }

    public void setHomeTheater(boolean homeTheater) {
        this.homeTheater = homeTheater;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
