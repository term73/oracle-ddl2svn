/*
 *    Copyright (c) 2011.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

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
