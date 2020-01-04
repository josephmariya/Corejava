package Javadatetime;
import java.time.Clock;
import java.time.Duration;
public class JavaClockExample {
	  public static void main(String args[])
	  {
		  Clock c1=Clock.systemDefaultZone();
		  System.out.println(c1.getZone());//To get default time zone
		  Clock c2=Clock.systemUTC();
		  System.out.println(c2.instant());//To get current instant of clock in GMT
		  Duration d=Duration.ofMinutes(330);
		  Clock clock=Clock.offset(c2, d);//To add specified minutes with above time
		  System.out.println(clock.instant());//To get added time
	}
}
