package league.main;
import league.io.LeagueIO;
import league.stats.Match;
import league.stats.Team;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Match> matches = getMatches();
        Map<String, Team> teamMap = createTeamMap(matches);
        List<Team> teams = new ArrayList<>(teamMap.values());

        LeagueIO.saveRanking(teams, "ranking.txt");
        System.out.println("Total number of different teams: " + teamMap.size());

        Set<String> teamsScoredFourOrMore = getTeamsScoredFourOrMore(teams, matches);
        System.out.println("Teams that have scored 4 goals or more in a match: " + teamsScoredFourOrMore);

        Set<String> teamsNotWon = getTeamsNotWon(teams);
        System.out.println("Teams that haven't won any match: " + teamsNotWon);

    }

    private static Set<String> getTeamsNotWon(List<Team> teams) {
        Set<String> teamsWithZeroPoints = new HashSet<>();
        for (Team team : teams) {
            if (team.getNumberPoints() == 0) {
                teamsWithZeroPoints.add(team.getName());
            }
        }
        System.out.println();
        return teamsWithZeroPoints;
    }

    private static Set<String> getTeamsScoredFourOrMore(List<Team> teams, List<Match> matches) {
        Set<String> teamsScoredFourOrMore = new HashSet<>();
        for (Team team : teams) {
            for (Match match : matches) {
                if ((match.getHomeTeam().equals(team) && match.getHomeScore() >= 4) ||
                        (match.getVisitorTeam().equals(team) && match.getVisitorScore() >= 4)) {
                    teamsScoredFourOrMore.add(team.getName());
                }
            }
        }
        return teamsScoredFourOrMore;
    }

    private static List<Match> getMatches() {
        List<Match> matches = LeagueIO.loadMatches("matches.txt");
        for (Match match : matches) {
            System.out.println(match);
        }
        System.out.println();
        return matches;
    }

    private static Map<String, Team> createTeamMap(List<Match> matches) {
        Map<String, Team> teamMap = new HashMap<>();
        for (Match match : matches) {
            updateTeamInMap(teamMap, match.getHomeTeam(), match.getHomeScore(), match.getVisitorScore());
            updateTeamInMap(teamMap, match.getVisitorTeam(), match.getVisitorScore(), match.getHomeScore());
        }
        return teamMap;
    }

    private static void updateTeamInMap(Map<String, Team> teamMap, Team team, int teamScore, int opponentScore) {
        Team existingTeam = teamMap.getOrDefault(team.getName(), new Team(team.getName()));
        if (teamScore > opponentScore) {
            existingTeam.addPoints(3);
        } else if (teamScore == opponentScore) {
            existingTeam.addPoints(1);
        }
        teamMap.put(existingTeam.getName(), existingTeam);
    }
}