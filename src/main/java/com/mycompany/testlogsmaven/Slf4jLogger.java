package com.mycompany.testlogsmaven;
//import java.util.logging.Level;
// import java.util.logging.Logger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


//public class JuliLogger {
//        private static final Logger LOGGER = Logger.getLogger(JuliLogger.class.getName());
//        public void showLog()  {
//                LOGGER.log(Level.INFO, "Logger Name: {0}", LOGGER.getName());
//                LOGGER.warning("Can cause ArrayIndexOutOfBoundsException");
//                //An array of size 3
//                while (true){
//                        try{
//                        LOGGER.severe("Log a SEVERE message. -"+LOGGER.getName());
//                        LOGGER.warning("Log a WARNING message. -"+LOGGER.getName());
//                        LOGGER.info("Log an INFO message. -"+LOGGER.getName());
//                        LOGGER.config("Log an CONFIG message. -"+LOGGER.getName());
//                        LOGGER.fine("Log an FINE message. -"+LOGGER.getName());
//                        LOGGER.finer("Log an FINER message. -"+LOGGER.getName());
//                        LOGGER.finest("Log an FINEST message. -"+LOGGER.getName());
//                        }
//                        catch(ArrayIndexOutOfBoundsException ex){
//                                LOGGER.log(Level.SEVERE, "Exception occur", ex);
//                        }
//                }
//        }
//}

public class Slf4jLogger {
    private static final Logger SLF4J = LoggerFactory.getLogger(Slf4jLogger.class.getName());
    public void showLog()  {
                SLF4J.info("Logger Name: "+SLF4J.getName());
                 //An array of size 3
                while (true){
                        SLF4J.debug("Log debug level");
                        SLF4J.error("Log error level");
                        SLF4J.info("Log info level");
                        SLF4J.trace("Log trace level");
                }
        }
}