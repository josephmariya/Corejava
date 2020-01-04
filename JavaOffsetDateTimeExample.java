package Javadatetime;
import java.time.OffsetDateTime;
public class JavaOffsetDateTimeExample {
	public static void main(String args[])
	{
		OffsetDateTime offsetDT=OffsetDateTime.now();
		System.out.println(offsetDT.getDayOfMonth());//Get day of month
		System.out.println(offsetDT.getDayOfYear());//Get day of year
		System.out.println(offsetDT.getDayOfWeek());//get day of week
		System.out.println(offsetDT.toLocalDate());//get local date
		OffsetDateTime value1=offsetDT.minusDays(240);//get offsetdatetime with specified days substracted
		System.out.println(value1);
		OffsetDateTime value2=offsetDT.plusDays(240);//get offsetdatetime with specified days added
		System.out.println(value2);
	}

}
