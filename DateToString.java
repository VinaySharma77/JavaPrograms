import java.text.SimpleDateFormat;
import java.util.Date;
public class DateToString{
    public static void main(String[] args) {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = dateFormat.format(currentDate);
        System.out.println("Date as String: " + dateString);
    }
}
