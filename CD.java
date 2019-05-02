import java.util.Queue;

public class CD {

    private String cdName;
    private Queue<Song> queue;
    private String artist;

    public CD(String cdName, Queue<Song> queue){
        this.cdName = cdName;
        this.queue = queue;
    }
    public CD(String cdName){
        this.cdName = cdName;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }
    public String getArtist(){
        return this.artist;
    }

}
