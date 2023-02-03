package livingspace.rooms;

public class DiningRoom {

    private int windows;
    private boolean tv;
    private int chairsCapacity;

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

    public int getChairsCapacity() {
        return chairsCapacity;
    }

    public void setChairsCapacity(int chairsCapacity) {
        this.chairsCapacity = chairsCapacity;
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
