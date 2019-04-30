public class Song {
    private String songName;
    private String songArtist;

    public Song(String songName, String songArtist){
        this.songName = songName;
        this.songArtist = songArtist;
    }
    public Song(String songName){
        this.songName = songName;
        this.songArtist = "Unknown";
    }
    public String getSongName(){
        return this.songName;
    }
    public void setSongName(String songName){
        this.songName = songName;
    }
    public String getSongArtist(){
        return this.songArtist;
    }
    public  void setSongArtist(String songArtist){
        this.songArtist = songArtist;
    }

}
