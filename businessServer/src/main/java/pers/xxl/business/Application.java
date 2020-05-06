package pers.xxl.business;

import org.apache.log4j.PropertyConfigurator;
import java.util.logging.Logger;

public class Application {

    //private static  Logger logger = LogManager.getLogger(Application.class.getName());
    public static void main(String[] args) {
        PropertyConfigurator.configure("F:\\JAVA\\Develop\\ECommerceRecommendSystem\\businessServer\\src\\main\\resources\\log4j.properties");
        Logger logger  =  Logger.getLogger(Application.class.getName());
        System.out.println(Math.round(4.466D));
        logger.info("这是条日志");
    }



}
