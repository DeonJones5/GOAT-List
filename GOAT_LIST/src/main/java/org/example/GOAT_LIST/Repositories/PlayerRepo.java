package org.example.GOAT_LIST.Repositories;

import org.example.GOAT_LIST.Entities.Players;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepo extends CrudRepository<Players, Long> {
    Players findPlayersByPlayerId(Long playerId);

    Players findPlayersByName (String name);

    List<Players> findAllByChampionships(int championships);

    List<Players> findAll();

    Boolean existsByName(String name);

    @Query("FROM Players ORDER BY Championships DESC")
    List<Players> findAllByOrderByChampionships();

    @Query("FROM Players ORDER BY Name ASC")
    List<Players> findAllByOrderByName();

//    @Query("FROM Players WHERE UPPER(Name) LIKE CONCAT('^', UPPER(?1), '%')")
//    List<Players> findAllByOrderByName(String name);


//    @Query("FROM Players p JOIN Stats s ON p.playerId = s.playerId")
//    List<Players> testSelectedQuery();


//    Players findPlayersByAllStar(int allStar);

    }

