package org.example.GOAT_LIST.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stats {

    @Id
    private int StatsID;
    private double Points;
    private double Rebounds;
    private double Assist;
    private double Steals;
    private double Blocks;
    private int PlayerID;

    public int getStatsID() {
        return StatsID;
    }

    public void setStatsID(int statsID) {
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

    public int getPlayerID() {
        return PlayerID;
    }

    public void setPlayerID(int playerID) {
        PlayerID = playerID;
    }
}
