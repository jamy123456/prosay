package myprosay;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class SpiltTimeDemo {
	public static void main(String[] args) {
       String str = "00:15:00-23:45:00";
       String[] times = str.split("-");
       System.out.println(Arrays.toString(times));
       String[] startTimeArray = times[0].split(":");
       String[] endTimeArray = times[1].split(":");
       System.out.println(Arrays.toString(startTimeArray));
       System.out.println(Arrays.toString(endTimeArray));
       Calendar nowTime = Calendar.getInstance();
       Calendar startTime = Calendar.getInstance();
       Calendar endTime = Calendar.getInstance();
       startTime.set(Calendar.HOUR_OF_DAY, Integer.valueOf(startTimeArray[0])== null ? 0 : Integer.valueOf(startTimeArray[0]));
       startTime.set(Calendar.MINUTE, Integer.valueOf(startTimeArray[1]) == null ? 0 : Integer.valueOf(startTimeArray[1]));
       startTime.set(Calendar.SECOND, Integer.valueOf(startTimeArray[2]) == null ? 0 : Integer.valueOf(startTimeArray[2]));
       endTime.set(Calendar.HOUR_OF_DAY, Integer.valueOf(endTimeArray[0]) == null ? 0 : Integer.valueOf(endTimeArray[0]));
       endTime.set(Calendar.MINUTE, Integer.valueOf(endTimeArray[1]) == null ? 0 : Integer.valueOf(endTimeArray[1]));
       endTime.set(Calendar.SECOND, Integer.valueOf(endTimeArray[2]) == null ? 0 : Integer.valueOf(endTimeArray[2]));
       Date now = nowTime.getTime();
       Date start = startTime.getTime();
       Date end = endTime.getTime();
       if (now.after(start) && now.before(end)){
    	   System.out.println("在交易时间内，可以进行正常交易！");
       }else{
    	   System.out.println("抱歉，系统正在维护中！请稍候再试!!!");
       }
	}
}
