package org.example.GOAT_LIST.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Players {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long playerId;
    private String name;
    private String HOF;
    private int championships;
    private int AllStar;

//    @JsonBackReference(value = "name1")
//    @OneToMany(mappedBy = "players", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private Set<Stats> stats;


    public Long getPlayerId() {
        return playerId;
    }

    public void setPlayerId(Long playerId) {
        this.playerId = playerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHOF() {
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
