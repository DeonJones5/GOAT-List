package org.example.GOAT_LIST.Repositories;

import org.example.GOAT_LIST.Entities.Players;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepo extends CrudRepository<Players, Integer> {
    Players findPlayersByPlayerId(int playerId);
}
