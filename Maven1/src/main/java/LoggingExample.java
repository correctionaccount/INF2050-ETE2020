import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LoggingExample {
    private static Log log = LogFactory.getLog(LoggingExample.class);

    public static void main (String args[]){
        log.info("Info dans la méthode main");
        log.error("Erreur dans la méthode main");
    }
}
