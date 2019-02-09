package utilities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class Utilities {

	public static final String SPLIT_CHARACTER= "\\?+"; 
	public static final String SPLIT_DATE_CHARACTER= "/+";
	public static final String SPLIT_TIME_CHARACTER= ":+";

	public String[] splitLine(String line){
		return line.split(SPLIT_CHARACTER);
	}

	public String[] splitDate(String date){
		return date.split(SPLIT_DATE_CHARACTER);
	}

	public String[] splitTime(String date){
		return date.split(SPLIT_TIME_CHARACTER);
	}

	public Calendar sendDate(String[] date){
		Calendar dateV = Calendar.getInstance();
		dateV.set(Integer.parseInt(date[2]), Integer.parseInt(date[0])-1, Integer.parseInt(date[1]));
		return dateV;
	}

	public Calendar sendTime(String[] record){
		Calendar time = Calendar.getInstance();
		time.set(0, 0, 0, Integer.parseInt(record[0]), Integer.parseInt(record[1]), Integer.parseInt(record[2]));
		return time;
	}

	public static Calendar parseDateToCalendar(Date date) { 
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar;
	}
	
	public static String toStringCalendar(Calendar calendar){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY");
		return simpleDateFormat.format(calendar.getTime());
		
	}
}
