import java.util.Queue;

public class Playlist {

    private String playlistName;
    private Queue<Song> queue;

    public Playlist(String playlistName,Queue<Song> queue){
        this.playlistName = playlistName;
        this.queue = queue;
    }
    public Playlist(String playlistName){
        this.playlistName = playlistName;
    }
    public Song getNextTrackToPlay(){
        return queue.peek();
    }
    public int numOfSongsInPlaylist(){
        return queue.size();
    }
    public void setPlaylistName(String name){
        this.playlistName = name;
    }
    public String getPlaylistName(){
        return this.playlistName;
    }
    public void addSongToPlaylist(Song song){
        queue.add(song);
    }
}
