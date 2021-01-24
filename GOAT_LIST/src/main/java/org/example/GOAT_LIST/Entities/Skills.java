package org.example.GOAT_LIST.Entities;

import javax.persistence.*;

@Entity
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skillsId;
    private String primarySkill;
    private String secondarySkill;

    private Long playerId;

    public Long getSkillsId() {
        return skillsId;
    }

    public void setSkillsId(Long skillsId) {
        this.skillsId = skillsId;
    }

    public String getPrimarySkill() {
        return primarySkill;
    }

    public void setPrimarySkill(String primarySkill) {
        this.primarySkill = primarySkill;
    }

    public String getSecondarySkill() {
        return secondarySkill;
    }

    public void setSecondarySkill(String secondarySkill) {
        this.secondarySkill = secondarySkill;
    }

    public Long getPlayer_Id() {
        return playerId;
    }

    public void setPlayer_Id(Long playerId) {
        this.playerId = playerId;
    }
}
