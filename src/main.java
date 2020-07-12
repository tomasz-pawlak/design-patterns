import musicPlayer.MusicPlayer;
import musicPlayer.MusicPlayerRemote;
import musicPlayer.command.MusicPlayerPlayFirstTrack;

//dosc popularny, uzywany glownie do enkapsulacji, odizolowac dzialanie od strefy klienta. przykład to Runnable.
// Wada: każda w innej klasie metoda - bałagan w projekcie
public class main {
    public static void main(String[] args) {

        MusicPlayer musicPlayer = new MusicPlayer();
        MusicPlayerRemote musicPlayerRemote = new MusicPlayerRemote();

        musicPlayerRemote.setMusicPlayerCommand(new MusicPlayerPlayFirstTrack(musicPlayer));
        musicPlayerRemote.pressButton();

    }


}

