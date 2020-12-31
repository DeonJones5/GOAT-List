package org.example.GOAT_LIST.Entities;

import javax.persistence.*;

@Entity
@Table
public class Players {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int playerId;
    private String name;
    private String HOF;
    private int championships;
    private int AllStar;


    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String  isHOF() {
        return HOF;
    }

    public void setHOF(String HOF) {
        this.HOF = HOF;
    }

    public int getChampionships() {
        return championships;
    }

    public void setChampionships(int championships) {
        this.championships = championships;
    }

    public int getAllStar() {
        return AllStar;
    }

    public void setAllStar(int allStar) {
        this.AllStar = allStar;
    }






}
