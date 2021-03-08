package guru.springframework;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jt on 2018-12-09.
 */
public class JavaHelloWorld {
    private static final Logger logger = LoggerFactory.getLogger(JavaHelloWorld.class);
    public String getHello(){
        logger.debug("debug level logudur");
        logger.info("info level logudur");
        logger.warn("warn level logudur");
        logger.error("error level logudur");
        return "Hello World";
    }

}
