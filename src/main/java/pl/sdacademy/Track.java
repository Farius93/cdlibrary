package pl.sdacademy;

public class Track {
    private String author;
    private int trackNumber;
    private int length;
    private String title;
    private String notes;


    public Track() {

    }

    public Track(String author, int trackNumber, int length, String title, String notes) {

        this.author = author;
        this.trackNumber = trackNumber;
        this.length = length;
        this.title = title;
        this.notes = notes;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

}
