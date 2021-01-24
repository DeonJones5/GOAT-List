package org.example.GOAT_LIST.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Positions {

    @Id
    private Long PositionId;
    private String Position;

    public Long getPositionId() {
        return PositionId;
    }

    public void setPositionId(Long positionId) {
        PositionId = positionId;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }
}
