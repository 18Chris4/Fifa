package com.kucharek.fifa;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/matches")
public class MatchesControllers {

    @Autowired
    private MatchesService mservice;


    @GetMapping("/display")
    public List<Matches> getAllMatches(){
        return mservice.getAllMatches();    }


    @GetMapping("/all")
    public String getAllM(){
        return mservice.getAllMatches().toString();
    }





}
