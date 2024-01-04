package ir.maktabsharif101.spring;

import ir.maktabsharif101.spring.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringFrameworkApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(
                        SpringFrameworkApplication.class
                );

        applicationContext.getBean(UserService.class)
                .getUsers();

        applicationContext.getBean(TestBean.class);
    }
}
