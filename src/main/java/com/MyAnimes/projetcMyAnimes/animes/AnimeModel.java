package com.MyAnimes.projetcMyAnimes.animes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_animes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnimeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    long id;

    @Column(name = "IMAGEM")
    String imagem;

    @Column(name = "NOME")
    String nome;

    @Column(name = "NOTA")
    int nota;

    @Column(name = "PERSONAGEM FAVORITO")
    String personagemFavorito;

}
