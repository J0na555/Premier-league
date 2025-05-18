package com.PL.premier_league.players;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.InputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import jakarta.annotation.PostConstruct;

@Component
public class JsonDataLoader {

    @Autowired
    private PlayerRepo playerRepo;

    @PostConstruct
    public void loadJsonData() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        InputStream inputStream = new ClassPathResource("players.json").getInputStream();

        List<Player> players = mapper.readValue(inputStream, new TypeReference<List<Player>>() {});
        playerRepo.saveAll(players);

}
}
