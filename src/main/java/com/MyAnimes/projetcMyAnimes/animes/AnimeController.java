package com.MyAnimes.projetcMyAnimes.animes;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/read/{id}")
    public AnimeModel readAnimesId(@PathVariable Long id){
        return animeService.readAnimesId(id);
    };

    //CREATE
    @PostMapping("/create")
    public AnimeModel createAnimes(@RequestBody AnimeModel animeModel){
        return animeService.createAnimes(animeModel);
    }

}
