package javaOne;

import java.util.ArrayList;
import java.util.Arrays;

class Playlist {
    //create a playlist for a desert island

    public static void main(String[] args) {

        //array list to hold string song values
        ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

        //add string songs to playlist list
        desertIslandPlaylist.add("Party For One");
        desertIslandPlaylist.add("Message in a Bottle");
        desertIslandPlaylist.add("Pretty Please");
        desertIslandPlaylist.add("Emotion");
        desertIslandPlaylist.add("The Very First Night");
        desertIslandPlaylist.add("Julien");

        //print out selection
        System.out.println(desertIslandPlaylist);

        //print number of songs
        System.out.println(desertIslandPlaylist.size());

        //remove one item from the list
        desertIslandPlaylist.remove("Pretty Please");

        //print out new number of songs
        System.out.println(desertIslandPlaylist.size());

        //swap index of two songs
            String placeholderOne = desertIslandPlaylist.get(1);
            String placeholderTwo = desertIslandPlaylist.get(3);

            desertIslandPlaylist.set(1, placeholderTwo);
            desertIslandPlaylist.set(3, placeholderOne);

        //print playlist to see new order of songs
        System.out.println(desertIslandPlaylist);


    }

}