package za.ac.cput.secure.springdemo.securespring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("")
    public String home(){
        return "home.jsp";
    }
}
