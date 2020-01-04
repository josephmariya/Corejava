package Javadatetime;
import java.time.OffsetTime;
import java.time.temporal.ChronoField;
public class JavaOffsetExample {
	public static void main(String args[])
	{
		OffsetTime offset=OffsetTime.now();
		int h=offset.get(ChronoField.HOUR_OF_DAY);//To get hour
		System.out.println(h);
		int m=offset.get(ChronoField.MINUTE_OF_DAY);//To get total minutes
		System.out.println(m);
		int s=offset.get(ChronoField.SECOND_OF_DAY);//To get total seconds
		System.out.println(s);
		int h1=offset.getHour();//To get current hour
		System.out.println(h1+" hour");
		int m1=offset.getMinute();//To get current minute
		System.out.println(m1+" minute");
		int s1=offset.getSecond();//To get current second
		System.out.println(s1+" second");
	}

}
