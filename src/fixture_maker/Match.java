package fixture_maker;

public class Match {
    String  homeTeam;
    String  awayTeam;

    public Match(String homeTeam, String awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public String getHomeTeam() {
        return homeTeam;
    }
    public String getAwayTeam() {
        return awayTeam;
    }

}
