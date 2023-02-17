package edu.wctc.springbootassignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/steps")
public class StepsController {
    @RequestMapping("/step1")
    public String showStep1(){
        return "pages/findingCat";
    }
    @RequestMapping("/step2")
    public String showStep2(){
        return "pages/findingHatBowl";
    }
    @RequestMapping("/step3")
    public String showStep3(){
        return "pages/installingCatHat";
    }

}
