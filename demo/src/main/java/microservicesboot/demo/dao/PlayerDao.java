package microservicesboot.demo.dao;

import microservicesboot.demo.domain.Player;
import microservicesboot.demo.domain.Team;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RestResource(path="players", rel="players")
public interface PlayerDao extends CrudRepository<Player, Long> {
    Player findByName (String name);
}
