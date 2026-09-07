import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DifferenceBetweenDate {

    public static Duration durationBetweenTime(LocalTime time1, LocalTime time2) {
        return Duration.between(time1, time2).abs();
    }

    public static Period periodBetweenDate(LocalDate date1, LocalDate date2) {
        return date1.isBefore(date2)
            ? Period.between(date1, date2)
            : Period.between(date2, date1);
    }

    public static Long numberOfHoursBetweenDateTime(
            LocalDateTime dateTime1, LocalDateTime dateTime2) {
        return Math.abs(ChronoUnit.HOURS.between(dateTime1, dateTime2));
    }
}