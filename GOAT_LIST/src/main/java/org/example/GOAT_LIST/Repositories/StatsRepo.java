package org.example.GOAT_LIST.Repositories;

import org.example.GOAT_LIST.Entities.Players;
import org.example.GOAT_LIST.Entities.Stats;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatsRepo extends CrudRepository<Stats, Long> {
    Stats findStatsByPlayerId(Long StatsID);

    Stats findStatsByName (String name);
}
