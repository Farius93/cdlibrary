package pl.sdacademy;

public enum Genre {
    AFRICAN_HEAVY_METAL("Afriacan heavy metal"),
    EXPERIMENTAL_MUSIC("Experimental Music"),
    ROCK("Rock"),
    POP("Pop"),
    CLASSIC("Classic"),
    DRUM_AND_BASS("Drum and Bass");

    private String name;

    Genre (String name){
        this.name = name;
    }
}
