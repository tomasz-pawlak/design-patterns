package musicPlayer.command;

import musicPlayer.MusicPlayer;

public class MusicPlayerPlayFirstTrack implements MusicPlayerCommand {
    private MusicPlayer musicPlayer;

    public MusicPlayerPlayFirstTrack(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void play() {
        musicPlayer.playFirstTrack();
    }
}
