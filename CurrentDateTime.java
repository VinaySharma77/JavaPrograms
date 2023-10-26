import java.text.SimpleDateFormat;
import java.util.Date;
class CurrentDateTime{
	public static void main(String args[]){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date currentDate = new Date();
		String formattedDateTime = dateFormat.format(currentDate);
		System.out.println("Current Date and Time : " + formattedDateTime);
	}
}