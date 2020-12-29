package org.example.GOAT_LIST.Controllers;

import org.example.GOAT_LIST.Entities.Players;
import org.example.GOAT_LIST.Services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("players/")
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @GetMapping("read/{playerId}")
    public ResponseEntity<Players> readById(@PathVariable int playerId){
        return new ResponseEntity<>(playerService.readPlayer(playerId), HttpStatus.OK);
    }

}
