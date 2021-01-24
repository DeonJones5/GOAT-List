package org.example.GOAT_LIST.Services;

import org.example.GOAT_LIST.Entities.Skills;
import org.example.GOAT_LIST.Repositories.SkillsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillsService {
    @Autowired
    private SkillsRepo skillsRepo;

    public Skills readSkills(Long skillsId){
        return skillsRepo.findSkillsBySkillsId(skillsId);
    }

    public List<Skills> findAllByPrimarySkill(String primarySkill){ return skillsRepo.findSkillsByPrimarySkill(primarySkill);}

    public List<Skills> findAllSkills(){ return skillsRepo.findAll();}
}
