import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DifferenceBetweenDate {

    public static Duration durationBetweenTime(LocalTime time1, LocalTime time2) {
        if (time1 == null || time2 == null) {
            return null;
        }

        return Duration.between(time1, time2).abs();
    }

    public static Period periodBetweenDate(LocalDate date1, LocalDate date2) {
        if (date1 == null || date2 == null) {
            return null;
        }

        if (date1.isAfter(date2)) {
            return Period.between(date2, date1);
        }

        return Period.between(date1, date2);
    }

    public static Long numberOfHoursBetweenDateTime(LocalDateTime date1, LocalDateTime date2) {
        if (date1 == null || date2 == null) {
            return null;
        }

        return Math.abs(ChronoUnit.HOURS.between(date1, date2));
    }
}