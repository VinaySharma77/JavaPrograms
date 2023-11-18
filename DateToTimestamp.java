import java.util.Date;
import java.sql.Timestamp;
public class DateToTimestamp{
    public static void main(String[] args) {
        Date date = new Date();
        Timestamp timestamp = new Timestamp(date.getTime());
        System.out.println("Date: " + date);
        System.out.println("Timestamp: " + timestamp);
    }
}
