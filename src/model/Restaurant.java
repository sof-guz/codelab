package model;

public class Restaurant implements Reservable {
    private String name;

    public Restaurant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getReservationType() {
        return "Restaurant Reservation";
    }
}