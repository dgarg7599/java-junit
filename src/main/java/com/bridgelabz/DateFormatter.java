import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateFormatter {
    public static String formatDate(String inputDate){
        DateTimeFormatter fromFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter toFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        try {
            LocalDate date = LocalDate.parse(inputDate, fromFormatter);
            return date.format(toFormatter);
        }catch (DateTimeParseException e){
            throw new IllegalArgumentException("Wrong Input Date");
        }

    }
}
