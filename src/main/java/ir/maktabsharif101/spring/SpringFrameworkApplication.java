package ir.maktabsharif101.spring;

import ir.maktabsharif101.spring.config.AppConfig;
import ir.maktabsharif101.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringFrameworkApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(
                        AppConfig.class
                );

        applicationContext.getBean(UserService.class)
                .getUsers();
    }
}
