package microservicesboot.demo;

import microservicesboot.demo.dao.PlayerDao;
import microservicesboot.demo.dao.TeamDao;
import microservicesboot.demo.domain.Player;
import microservicesboot.demo.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@RestController
public class WhateverIWant {

    @Autowired
    TeamDao teamDao;

    @Autowired
    PlayerDao playerDao;

    @RequestMapping("/hi/{name}")
    public Team koreanSoccerTeam(@PathVariable String name) {
        return teamDao.findByName(name);
    }

    @RequestMapping("/player/{name}")
    public Player koreanSoccerPlayer(@PathVariable String name) {
        return playerDao.findByName(name);
    }
}
