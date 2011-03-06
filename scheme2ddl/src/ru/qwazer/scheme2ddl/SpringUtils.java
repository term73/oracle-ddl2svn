package ru.qwazer.scheme2ddl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Created by IntelliJ IDEA.
 * User: Reshetnikov AV resheto@gmail.com
 * Date: 19.02.11
 * Time: 15:19
 */
public class SpringUtils {

    static ApplicationContext applicationContext;

//    public static ApplicationContext getApplicationContext() {
//        if (applicationContext == null)
//            applicationContext = new ClassPathXmlApplicationContext("scheme2ddl.config.xml");
//        return applicationContext;
//    }

    public static ApplicationContext getApplicationContext() {
        if (applicationContext == null)
            applicationContext = new FileSystemXmlApplicationContext("scheme2ddl.config.xml");
        return applicationContext;
    }

    public static Object getSpringBean(String beanName){
        return (Object) getApplicationContext().getBean(beanName);
    }
}
