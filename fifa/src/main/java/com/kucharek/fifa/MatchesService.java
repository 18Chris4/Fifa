package com.kucharek.fifa;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class MatchesService {
    @Autowired
    private MatchRepo mrepo;
    private List<Team> teams = new ArrayList<Team>();

    public List<Matches> getAllMatches(){
        return mrepo.findAll();
    }
    public List<Team> getAllTeams(){
        return teams;
    }
    private void playMatch(Team home, Team other, int goals, int oGoals){

    }

}
