package controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by 12917 on 2017/6/1.
 */
@Controller
public class Login {
    @RequestMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model){
        if(username.equals("yuanshuai")&&password.equals("123")){
            model.addAttribute("username",username);
            return "page/ok.jsp";

        }
        else
            return "page/no.html";
    }
}
