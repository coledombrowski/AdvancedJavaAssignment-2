package itds.bcis3680;

import java.util.Date;

public class TimeStamp
{
    public static String getCurrentTime()
    {     
        Date now = new Date();
        return now.toString();
    }  
}