class Artist {

    String name;
    int age;

    public Artist() {
        super();
        this.name = "NA";
        this.age = 0;
    }

    public Artist(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Artist [name=" + name + ", age=" + age + "]";
    }
}


// Artist Class Ends Here
class Painter extends Artist {

    String paintingStyle;
    String mediumUsed;
    int numberOfPaintings;

    public Painter() {
        super();
        this.paintingStyle = "Not Given";
        this.mediumUsed = "Not Given";
        this.numberOfPaintings = 0;
    }

    public Painter(String name, int age, String paintingStyle,
                   String mediumUsed, int numberOfPaintings) {

        super(name, age);
        this.paintingStyle = paintingStyle;
        this.mediumUsed = mediumUsed;
        this.numberOfPaintings = numberOfPaintings;
    }

    String getPaintingStyle() {
        return paintingStyle;
    }

    void setPaintingStyle(String paintingStyle) {
        this.paintingStyle = paintingStyle;
    }

    String getMediumUsed() {
        return mediumUsed;
    }

    void setMediumUsed(String mediumUsed) {
        this.mediumUsed = mediumUsed;
    }

    int getNumberOfPaintings() {
        return numberOfPaintings;
    }

    void setNumberOfPaintings(int numberOfPaintings) {
        this.numberOfPaintings = numberOfPaintings;
    }

    @Override
    public String toString() {
        return "Painter [paintingStyle=" + paintingStyle
                + ", mediumUsed=" + mediumUsed
                + ", numberOfPaintings=" + numberOfPaintings + "]";
    }
}


// Painter Class Ends Here
class Musician extends Artist {

    String instrument;
    String musicGenre;
    int numberOfAlbums;

    public Musician() {
        super();
        this.instrument = "Not Given";
        this.musicGenre = "Not Given";
        this.numberOfAlbums = 0;
    }

    public Musician(String name, int age, String instrument,
                    String musicGenre, int numberOfAlbums) {

        super(name, age);
        this.instrument = instrument;
        this.musicGenre = musicGenre;
        this.numberOfAlbums = numberOfAlbums;
    }

    String getInstrument() {
        return instrument;
    }

    void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    String getMusicGenre() {
        return musicGenre;
    }

    void setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }

    int getNumberOfAlbums() {
        return numberOfAlbums;
    }

    void setNumberOfAlbums(int numberOfAlbums) {
        this.numberOfAlbums = numberOfAlbums;
    }

    @Override
    public String toString() {
        return "Musician [instrument=" + instrument
                + ", musicGenre=" + musicGenre
                + ", numberOfAlbums=" + numberOfAlbums + "]";
    }
}


// Musician Class Ends Here


class Actor extends Artist {

    String filmIndustry;
    int numberOfMovies;

    public Actor() {
        super();
        this.filmIndustry = "Not Given";
        this.numberOfMovies = 0;
    }

    public Actor(String name, int age, String filmIndustry,
                 int numberOfMovies) {

        super(name, age);
        this.filmIndustry = filmIndustry;
        this.numberOfMovies = numberOfMovies;
    }

    String getFilmIndustry() {
        return filmIndustry;
    }

    void setFilmIndustry(String filmIndustry) {
        this.filmIndustry = filmIndustry;
    }

    int getNumberOfMovies() {
        return numberOfMovies;
    }

    void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    @Override
    public String toString() {
        return "Actor [filmIndustry=" + filmIndustry
                + ", numberOfMovies=" + numberOfMovies + "]";
    }
}


// Actor Class Ends Here
public class TestArtist {

    public static void main(String[] args) {

        Painter p = new Painter(
                "Raj", 35, "Abstract", "Acrylic", 25);

        Musician m = new Musician(
                "Amit", 30, "Guitar", "Rock", 5);

        Actor a = new Actor(
                "Rohan", 40, "Bollywood", 20);

        System.out.println(p);
        System.out.println(m);
        System.out.println(a);
    }
}