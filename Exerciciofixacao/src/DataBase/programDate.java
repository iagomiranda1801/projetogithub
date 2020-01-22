/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

/**
 *
 * @author Iago
 */
public class programDate {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat dat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat dat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat dat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        dat2.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);
        Date x4 = new Date(1000L * 60L * 60L * 5L);

        Date y1 = dat.parse("11/10/2029");
        Date y2 = dat1.parse("12/01/2020 11:34:44");
        Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        
        System.out.println("Data: " + dat1.format(y1));
        System.out.println("Data&Hora: " + dat1.format(y2));
        System.out.println();
        System.out.println("Data&Horario atual: " + dat1.format(x1));
        System.out.println("Data&Horario atual: " + dat1.format(x2));
        System.out.println("Data milissegundos: " + dat1.format(x3));
        System.out.println("Data 5:00 da manhã: " + dat1.format(x4));
        System.out.println("Data formato diferente: " + dat1.format(y3));
        System.out.println();
         System.out.println("Data formato diferente: " + dat2.format(y3));

    }
}
