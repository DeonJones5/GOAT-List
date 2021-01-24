package org.example.GOAT_LIST.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teams {

    @Id
    private Long TeamID;
    private String Team_Name;

    public Long getTeamID() {
        return TeamID;
    }

    public void setTeamID(Long teamID) {
        TeamID = teamID;
    }

    public String getTeam_Name() {
        return Team_Name;
    }

    public void setTeam_Name(String team_Name) {
        Team_Name = team_Name;
    }
}
