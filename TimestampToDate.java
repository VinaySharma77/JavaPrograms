import java.util.Date;
public class TimestampToDate{
    public static void main(String[] args) {
        long timestamp = System.currentTimeMillis();
        Date date = new Date(timestamp);
        System.out.println("Timestamp: " + timestamp);
        System.out.println("Date: " + date);
    }
}
