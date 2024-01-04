package ir.maktabsharif101.spring.service;

import ir.maktabsharif101.spring.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void getUsers() {
        System.out.println("getting users from repository");
        userRepository.getUsers();
    }

    public void getSingleUser() {

    }

}
