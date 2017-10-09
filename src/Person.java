public class Person {

    private String name;
    private int originToDestinationTime;
    private int floorSpace; //amount of space someone takes from the elevator

    public Person(String name, int originToDestinationTime, int floorSpace) {
        this.name = name;
        this.originToDestinationTime = originToDestinationTime;
        this.floorSpace = floorSpace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOriginToDestinationTime() {
        return originToDestinationTime;
    }

    public void setOriginToDestinationTime(int originToDestinationTime) {
        this.originToDestinationTime = originToDestinationTime;
    }

    public int getFloorSpace() {
        return floorSpace;
    }

    public void setFloorSpace(int floorSpace) {
        this.floorSpace = floorSpace;
    }
}
