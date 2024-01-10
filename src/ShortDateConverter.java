import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ShortDateConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a short date (YYYY-MM-DD): ");
        String shortDateInput = scanner.nextLine();

        try {
            Date shortDate = new SimpleDateFormat("yyyy-MM-dd").parse(shortDateInput);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(shortDate);
            int year = calendar.get(Calendar.YEAR);
            int month = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DAY_OF_MONTH);
            String monthName = new DateFormatSymbols().getMonths()[month];
            System.out.println("Full Date: " + monthName + " " + day + ", " + year);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter the date in the format YYYY-MM-DD.");
        } finally {
            scanner.close();
        }
    }
}
