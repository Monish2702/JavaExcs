package tasks;
 
import java.text.SimpleDateFormat;  
import java.util.Date;  

public class Fifth {
    public static void main(String[] args) {
        Date date = new Date();                                 //day,month,year,time,zone,year
        SimpleDateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");  
        String strDate = formatter.format(date);  
        System.out.println("Date Format: Day MMM DD hr.min.sec TIMEZONE YYYY :\n"+strDate);
    }
} //Fri Aug 01 16:16:27 IST 2008
