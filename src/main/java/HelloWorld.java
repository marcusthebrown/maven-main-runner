import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * This program requires the Apache commons-logging library to run. The dependency will be downloaded and added to the
 * classpath before the program runs.
 */
public class HelloWorld {

    private static final Log LOG = LogFactory.getLog(HelloWorld.class);

    public static void main(String[] args) {

        LOG.info("sup");

    }

}
