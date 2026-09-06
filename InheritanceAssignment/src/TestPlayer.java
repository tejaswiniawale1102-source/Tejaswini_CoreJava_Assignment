class Player
{
    String name;
    int age;
    String country;
    int matchesPlayed;
    int jerseyNumber;

    Player()
    {
        this.name = "Not Given";
        this.age = 0;
        this.country = "Not Given";
        this.matchesPlayed = 0;
        this.jerseyNumber = 0;
    }

    Player(String name, int age, String country,
           int matchesPlayed, int jerseyNumber)
    {
        this.name = name;
        this.age = age;
        this.country = country;
        this.matchesPlayed = matchesPlayed;
        this.jerseyNumber = jerseyNumber;
    }

    String getName()
    {
        return name;
    }

    void setName(String name)
    {
        this.name = name;
    }

    int getAge()
    {
        return age;
    }

    void setAge(int age)
    {
        this.age = age;
    }

    String getCountry()
    {
        return country;
    }

    void setCountry(String country)
    {
        this.country = country;
    }

    int getMatchesPlayed()
    {
        return matchesPlayed;
    }

    void setMatchesPlayed(int matchesPlayed)
    {
        this.matchesPlayed = matchesPlayed;
    }

    int getJerseyNumber()
    {
        return jerseyNumber;
    }

    void setJerseyNumber(int jerseyNumber)
    {
        this.jerseyNumber = jerseyNumber;
    }

    String playerType()
    {
        return "Player";
    }

    void display()
    {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
        System.out.println("Country : " + this.country);
        System.out.println("Matches Played : " + this.matchesPlayed);
        System.out.println("Jersey Number : " + this.jerseyNumber);
        System.out.println("Player Type : " + this.playerType());
    }
}


class CricketPlayer extends Player
{
    int totalRuns;
    int totalWickets;
    String battingStyle;
    String bowlingStyle;

    CricketPlayer()
    {
        super();

        this.totalRuns = 0;
        this.totalWickets = 0;
        this.battingStyle = "Not Given";
        this.bowlingStyle = "Not Given";
    }

    CricketPlayer(String name, int age, String country,
                  int matchesPlayed, int jerseyNumber,
                  int totalRuns, int totalWickets,
                  String battingStyle, String bowlingStyle)
    {
        super(name, age, country, matchesPlayed, jerseyNumber);

        this.totalRuns = totalRuns;
        this.totalWickets = totalWickets;
        this.battingStyle = battingStyle;
        this.bowlingStyle = bowlingStyle;
    }

    int getTotalRuns()
    {
        return totalRuns;
    }

    void setTotalRuns(int totalRuns)
    {
        this.totalRuns = totalRuns;
    }

    int getTotalWickets()
    {
        return totalWickets;
    }

    void setTotalWickets(int totalWickets)
    {
        this.totalWickets = totalWickets;
    }

    String getBattingStyle()
    {
        return battingStyle;
    }

    void setBattingStyle(String battingStyle)
    {
        this.battingStyle = battingStyle;
    }

    String getBowlingStyle()
    {
        return bowlingStyle;
    }

    void setBowlingStyle(String bowlingStyle)
    {
        this.bowlingStyle = bowlingStyle;
    }

    String playerType()
    {
        return "Cricket Player";
    }

    void display()
    {
        super.display();

        System.out.println("Total Runs : " + this.totalRuns);
        System.out.println("Total Wickets : " + this.totalWickets);
        System.out.println("Batting Style : " + this.battingStyle);
        System.out.println("Bowling Style : " + this.bowlingStyle);
    }
}


class FootballPlayer extends Player
{
    int totalGoals;
    String playingPosition;

    FootballPlayer()
    {
        super();

        this.totalGoals = 0;
        this.playingPosition = "Not Given";
    }

    FootballPlayer(String name, int age, String country,
                   int matchesPlayed, int jerseyNumber,
                   int totalGoals, String playingPosition)
    {
        super(name, age, country, matchesPlayed, jerseyNumber);

        this.totalGoals = totalGoals;
        this.playingPosition = playingPosition;
    }

    int getTotalGoals()
    {
        return totalGoals;
    }

    void setTotalGoals(int totalGoals)
    {
        this.totalGoals = totalGoals;
    }

    String getPlayingPosition()
    {
        return playingPosition;
    }

    void setPlayingPosition(String playingPosition)
    {
        this.playingPosition = playingPosition;
    }

    String playerType()
    {
        return "Football Player";
    }

    void display()
    {
        super.display();

        System.out.println("Total Goals : " + this.totalGoals);
        System.out.println("Playing Position : " + this.playingPosition);
    }
}


public class TestPlayer
{
    public static void main(String[] args)
    {
        Player[] arr;
        arr = new Player[2];

        arr[0] = new CricketPlayer("Rohit",30,"India",150,45,8000,50,"Right Hand","Right Arm Fast");

        arr[1] = new FootballPlayer("Sunil",29,"India",100,10,40,"Forward");

        for(int i = 0; i < arr.length; i++)
        {
            arr[i].display();
            System.out.println();
        }
    }
}