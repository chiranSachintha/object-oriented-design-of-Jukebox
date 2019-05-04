public class CDPlayer {

    private Playlist playlist;
    private CD cd;

    public CDPlayer(Playlist playlist, CD cd){
        this.playlist = playlist;
        this.cd = cd;
    }
    public CDPlayer(Playlist playlist){
        this.playlist = playlist;
    }
    public CDPlayer(CD cd){
        this.cd = cd;
    }

    public void setPlaylist(Playlist playlist) {
        this.playlist = playlist;
    }

    public Playlist getPlaylist() {
        return playlist;
    }

    public void setCd(CD cd) {
        this.cd = cd;
    }

    public CD getCd() {
        return cd;
    }

}
