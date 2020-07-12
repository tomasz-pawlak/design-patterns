package musicPlayer.command;

import musicPlayer.MusicPlayer;

public class MusicPlayerPlayNextTrack implements MusicPlayerCommand {
    MusicPlayer musicPlayer;

    public MusicPlayerPlayNextTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playNextTrack();
    }
}
