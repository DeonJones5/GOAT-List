package org.example.GOAT_LIST.Services;

import org.example.GOAT_LIST.Entities.Players;
import org.example.GOAT_LIST.Repositories.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepo playerRepo;

    public Players readPlayer(Long playerId) {

        return playerRepo.findPlayersByPlayerId(playerId);
    }

    public Players readPlayerByName(String name) {
        return playerRepo.findPlayersByName(name);
    }

    public List<Players> findPlayersByChampionships(int championships) {
        return playerRepo.findAllByChampionships(championships);
    }

    public Players addPlayer(Players players){
        return playerRepo.save(players);
    }


    public List<Players> getAllPlayers(){
        return playerRepo.findAll();
    }

    public Boolean playerExist(String name){ return playerRepo.existsByName(name);}

    public List<Players> findAllByOrderByChampionships(){
        return playerRepo.findAllByOrderByChampionships();
    }

//    public List<Players> testSelectedQuery(){
//        return playerRepo.testSelectedQuery();
//    }

}



//    public Players readPlayersAllStarAppearances(int allStar){
//        return playerRepo.findPlayersByAllStar(allStar);
//    }

