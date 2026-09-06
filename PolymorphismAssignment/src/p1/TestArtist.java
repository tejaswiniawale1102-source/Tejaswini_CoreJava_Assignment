package p1;

class Artist {

    String name;
    int age;

    Artist() {
        System.out.println("In Artist Constructor");
        this.name = "Not Given";
        this.age = 0;
    }

    Artist(String name, int age) {
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

    void perform() {
        System.out.println("Artist is performing");
    }

    void Display() {
        System.out.println("Artist Name : " + this.name);
        System.out.println("Artist Age : " + this.age);
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

    Painter() {
        super();
        this.paintingStyle = "Not Given";
        this.mediumUsed = "Not Given";
        this.numberOfPaintings = 0;
    }

    Painter(String name, int age, String paintingStyle,
            String mediumUsed, int numberOfPaintings) {

        super(name, age);
        this.paintingStyle = paintingStyle;
        this.mediumUsed = mediumUsed;
        this.numberOfPaintings = numberOfPaintings;
    }

    String getPaintingStyle() {
        return this.paintingStyle;
    }

    void setPaintingStyle(String paintingStyle) {
        this.paintingStyle = paintingStyle;
    }

    String getMediumUsed() {
        return this.mediumUsed;
    }

    void setMediumUsed(String mediumUsed) {
        this.mediumUsed = mediumUsed;
    }

    int getNumberOfPaintings() {
        return this.numberOfPaintings;
    }

    void setNumberOfPaintings(int numberOfPaintings) {
        this.numberOfPaintings = numberOfPaintings;
    }

    @Override
    void perform() {
        System.out.println("Painter is painting");
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

    Musician() {
        super();
        this.instrument = "Not Given";
        this.musicGenre = "Not Given";
        this.numberOfAlbums = 0;
    }

    Musician(String name, int age, String instrument,
             String musicGenre, int numberOfAlbums) {

        super(name, age);
        this.instrument = instrument;
        this.musicGenre = musicGenre;
        this.numberOfAlbums = numberOfAlbums;
    }

    String getInstrument() {
        return this.instrument;
    }

    void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    String getMusicGenre() {
        return this.musicGenre;
    }

    void setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }

    int getNumberOfAlbums() {
        return this.numberOfAlbums;
    }

    void setNumberOfAlbums(int numberOfAlbums) {
        this.numberOfAlbums = numberOfAlbums;
    }

    @Override
    void perform() {
        System.out.println("Musician is playing music");
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

    Actor() {
        super();
        this.filmIndustry = "Not Given";
        this.numberOfMovies = 0;
    }

    Actor(String name, int age, String filmIndustry,
          int numberOfMovies) {

        super(name, age);
        this.filmIndustry = filmIndustry;
        this.numberOfMovies = numberOfMovies;
    }

    String getFilmIndustry() {
        return this.filmIndustry;
    }

    void setFilmIndustry(String filmIndustry) {
        this.filmIndustry = filmIndustry;
    }

    int getNumberOfMovies() {
        return this.numberOfMovies;
    }

    void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    @Override
    void perform() {
        System.out.println("Actor is acting");
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

        Artist a;

        a = new Painter(
                "Raj", 35, "Abstract", "Acrylic", 25);

        System.out.println(a);
        a.perform();

        System.out.println();

        a = new Musician(
                "Amit", 30, "Guitar", "Rock", 5);

        System.out.println(a);
        a.perform();

        System.out.println();

        a = new Actor(
                "Rohan", 40, "Bollywood", 20);

        System.out.println(a);
        a.perform();
    }
}