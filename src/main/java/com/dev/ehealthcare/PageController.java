package com.dev.ehealthcare;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
    @RequestMapping("/welcome")
    public String welcomePage() {
        return "welcome";
    }

    @RequestMapping("/welcome1")
    public String welcomePage1() {
        return "welcome1";
    }

    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }

    @RequestMapping("/AdminHome")
    public String adminHomePage() {
        return "AdminHome";
    }
}
