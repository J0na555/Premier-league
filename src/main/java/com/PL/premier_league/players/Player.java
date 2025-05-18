package com.PL.premier_league.players;


import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
@Document(collection = "players")
public class Player {
    @Id
    private String name;
    private String team;
    private String nation;
    private Integer age;
    private String position;

}
