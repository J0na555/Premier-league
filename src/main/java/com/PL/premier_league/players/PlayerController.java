package com.PL.premier_league.players;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/premier-league")
public class PlayerController {

    @Autowired
    private PlayerService playerService;



}
