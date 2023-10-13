package model;

public class MedicalAppointment implements Reservable {
    private String speciality;

    public MedicalAppointment(String speciality) {
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String getReservationType() {
        return "Medical Appointment";
    }
}