package com.timbuchalka;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by dev on 18/10/2015.
 */
public class League<L extends Team> {
    public String name;
    private ArrayList<L> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(L team) {
        if(league.contains(team)) {
            return false;
        }
        league.add(team);
        return true;
   }

//    public void showLeagueTable() {
//        Collections.sort(league);
//        for(T t : league) {
//            System.out.println(t.getName() + ": " + t.ranking());
//        }
//    }

    public void showLeagueTable() {
        Collections.sort(league);
        for (L l : league) {
            System.out.println(l.getName() + " " + l.ranking());
            //sort based on ranking
        }
    }
}
