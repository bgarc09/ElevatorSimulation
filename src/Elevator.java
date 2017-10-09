public abstract class Elevator {

    private String id;
    private int currentLevel;
    private int floorsTraveled;
    private int capacity;

    public Elevator() {
        currentLevel = 0;
        floorsTraveled = 0;
    }

    public void up() {
        currentLevel++;
        floorsTraveled++;
    }

    public void down() {
        currentLevel--;
        floorsTraveled;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public int getFloorsTraveled() {
        return floorsTraveled;
    }

    public void setFloorsTraveled(int floorsTraveled) {
        this.floorsTraveled = floorsTraveled;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Elevator{" +
                "id='" + id + '\'' +
                ", currentLevel=" + currentLevel +
                ", floorsTraveled=" + floorsTraveled +
                ", capacity=" + capacity +
                '}';
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Elevator)) return false;
        if (!super.equals(object)) return false;

        Elevator elevator = (Elevator) object;

        if (getCurrentLevel() != elevator.getCurrentLevel()) return false;
        if (getFloorsTraveled() != elevator.getFloorsTraveled()) return false;
        if (getCapacity() != elevator.getCapacity()) return false;
        if (getId() != null ? !getId().equals(elevator.getId()) : elevator.getId() != null) return false;

        return true;
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (getId() != null ? getId().hashCode() : 0);
        result = 31 * result + getCurrentLevel();
        result = 31 * result + getFloorsTraveled();
        result = 31 * result + getCapacity();
        return result;
    }
}
