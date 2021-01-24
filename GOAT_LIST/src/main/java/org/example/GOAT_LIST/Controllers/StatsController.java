package org.example.GOAT_LIST.Controllers;

import org.example.GOAT_LIST.Entities.Stats;
import org.example.GOAT_LIST.Services.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stats")
public class StatsController {
    @Autowired
    private StatsService statsService;

    @GetMapping("readStats/{StatsID}")
    public ResponseEntity<Stats> readStats(@PathVariable Long StatsID){
        return new ResponseEntity<>(statsService.readStats(StatsID), HttpStatus.OK);
    }

    @GetMapping("readStatsByName/{name}")
    public ResponseEntity<Stats> readStatsByName(@PathVariable String name){
        return new ResponseEntity<>(statsService.readStatsByName(name), HttpStatus.OK);
    }
}
