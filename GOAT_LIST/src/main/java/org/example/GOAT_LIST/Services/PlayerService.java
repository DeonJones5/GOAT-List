package org.example.GOAT_LIST.Services;

import org.example.GOAT_LIST.Entities.Players;
import org.example.GOAT_LIST.Repositories.PlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepo playerRepo;

    public Players readPlayer(int playerId){
        return playerRepo.findPlayersByPlayerId(playerId);
    }
}
