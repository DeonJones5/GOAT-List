package org.example.GOAT_LIST.Entities;

import javax.persistence.*;

@Entity
@Table
public class Players {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int playerId;
    private String Name;
    private String HOF;
    private int Championships;
    private int AllStar;


    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String  isHOF() {
        return HOF;
    }

    public void setHOF(String HOF) {
        this.HOF = HOF;
    }

    public int getChampionships() {
        return Championships;
    }

    public void setChampionships(int championships) {
        Championships = championships;
    }

    public int getAllStar() {
        return AllStar;
    }

    public void setAllStar(int allStar) {
        AllStar = allStar;
    }






}
