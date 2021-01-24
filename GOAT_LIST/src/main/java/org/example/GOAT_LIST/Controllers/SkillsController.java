package org.example.GOAT_LIST.Controllers;

import org.example.GOAT_LIST.Entities.Skills;
import org.example.GOAT_LIST.Services.SkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("skills/")
public class SkillsController {
    @Autowired
    private SkillsService skillsService;

    @GetMapping("readSkills/{skillsId}")
    public ResponseEntity<Skills> readSkills(@PathVariable Long skillsId){
        return new ResponseEntity<>(skillsService.readSkills(skillsId), HttpStatus.OK);
    }

    @GetMapping("primarySkills/{primarySkill}")
    public ResponseEntity<List<Skills>> primarySkills(@PathVariable String primarySkill){
        return new ResponseEntity<>(skillsService.findAllByPrimarySkill(primarySkill), HttpStatus.OK);
    }

    @GetMapping("allSkills")
    public ResponseEntity<List<Skills>> allSkills(){
        return new ResponseEntity<>(skillsService.findAllSkills(), HttpStatus.OK);
    }
}
