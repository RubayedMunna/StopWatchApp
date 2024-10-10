package com.example.europeanclubfootball;

import java.util.ArrayList;
import java.util.List;

public class ClubLegacy {

    List<String> getClub(String country) {
        List<String> Club = new ArrayList<>();
        if (country.equals("La-Liga")) {
            Club.add("Barcelona");
            Club.add("Real-Madrid");
            Club.add("Atlético de Madrid");
            Club.add("Girona FC");
        }
        else if (country.equals("English Premier League")) {
            Club.add("Liverpool");
            Club.add("Man-City");
            Club.add("Man-Utd");
            Club.add("Chelsea");
        }

        else if (country.equals("Bundesliga")) {
            Club.add("Bayern Munich");
            Club.add("Borussia Dortmund");
            Club.add("Bayer 04 Leverkusen");
            Club.add("Wolfsburg");
        }

        else {
            Club.add("Juventus F.C.");
            Club.add("AC Milan");
            Club.add("Inter Milan");
            Club.add("AS Roma");
        }


        return Club;
    }
}

