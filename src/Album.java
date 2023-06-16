import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String albumName ;
    private String artist ;
    List<Song> songs;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songs =  new ArrayList<>();
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public boolean addSong(String title , double duration){
        if(findSong(title)){
            System.out.println("song is already present in album");
            return false;
        } else {
            Song s = new Song(title, duration);
            songs.add(s);
            System.out.println("song is added now in your playlist");
            return true;
        }
    }
    public boolean findSong(String title){
   for(Song s : this.songs){
       if(s.getTitle().equals(title)){
           System.out.println("Song is present ");
           return true;
       }
   }
        System.out.println("song is not prsent in the album");
        return false;
    }
    public boolean addToPlaylistFromAlbum( String title, LinkedList<Song> myplaylist){
        if(findSong(title)){
            for(Song s : this.songs){
                if(s.getTitle().equals(title)){
                    System.out.println("congratulations ! song has been added to your playlist");
                    myplaylist.add(s);
                    return true;
                }
            }
        }
            System.out.println("Song is not prsent in your album");
            return false;

    }
    public boolean addToPlaylistFromAlbum(int idx , LinkedList<Song> myplaylist){
        idx = idx-1;
        if(idx>=0 && idx < this.songs.size()){
            myplaylist.add(this.songs.get(idx));
            System.out.println("congratulations ! song has been added to your playlist by idx");
            return true ;
        } else {
            System.out.println("You Entered invalid song number ");
            return false;
        }
    }
}
