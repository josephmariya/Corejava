package Javadatetime;
import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;
public class MonthDayExample {
   public static void main(String args[])
   {
	   
	  // MonthDay month=MonthDay.now();
	   MonthDay month=MonthDay.parse("--02-29");//To set month and date
	   LocalDate date=month.atYear(2019);//to get date from that year
	   System.out.println(date);
	   boolean a=month.isValidYear(2021);//to check whether that date is for that year
	   System.out.println(a);
	   long b=month.get(ChronoField.MONTH_OF_YEAR);//To get month of year
	   System.out.println(b);
	   ValueRange r1=month.range(ChronoField.MONTH_OF_YEAR);//To get range of months in that year
	   System.out.println(r1);
	   ValueRange r2=month.range(ChronoField.DAY_OF_MONTH);//To get range of days in that particular month in that year
	   System.out.println(r2);
   }
}
