package model;
import java.time.LocalDateTime;
public class DateTime {
    private LocalDateTime dateTime;

    public DateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}