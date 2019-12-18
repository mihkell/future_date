import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

public class FutureDateCalculator {


    private Set<LocalDate> holidays;

    public FutureDateCalculator(Set<LocalDate> holidays) {
        this.holidays = holidays;
    }

    public LocalDateTime futureDate(LocalDate date, int daysFromNow) {
        int dayCount = 0;
        LocalDate val = date;

        while (dayCount < daysFromNow) {
            val = val.plusDays(1);
            if (holidays.contains(val)) {
                continue;
            }
            dayCount++;
        }

        return val.atTime(23, 59);
    }
}
