package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.PlacesToTry;

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

    @RequestMapping(value = "/addToTry", method= RequestMethod.POST)
    public String addToTry(@ModelAttribute("placeToTry")PlacesToTry placesToTry,
                           ModelMap model){
        model.addAttribute("restName", placesToTry.getRestName());
        model.addAttribute("restType", placesToTry.getRestType());
        model.addAttribute("priceEnum", placesToTry.getPriceEnum());
        model.addAttribute("speedEnum", placesToTry.getSpeedEnum());
        model.addAttribute("tagEnum", placesToTry.getTagEnum());


        return "placesToTryAdded";
    }

}
