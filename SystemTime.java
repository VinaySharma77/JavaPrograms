import java.util.Date;
import java.text.SimpleDateFormat;
class SystemTime{
	public static void main(String args[]){
		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
		String formattedDate = dateFormat.format(currentDate);
		System.out.println("Current System Time is : " + formattedDate);
	}
}