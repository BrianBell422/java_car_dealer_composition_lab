package vehicle;

public enum BodyType {


    HATCHBACK(4,3),
    ESTATE(4,5),
    SALOON(4,3),
    JEEP(2,5);

    private final int seats;
    private final int doors;

    BodyType(int seats, int doors){
        this.seats = seats;
        this.doors = doors;
    }


    public int getSeats() {
        return seats;
    }

    public int getDoors() {
        return doors;
    }
}
