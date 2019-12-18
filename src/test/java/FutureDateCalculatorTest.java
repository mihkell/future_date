import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class FutureDateCalculatorTest {

    @Test
    public void futureDate_1() {
        LocalDate date = LocalDate.of(2019, 12, 18);
        Set<LocalDate> holidays = new HashSet<>();
        holidays.add(LocalDate.of(2019, 12, 21));
        holidays.add(LocalDate.of(2019, 12, 22));

        FutureDateCalculator futureDateCalculator = new FutureDateCalculator(holidays);

        int daysFromNow = 1;
        LocalDateTime result = futureDateCalculator.futureDate(date, daysFromNow);

        assertEquals(LocalDateTime.of(2019, 12, 19, 23, 59), result);
    }

    @Test
    public void futureDate_2() {
        LocalDate date = LocalDate.of(2019, 12, 18);
        Set<LocalDate> holidays = new HashSet<>();
        holidays.add(LocalDate.of(2019, 12, 21));
        holidays.add(LocalDate.of(2019, 12, 22));

        FutureDateCalculator futureDateCalculator = new FutureDateCalculator(holidays);

        int daysFromNow = 2;
        LocalDateTime result = futureDateCalculator.futureDate(date, daysFromNow);

        assertEquals(LocalDateTime.of(2019, 12, 20, 23, 59), result);
    }

    @Test
    public void futureDate_4() {
        LocalDate date = LocalDate.of(2019, 12, 18);
        Set<LocalDate> holidays = new HashSet<>();
        holidays.add(LocalDate.of(2019, 12, 21));
        holidays.add(LocalDate.of(2019, 12, 22));

        FutureDateCalculator futureDateCalculator = new FutureDateCalculator(holidays);

        int daysFromNow = 4;
        LocalDateTime result = futureDateCalculator.futureDate(date, daysFromNow);

        assertEquals(LocalDateTime.of(2019, 12, 23, 23, 59), result);
    }

}