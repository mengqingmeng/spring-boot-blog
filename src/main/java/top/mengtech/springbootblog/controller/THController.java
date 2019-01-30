package top.mengtech.springbootblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import top.mengtech.springbootblog.domain.User;

@Controller
@RequestMapping("th")
public class THController {


    @RequestMapping("test")
    public ModelAndView test(Model model){

        User user = new User((long)1,"meng","7625");
        model.addAttribute("user",user);
        return new ModelAndView("th/test","userModel",model);
    }

}
