package org.example.GOAT_LIST.Repositories;

import org.example.GOAT_LIST.Entities.Skills;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillsRepo extends CrudRepository<Skills, Long> {
    Skills findSkillsBySkillsId(Long skillsId);

    List<Skills> findSkillsByPrimarySkill(String primarySkill);

    List<Skills> findAll();
}
