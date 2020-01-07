package Javadateclassical;
import java.util.Calendar;
public class JavaCalenderExample {
    public static void main(String args[])
    {
    	Calendar calendar=Calendar.getInstance();
    	System.out.println("The current date is : "+ calendar.getTime());
    	calendar.add(Calendar.DATE, -15);//Date before 15 days
    	System.out.println("15 days ago :"+calendar.getTime());
    	calendar.add(Calendar.MONTH, 4);//Date after 4 months
    	System.out.println("4 months later :"+calendar.getTime());
    	calendar.add(Calendar.YEAR, 2);//Date after 2 years
    	System.out.println("4 years later :"+calendar.getTime());
    	System.out.println("At present Calendar's Year :"+calendar.get(Calendar.YEAR));//Present calendar year
    	System.out.println("At present Calendar's Day :"+calendar.get(Calendar.DATE));//Present calendar day
    	System.out.println("At present Date and Time is :"+calendar.getTime());//Present date and time
    	int maximum=calendar.getMaximum(Calendar.DAY_OF_WEEK);//Maximum days in week
    	System.out.println("Maximum number of days in a week :"+maximum);
    	maximum=calendar.getMaximum(Calendar.WEEK_OF_YEAR);//Maximum weeks in year
    	System.out.println("Maximum number of weeks in year :"+maximum);
    	int minimum=calendar.getMinimum(Calendar.DAY_OF_WEEK);//Minimum days in week
    	System.out.println("Minimum number of days in a week :"+minimum);
    	minimum=calendar.getMinimum(Calendar.WEEK_OF_YEAR);//Minimum weeks in year
    	System.out.println("Minimum number of weeks in year :"+minimum);
    }
}
