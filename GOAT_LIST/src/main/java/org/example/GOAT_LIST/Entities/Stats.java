package org.example.GOAT_LIST.Entities;

import javax.persistence.*;

@Entity
@Table
public class Stats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long StatsID;
    private double Points;
    private double Rebounds;
    private double Assist;
    private double Steals;
    private double Blocks;
    private Long playerId;
    private String name;

//    @ManyToOne
//    @JoinColumn(name = "playerId", nullable = false)
//    private Players players;



    public Long getStatsID() {
        return StatsID;
    }

    public void setStatsID(Long statsID) {
        StatsID = statsID;
    }

    public double getPoints() {
        return Points;
    }

    public void setPoints(double points) {
        Points = points;
    }

    public double getRebounds() {
        return Rebounds;
    }

    public void setRebounds(double rebounds) {
        Rebounds = rebounds;
    }

    public double getAssist() {
        return Assist;
    }

    public void setAssist(double assist) {
        Assist = assist;
    }

    public double getSteals() {
        return Steals;
    }

    public void setSteals(double steals) {
        Steals = steals;
    }

    public double getBlocks() {
        return Blocks;
    }

    public void setBlocks(double blocks) {
        Blocks = blocks;
    }

    public Long getPlayerID() {
        return playerId;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlayerID(Long playerID) {
        playerId = playerID;
    }
}
