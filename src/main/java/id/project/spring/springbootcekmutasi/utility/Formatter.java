package id.project.spring.springbootcekmutasi.utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Arza Jasmelia.
 * springboot-add-nasabah
 * on 11/09/2020
 */

public class Formatter {

    public String getDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }

    public String getTime(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);
    }
}
