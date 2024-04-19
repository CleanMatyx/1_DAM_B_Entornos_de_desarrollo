package league.io;

import league.stats.Match;
import league.stats.Team;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeagueIO {
    public static List<Match> loadMatches(String filename) {
        List<Match> matches = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("#");
                String homeTeamName = parts[0];
                int homeScore = Integer.parseInt(parts[1]);
                String visitorTeamName = parts[2];
                int visitorScore = Integer.parseInt(parts[3]);
                Team homeTeam = new Team(homeTeamName);
                Team visitorTeam = new Team(visitorTeamName);
                Match match = new Match(homeTeam, visitorTeam, homeScore, visitorScore);
                matches.add(match);
            }
        } catch (IOException e) {
            return new ArrayList<>();
        }
        return matches;
    }

    public static void saveRanking(List<Team> teams, String filename) {
        teams.sort((team1, team2) -> Integer.compare(team2.getNumberPoints(), team1.getNumberPoints()));
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (Team team : teams) {
                writer.println(team.toFileString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}