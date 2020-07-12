package musicPlayer.command;

import musicPlayer.MusicPlayer;

public class MusicPlayerPlayRandomTrack implements MusicPlayerCommand {
    MusicPlayer musicPlayer;

    public MusicPlayerPlayRandomTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playRandomTrack();
    }
}
