import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class StringToDate{
    public static void main(String[] args) {
        String dateString = "2023-11-18 12:30:00";
        String pattern = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            Date date = dateFormat.parse(dateString);
            System.out.println("Converted Date: " + date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
