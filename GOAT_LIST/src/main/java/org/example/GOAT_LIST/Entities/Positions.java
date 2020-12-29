package org.example.GOAT_LIST.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Positions {

    @Id
    private int PositionId;
    private String Position;

    public int getPositionId() {
        return PositionId;
    }

    public void setPositionId(int positionId) {
        PositionId = positionId;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }
}
