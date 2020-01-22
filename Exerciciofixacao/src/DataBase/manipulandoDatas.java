/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Iago
 */
public class manipulandoDatas {
    
    public static void main (String[] args) {
        
        SimpleDateFormat dat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
         Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        
        System.out.println(dat.format(y3));
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(y3);
        int month   = cal.get(Calendar.MONTH);
        //cal.add(Calendar.HOUR_OF_DAY, 4);
        //y3 = cal.getTime();
        
        int minutes = cal.get(Calendar.MINUTE);
        
        
        System.out.println("5 horas a mais: " + dat.format(y3));
        System.out.println("Minutos da data: " + minutes);
        System.out.println("Mês da data " + month);
        
        
    }
    
}
