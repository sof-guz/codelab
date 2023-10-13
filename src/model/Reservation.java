package model;

public class Reservation {
    private Person person;
    private String document;
    private String contactNumber;
    private DateTime dateTime;
    private Reservable reservable;

    public Reservation(Person person, String document, String contactNumber, DateTime dateTime, Reservable reservable) {
        this.person = person;
        this.document = document;
        this.contactNumber = contactNumber;
        this.dateTime = dateTime;
        this.reservable = reservable;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Reservable getReservable() {
        return reservable;
    }

    public void setReservable(Reservable reservable) {
        this.reservable = reservable;
    }
}