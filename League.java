package com.company;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class League<L extends Team>  {

    private String leagueName;
    private List<L> leagueList;

    public League(String leagueName) {
        this.leagueName = leagueName;
        this.leagueList = new LinkedList<L>();
    }

    public void leagueRanking(){
        Collections.sort(leagueList);
        for(L teams: leagueList){
            System.out.println(teams.getName()+": "+teams.ranking());
        }
    }

    public String getLeagueName() {
        return leagueName;
    }

    public boolean addToLeague(L teamName){
        if( leagueList.contains(teamName)){
            System.out.println("Team "+teamName.getName()+" already signed to the league");
        return false;
        }else { leagueList.add(teamName);
            return true;
        }
    }













}
