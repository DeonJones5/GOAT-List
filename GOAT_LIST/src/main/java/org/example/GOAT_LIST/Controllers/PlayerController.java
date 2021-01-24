package org.example.GOAT_LIST.Controllers;

import org.example.GOAT_LIST.Entities.Players;
import org.example.GOAT_LIST.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("players/")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @GetMapping("read/{playerId}")
    public ResponseEntity<Players> readById(@PathVariable Long playerId){
        return new ResponseEntity<>(playerService.readPlayer(playerId), HttpStatus.OK);
    }

    @GetMapping("nameOfPlayer/{name}")
    public ResponseEntity<Players> nameOfPlayer(@PathVariable String name){
        return new ResponseEntity<>(playerService.readPlayerByName(name), HttpStatus.OK);
    }

    @GetMapping("playersByChampionships/{championships}")
    public ResponseEntity<List<Players>> playersByChampionships(@PathVariable int championships){
        return new ResponseEntity<>(playerService.findPlayersByChampionships(championships), HttpStatus.OK);
    }

    @PostMapping("addPlayer")
    public ResponseEntity<Players> addPlayer(@RequestBody Players players){
        return new ResponseEntity<>(playerService.addPlayer(players), HttpStatus.CREATED);
    }



    @GetMapping("getAllPlayers")
    public ResponseEntity<List<Players>> getAllPlayers(){
        return new ResponseEntity(playerService.getAllPlayers(), HttpStatus.OK);
    }

    @GetMapping("existByName/{name}")
    public ResponseEntity<Boolean> existByName(@PathVariable String name){
        return new ResponseEntity<>(playerService.playerExist(name), HttpStatus.OK);
    }

    @GetMapping("orderByChamps")
    public ResponseEntity<List<Players>> orderByChamps(){
        return new ResponseEntity<>(playerService.findAllByOrderByChampionships(), HttpStatus.OK);
    }

    @GetMapping("orderByName")
    public ResponseEntity<List<Players>> orderByName(){
        return new ResponseEntity<>(playerService.findAllByOrderOfName(), HttpStatus.OK);
    }

//    @GetMapping("joinWithStats")
//    public ResponseEntity<List<Players>> joinWithStats(){
//        return new ResponseEntity<List<Players>>(playerService.testSelectedQuery(), HttpStatus.OK);
//    }


//    @GetMapping("allStarAppearances/{allStar}")
//    public ResponseEntity<Players> allStarAppearances(@PathVariable int allStar){
//        return new ResponseEntity<>(playerService.readPlayersAllStarAppearances(allStar), HttpStatus.OK);
//    }

}
