package edu.wctc.springbootassignment;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("success")
public class SuccessPageController {
    @RequestMapping("/successPage")
    public String successPage(){
        return "pages/success";
    }
}
