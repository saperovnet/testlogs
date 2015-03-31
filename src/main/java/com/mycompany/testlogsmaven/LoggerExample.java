/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testlogsmaven;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerExample {

        private static final Logger LOGGER = Logger.getLogger(LoggerExample.class.getName());
        
        
        public void showLog()  {

                LOGGER.info("Logger Name: "+LOGGER.getName());

                LOGGER.warning("Can cause ArrayIndexOutOfBoundsException");

                //An array of size 3
                while (true){
                        try{
                        //        System.out.println(a[i]);
                        LOGGER.severe("Log a SEVERE message.");
                        LOGGER.warning("Log a WARNING message.");
                        LOGGER.info("Log an INFO message.");
                        LOGGER.config("Log an CONFIG message.");
                        LOGGER.fine("Log an FINE message.");
                        LOGGER.finer("Log an FINER message.");
                        LOGGER.finest("Log an FINEST message.");
                        }
                        catch(ArrayIndexOutOfBoundsException ex){
                                LOGGER.log(Level.SEVERE, "Exception occur", ex);
                        }
                }
        }
}
