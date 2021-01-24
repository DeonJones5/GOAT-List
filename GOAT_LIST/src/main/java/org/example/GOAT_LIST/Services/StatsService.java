package org.example.GOAT_LIST.Services;

import org.example.GOAT_LIST.Entities.Stats;
import org.example.GOAT_LIST.Repositories.StatsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatsService {
    @Autowired
    private StatsRepo statsRepo;

    public Stats readStats(Long StatsID){
        return statsRepo.findStatsByPlayerId(StatsID);
    }

    public Stats readStatsByName(String name){
        return statsRepo.findStatsByName(name);
    }
}
