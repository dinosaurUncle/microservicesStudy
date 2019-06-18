package microservicesboot.demo;

import microservicesboot.demo.dao.TeamDao;
import microservicesboot.demo.domain.Player;
import microservicesboot.demo.domain.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class MicroservicesBootApplication extends SpringBootServletInitializer {

    /**
     * Used when run as a JAR
     */

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesBootApplication.class, args);
    }

    /**
     *
     * Used when run as a War
     */


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MicroservicesBootApplication.class);
    }

    @PostConstruct
    public void init(){
        Set<Player> players = new HashSet<>();
        players.add(new Player("Son", "left-Winger"));
        players.add(new Player("Hwang", "center-forward"));

        Team team = new Team("A-Team", "Soccer", players);
        teamDao.save(team);
    }

    @Autowired TeamDao teamDao;

}



