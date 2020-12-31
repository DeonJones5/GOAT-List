package org.example.GOAT_LIST.Services;

import org.example.GOAT_LIST.Entities.Players;
import org.example.GOAT_LIST.Repositories.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepo playerRepo;

    public Players readPlayer(int playerId){

        return playerRepo.findPlayersByPlayerId(playerId);
    }

    public Players readPlayerByName(String name){
        return playerRepo.findPlayersByName(name);
    }

    public List<Players> findPlayersByChampionships(int championships){
        return playerRepo.findAllByChampionships(championships);
    }

//    public Players readPlayersAllStarAppearances(int allStar){
//        return playerRepo.findPlayersByAllStar(allStar);
//    }
}
