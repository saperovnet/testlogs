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
                int []a = {1,2,3};
                for (int i=0;  i <= 4; i++){
                        LOGGER.info("Index is set to "+i);
                        try{
                                System.out.println(a[i]);
                        }
                        catch(ArrayIndexOutOfBoundsException ex){
                                LOGGER.log(Level.SEVERE, "Exception occur", ex);
                        }
                }
        }
}