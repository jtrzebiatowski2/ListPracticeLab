package listpracticelab;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author J-Tron
 */
public class ListPracticeLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List <String> favoriteRockSongs = new ArrayList<String>();
        
        favoriteRockSongs.add("Deify");
        favoriteRockSongs.add("If I fall");
        favoriteRockSongs.add("Bloodwork");
        favoriteRockSongs.add("My Curse");
        favoriteRockSongs.add("Battle");
        favoriteRockSongs.add("Under and Over it");
        favoriteRockSongs.add("Diary of a Deadman");
        favoriteRockSongs.add("Remember Everything");
        
        int listLength = favoriteRockSongs.size();
        
        System.out.println("Favorite Rock Song List:");
        for(String s : favoriteRockSongs){
            System.out.println("Song Title: " + s);
        }
        
        System.out.println(favoriteRockSongs.get(5));
        System.out.println("# of items: " + listLength);
        
        favoriteRockSongs.clear();
        
        if(favoriteRockSongs.isEmpty()){
            System.out.println("The List has vanished");
        };
        
        favoriteRockSongs.add(0, "The End of a Heartache");
        for(String s : favoriteRockSongs){
            System.out.println("Song Title: " + s);
        }
        
        
    }
    
    
    
    
}
