public class Building {
    private String name;
    private int floors;
    private int elevators;
    private ElevatorSystem elevatorSystem;

    public Building(String name, int floors, int elevators) {
        this.name = name;
        this.floors = floors;
        this.elevators = elevators;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public int getElevators() {
        return elevators;
    }

    public void setElevators(int elevators) {
        this.elevators = elevators;
    }
}
