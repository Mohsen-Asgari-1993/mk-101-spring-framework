package ir.maktabsharif101.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {

//    varzesh3.com
//    localhost:8080/home
//    localhost:8080/home/my


    @RequestMapping
    public String getHomePage() {
        return "home";
    }

    @RequestMapping("/my")
    public String getMyHomePage() {
        return "myIndex";
    }
}
