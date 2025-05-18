package com.PL.premier_league.players;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface PlayerRepo extends MongoRepository < Player , String > {


}
