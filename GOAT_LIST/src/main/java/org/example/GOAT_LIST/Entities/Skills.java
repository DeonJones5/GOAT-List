package org.example.GOAT_LIST.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Skills {

    @Id
    private int skillsId;
    private String primary_Skill;
    private String secondary_Skill;
    private int playerId;

    public int getSkillsId() {
        return skillsId;
    }

    public void setSkillsId(int skillsId) {
        this.skillsId = skillsId;
    }

    public String getPrimary_Skill() {
        return primary_Skill;
    }

    public void setPrimary_Skill(String primary_Skill) {
        this.primary_Skill = primary_Skill;
    }

    public String getSecondary_Skill() {
        return secondary_Skill;
    }

    public void setSecondary_Skill(String secondary_Skill) {
        this.secondary_Skill = secondary_Skill;
    }

    public int getPlayer_Id() {
        return playerId;
    }

    public void setPlayer_Id(int playerId) {
        this.playerId = playerId;
    }
}
