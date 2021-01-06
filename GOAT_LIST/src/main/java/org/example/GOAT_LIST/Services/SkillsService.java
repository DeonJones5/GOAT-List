package org.example.GOAT_LIST.Services;

import org.example.GOAT_LIST.Entities.Skills;
import org.example.GOAT_LIST.Repositories.SkillsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillsService {
    @Autowired
    private SkillsRepo skillsRepo;

    public Skills readSkills(int skillsId){
        return skillsRepo.findSkillsBySkillsId(skillsId);
    }
}
