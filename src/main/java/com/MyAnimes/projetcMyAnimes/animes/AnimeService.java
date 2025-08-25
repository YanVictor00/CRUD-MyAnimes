package com.MyAnimes.projetcMyAnimes.animes;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AnimeService {

    private final AnimeRepository animeRepository;

    public AnimeService(AnimeRepository animeRepository) {
        this.animeRepository = animeRepository;
    }

    //READ
    public List<AnimeModel> readAnimes(){
        return animeRepository.findAll();
    }

    //READ BY ID
    public AnimeModel readAnimesId(Long id){
        Optional<AnimeModel> animePorId = animeRepository.findById(id);
        return animePorId.orElse(null);
    }

}
