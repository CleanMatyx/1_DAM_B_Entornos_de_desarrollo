package league.stats;

public class Match {
    private Team homeTeam;
    private Team visitorTeam;
    private int homeScore;
    private int visitorScore;

    public Match(Team homeTeam, Team visitorTeam, int homeScore, int visitorScore) {
        this.homeTeam = homeTeam;
        this.visitorTeam = visitorTeam;
        this.homeScore = homeScore;
        this.visitorScore = visitorScore;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getVisitorTeam() {
        return visitorTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getVisitorScore() {
        return visitorScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public void setVisitorScore(int visitorScore) {
        this.visitorScore = visitorScore;
    }

    @Override
    public String toString() {
        return homeTeam.getName() + " " + homeScore + " - " + visitorScore + " " + visitorTeam.getName();
    }
}
