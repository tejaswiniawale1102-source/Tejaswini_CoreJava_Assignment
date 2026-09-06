package p1;

class Player {

    String name;
    int age;

    Player() {
        System.out.println("In Player Constructor");
        this.name = "Not Given";
        this.age = 0;
    }

    Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return this.age;
    }

    void setAge(int age) {
        this.age = age;
    }

    void play() {
        System.out.println("Player is playing");
    }

    void Display() {
        System.out.println("Player Name : " + this.name);
        System.out.println("Player Age : " + this.age);
    }

    @Override
    public String toString() {
        return "Player [name=" + name + ", age=" + age + "]";
    }
}
// Player Class Ends Here
class CricketPlayer extends Player {

    String battingStyle;
    String bowlingStyle;
    int totalRuns;

    CricketPlayer() {
        super();
        this.battingStyle = "Not Given";
        this.bowlingStyle = "Not Given";
        this.totalRuns = 0;
    }

    CricketPlayer(String name, int age, String battingStyle,
                  String bowlingStyle, int totalRuns) {

        super(name, age);
        this.battingStyle = battingStyle;
        this.bowlingStyle = bowlingStyle;
        this.totalRuns = totalRuns;
    }

    String getBattingStyle() {
        return this.battingStyle;
    }

    void setBattingStyle(String battingStyle) {
        this.battingStyle = battingStyle;
    }

    String getBowlingStyle() {
        return this.bowlingStyle;
    }

    void setBowlingStyle(String bowlingStyle) {
        this.bowlingStyle = bowlingStyle;
    }

    int getTotalRuns() {
        return this.totalRuns;
    }

    void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    @Override
    void play() {
        System.out.println("Cricket Player is playing cricket");
    }

    @Override
    public String toString() {
        return "CricketPlayer [battingStyle=" + battingStyle
                + ", bowlingStyle=" + bowlingStyle
                + ", totalRuns=" + totalRuns + "]";
    }
}
// CricketPlayer Class Ends Here
class FootballPlayer extends Player {

    String position;
    String team;
    int totalGoals;

    FootballPlayer() {
        super();
        this.position = "Not Given";
        this.team = "Not Given";
        this.totalGoals = 0;
    }

    FootballPlayer(String name, int age, String position,
                   String team, int totalGoals) {

        super(name, age);
        this.position = position;
        this.team = team;
        this.totalGoals = totalGoals;
    }

    String getPosition() {
        return this.position;
    }

    void setPosition(String position) {
        this.position = position;
    }

    String getTeam() {
        return this.team;
    }

    void setTeam(String team) {
        this.team = team;
    }

    int getTotalGoals() {
        return this.totalGoals;
    }

    void setTotalGoals(int totalGoals) {
        this.totalGoals = totalGoals;
    }

    @Override
    void play() {
        System.out.println("Football Player is playing football");
    }

    @Override
    public String toString() {
        return "FootballPlayer [position=" + position
                + ", team=" + team
                + ", totalGoals=" + totalGoals + "]";
    }
}
// FootballPlayer Class Ends Here
public class TestPlayer {

    public static void main(String[] args) {

        Player p;

        p = new CricketPlayer(
                "Virat", 35, "Right Hand", "Right Arm", 12000);

        System.out.println(p);
        p.play();

        System.out.println();

        p = new FootballPlayer(
                "Ronaldo", 39, "Forward", "Portugal", 130);

        System.out.println(p);
        p.play();
    }
}