package microservicesboot.demo;

import microservicesboot.demo.domain.Player;
import microservicesboot.demo.domain.Team;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@RestController
public class WhateverIWant {

    private Team team;

    @PostConstruct
    public void init(){
        Set<Player> players = new HashSet<>();
        players.add(new Player("Son", "left-Winger"));
        players.add(new Player("Hwang", "center-forward"));

        team = new Team("A-Team", "Soccer", players);
        System.out.println(team);
    }

    @RequestMapping("/team")
    public Team koreanSoccerTeam() {
        return team;
    }
}
