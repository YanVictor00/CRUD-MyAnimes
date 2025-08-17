package com.MyAnimes.projetcMyAnimes.animes;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/animes")
public class AnimeController {

    private AnimeService animeService;

    public AnimeController(AnimeService animeService) {
        this.animeService = animeService;
    }

    @GetMapping("/oi")
    public String mandarOi(){
        return "OI CHAT";
    }

    //C R U D

    //READ
    @GetMapping("/read")
    public List<AnimeModel> readAnimes(){
        return animeService.readAnimes();
    }


}
