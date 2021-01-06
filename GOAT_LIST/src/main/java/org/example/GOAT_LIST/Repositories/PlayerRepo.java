package org.example.GOAT_LIST.Repositories;

import org.example.GOAT_LIST.Entities.Players;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepo extends CrudRepository<Players, Integer> {
    Players findPlayersByPlayerId(int playerId);

    Players findPlayersByName (String name);

    List<Players> findAllByChampionships(int championships);

    List<Players> findAll();



//    Players findPlayersByAllStar(int allStar);

    }

