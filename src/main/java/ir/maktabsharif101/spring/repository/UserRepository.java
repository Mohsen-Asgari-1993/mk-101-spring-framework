package ir.maktabsharif101.spring.repository;

import org.springframework.stereotype.Component;

@Component
public class UserRepository {

    public void getUsers() {
        System.out.println("getting users from DB");
    }

}
