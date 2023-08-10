public class Song {
    private String title, artist, album;

    public Song(){
        this.title = "";
        this.artist = "";
        this.album = "";
    }

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
        this.album = "";
    }

    public Song(String title, String artist, String album){
        this.title = title;
        this.artist = artist;
        this.album = album;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String format(){
        return "Title: " + title + "\nArtist: " + artist + "\nAlbum" + album;
    }

    public boolean emptyFields(){
        if(this.title.equals("")){
            return true;
        }
        if(this.artist.equals("")){
            return true;
        }
        if(this.album.equals("")){
            return true;
        }
        return false;
    }
}
