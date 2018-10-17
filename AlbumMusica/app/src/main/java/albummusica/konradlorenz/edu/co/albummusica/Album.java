package albummusica.konradlorenz.edu.co.albummusica;

/**
 * Created by Lincoln on 18/05/16.
 */
public class Album {
    private String name;
    private int numOfSongs;
    private int thumbnail;
    private String description;

    public Album() {
    }

    public Album(String name, int numOfSongs, int thumbnail, String description) {
        this.name = name;
        this.numOfSongs = numOfSongs;
        this.thumbnail = thumbnail;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfSongs() {
        return numOfSongs;
    }

    public void setNumOfSongs(int numOfSongs) {
        this.numOfSongs = numOfSongs;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getDescription(){return description; }
    public void setDescription(String description){this.description = description;}
}
