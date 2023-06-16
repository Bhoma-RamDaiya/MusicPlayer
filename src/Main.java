import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
      Album album = new Album("veena music" , "Seema Mishra");
      album.addSong("kesariya balam" , 10.2);
      album.addSong("peepli" , 15.5);
      album.addSong("peepli" , 15.5);
      album.findSong("peepli");
        album.findSong("jai siya ram");
        Album album1 = new Album("nach Baliye" , "Sonu nigam");
        album1.addSong("sandeshe aate " , 5.2);
        album1.addSong("hanuman Chalisha " , 15.5);
        album1.addSong("kuch is trah" , 3.5);
        album1.addSong("Teri or teri or" , 4.5);

        album1.findSong("kuch is trah");
        album1.addSong("jai siya ram" , 5.6);
//        playlist functionality adding from here
        LinkedList<Song> playlist = new LinkedList<>();
        album1.addToPlaylistFromAlbum("sandeshe aate " ,playlist );
        album1.addToPlaylistFromAlbum(2 ,playlist );
        album1.addToPlaylistFromAlbum(3 ,playlist );

// play song using playlist
        play(playlist);


    }
    public static void printAllSong(LinkedList<Song>playlist){
        for(Song s : playlist){
            System.out.println(s);
        }
    }
    public static  void  printMenu(){
        System.out.println("1: play next Song");
        System.out.println("2: play previous Song");
        System.out.println("3: repeat  the current  song ");
        System.out.println("4: show all  Song of playlist");
        System.out.println("5: Delete the  Song");
        System.out.println("6: printMenu() again");
        System.out.println("7: Exit");

    }
    public static void play(LinkedList<Song>playList){
        ListIterator<Song> itr = playList.listIterator();
//        if(!itr.hasNext()){
//            System.out.println("you reach the end of the playlist");
//            return ;
//        } else {
//            System.out.println("now playing");
//            System.out.println(itr.next());
//        }
//        if(!itr.hasPrevious()){
//            System.out.println("You reach the start end of the playlist");
//        } else {
//            System.out.println("now playing");
//            System.out.println(itr.previous());
//        }
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter the number");
            int option = sc.nextInt();
            switch(option){
                case 1 :
                    if(itr.hasNext()){
                        System.out.println("now playing");
                        System.out.println(itr.next());
                    } else {
                        System.out.println("you  reached the end of the playlist");
                    }
                    break;
                case 2 :
                    if(itr.hasPrevious()){
                        System.out.println("now playing");
                        System.out.println(itr.previous());
                    } else {
                        System.out.println("you  reached the end of the playlist");
                    }
                    break;
                case 3 :
                    break;
                case 4 :
                    printAllSong(playList);
                    break;
                case 5 :
                    break;
                case 6 :
                    printMenu();
                    break;
                case 7 :
                    exit(0);


            }
        }
    }
}