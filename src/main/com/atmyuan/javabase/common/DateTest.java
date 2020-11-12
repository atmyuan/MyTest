package main.com.atmyuan.javabase.common;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
    public static void main (String[] args) throws ParseException {
        Date date = new Date();
        System.out.println("date=" + date);
        System.out.println("date.getTime()=" + date.getTime());
        //日期格式转行类
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //时间转字符串
        String dateStr = dateFormat.format(date);
        System.out.println("dateStr=" + dateStr);
        //字符串转时间  注意parse()方法抛出了异常，所以此处需要进行异常处理，抓取或者抛出
        Date date1 = dateFormat.parse("2020-01-01 10:10:10");
        System.out.println("date1=" + date1);
    }
}
