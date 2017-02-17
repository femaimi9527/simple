package watercup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Ji on 2017/2/17.
 */
@Controller
public class simpleController {
    @RequestMapping("/index")
    public String simple(ModelMap map){
        map.addAttribute("temp","new出蕾姆！");
        return "simple";
    }
}
