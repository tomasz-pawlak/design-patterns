package musicPlayer;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;

public class MusicPlayer {
    private List<String> tracks = Arrays.asList("Track1", "Track2", "Track3");
    private int currentTrackNumber = 0;

    public void playFirstTrack(){
        System.out.println("Gram utwór pierwszy "+tracks.get(0));
    }

    public void playNextTrack(){
        currentTrackNumber++;
        if (currentTrackNumber>2){
            currentTrackNumber=0;
        }
        System.out.println("Gram utwór następny: " + tracks.get(currentTrackNumber));
    }

    public void playRandomTrack(){
        int randomTrack = (int) (Math.random()*3);
        System.out.println("Gram losowy utwór: "+tracks.get(randomTrack));
    }
}
