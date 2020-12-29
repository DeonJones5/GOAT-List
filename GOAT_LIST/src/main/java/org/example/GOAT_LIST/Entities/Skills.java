package org.example.GOAT_LIST.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Skills {

    @Id
    private int SkillsId;
    private String Primary_Skill;
    private String Secondary_Skill;
    private int playerId;

    public int getSkillsId() {
        return SkillsId;
    }

    public void setSkillsId(int skillsId) {
        SkillsId = skillsId;
    }

    public String getPrimary_Skill() {
        return Primary_Skill;
    }

    public void setPrimary_Skill(String primary_Skill) {
        Primary_Skill = primary_Skill;
    }

    public String getSecondary_Skill() {
        return Secondary_Skill;
    }

    public void setSecondary_Skill(String secondary_Skill) {
        Secondary_Skill = secondary_Skill;
    }

    public int getPlayer_Id() {
        return playerId;
    }

    public void setPlayer_Id(int playerId) {
        this.playerId = playerId;
    }
}
