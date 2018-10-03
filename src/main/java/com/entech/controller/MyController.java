package main.java.com.entech.controller;

import main.java.com.entech.bean.City;
import main.java.com.entech.service.ICityService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
    
    @Autowired
    ICityService cityService;

    @RequestMapping("/showCities")
    public String findCities(Model model) {
        
        List<City> cities = (List<City>) cityService.findAll();
        
        model.addAttribute("cities", cities);
        
        return "showCities";
    }
}
