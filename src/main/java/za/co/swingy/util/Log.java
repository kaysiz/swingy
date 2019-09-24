package za.co.swingy.util;

import static za.wtc.swingy.StaticGlobal.*;
import static za.wtc.swingy.StaticGlobal.CONSOLE_MODE;

/**
 * Log
 */
public class Log {

    /**
     * 
     * @param message
     */
    public static void log(String message) {
        if (CONSOLE_MODE == true) {
            System.out.println(message);   
        }
    }
}