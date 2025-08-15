package com.MyAnimes.projetcMyAnimes.animes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/animes")
public class AnimeController {

    @GetMapping("/oi")
    public String mandarOi(){
        return "OI CHAT";
    }

}
