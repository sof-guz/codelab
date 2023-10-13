// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.time.LocalDateTime;
import model.Reservable;
import model.Person;
import model.DateTime;
import model.Hotel;
import model.Reservation;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("John Doe");
        DateTime dateTime = new DateTime(LocalDateTime.now());
        Reservable hotel = new Hotel("Luxury Hotel");


        Reservation reservation = new Reservation(person, "123456789", "987654321", dateTime, hotel);


        System.out.println("Reserva realizada por: " + reservation.getPerson().getName());
        System.out.println("Documento: " + reservation.getDocument());
        System.out.println("Contacto: " + reservation.getContactNumber());
        System.out.println("Fecha y Hora: " + reservation.getDateTime().getDateTime());
        System.out.println("Tipo de Reserva: " + reservation.getReservable().getReservationType());
    }
}