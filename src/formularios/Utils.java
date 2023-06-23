/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Eduardo Avila <eduavila25@gmail.com>
 */
public class Utils {

    public static String rutaLog = "C:/Fichero/log.txt";
    
    public static void escribirLog(String mensaje) throws IOException {
        Logger logger = Logger.getLogger("MyLog");
        FileHandler fh;

        try {
            fh = new FileHandler(rutaLog, true);
            logger.addHandler(fh);

            SimpleFormatter formater = new SimpleFormatter();

            fh.setFormatter(formater);

            logger.info(mensaje);

            fh.close();

        } catch (SecurityException e) {
            e.printStackTrace();
        }
    }
}
