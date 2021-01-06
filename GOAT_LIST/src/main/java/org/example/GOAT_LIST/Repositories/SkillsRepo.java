package org.example.GOAT_LIST.Repositories;

import org.example.GOAT_LIST.Entities.Skills;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepo extends CrudRepository<Skills, Integer> {
    Skills findSkillsBySkillsId(int skillsId);
}
