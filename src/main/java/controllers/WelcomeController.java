package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {
    @RequestMapping(value = "/")
    public String showWelcome(){
        return "welcome";
    }

    @RequestMapping(value = "/toTry")
    public String showToTry(){
        return "placesToTry";
    }

    @RequestMapping(value = "/IveTried")
    public String showTried(){
        return "placesIveTried";
    }

    @RequestMapping(value = "/toTry/addToTry")
    public String showToTryForm(){
        return "addToTryForm";
    }
}
