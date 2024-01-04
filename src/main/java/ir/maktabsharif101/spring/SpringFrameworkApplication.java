package ir.maktabsharif101.spring;

import ir.maktabsharif101.spring.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringFrameworkApplication {

    public static void main(String[] args) {

        /*UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);*/

        ClassPathXmlApplicationContext applicationContext =
                new ClassPathXmlApplicationContext(
                        "application-context.xml"
                );

        UserService userService = applicationContext.getBean(UserService.class);

        userService.getUsers();

    }
}
