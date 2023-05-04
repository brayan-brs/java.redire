package com.order.demo.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {

    @GetMapping("/1")
    public String home() {
        return "home";
    }

    @GetMapping("/2")
    public String HomePage() {
        return "home2";
    }

    @GetMapping("/redirect")
    public RedirectView simpleRedirect(@RequestParam("url") String target) {
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl(target);
        return redirectView;
    }

}

 


