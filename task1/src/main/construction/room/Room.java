package main.construction.room;

public class Room {

    private String name;
    private Window[] windows;
    private Wall[] walls;
    private Door[] doors;
    private Floor floor;
    private Ceiling ceiling;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Window[] getWindows() {
        return windows;
    }

    public void setWindows(Window[] windows) {
        this.windows = windows;
    }

    public Wall[] getWalls() {
        return walls;
    }

    public void setWalls(Wall[] walls) {
        this.walls = walls;
    }

    public Door[] getDoors() {
        return doors;
    }

    public void setDoors(Door[] doors) {
        this.doors = doors;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }

    public void setCeiling(Ceiling ceiling) {
        this.ceiling = ceiling;
    }
}
