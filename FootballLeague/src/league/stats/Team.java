package league.stats;

import java.util.Objects;

public class Team {
    private String name;
    private int numberPoints;

    public Team(String name) {
        this.name = name;
        this.numberPoints = 0;
    }

    public String getName() {
        return name;
    }

    public int getNumberPoints() {
        return numberPoints;
    }

    public void addPoints(int points) {
        numberPoints += points;
    }

    public void removePoints(int points) {
        numberPoints -= points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(name, team.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name + " (" + numberPoints + " points)";
    }

    public String toFileString() {
        return name + ";" + numberPoints;
    }
}
