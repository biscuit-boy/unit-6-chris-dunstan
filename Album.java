public class Album implements Comparable {
    private String title;
    private String author;
    private double runTime;
    private double tracks;

    public Album(String title, String author, double runTime, double tracks) {
        this.title = title;
        this.author = author;
        this.runTime = runTime;
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "" + title + ", by " + author + "  ||  " + tracks + " Tracks  ||  Runtime: " + runTime;
    }

    public int compareTo(Object other){
        Album otherAlbum = (Album) other;
        return this.title.toUpperCase().compareTo(otherAlbum.getTitle().toUpperCase());
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getRunTime() {
        return runTime;
    }

    public void setRunTime(double runTime) {
        this.runTime = runTime;
    }

    public double getTracks() {
        return tracks;
    }

    public void setTracks(int tracks) {
        this.tracks = tracks;
    }


}
