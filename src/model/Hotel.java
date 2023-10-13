package model;

public class Hotel implements Reservable {
    private String name;

    public Hotel(String name) {
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
        return "Hotel Reservation";
    }
}