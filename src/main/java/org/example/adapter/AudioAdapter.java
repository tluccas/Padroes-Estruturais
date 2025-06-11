package org.example.adapter;

public class AudioAdapter implements AudioPlayer{

    private Mp3Player mp3Player;
    private WavPlayerLib wavPlayer;

    public AudioAdapter() {
        this.mp3Player = new Mp3Player();
        this.wavPlayer = new WavPlayerLib();
    }

    @Override
    public void reproduzir(String tipoArquivo, String nomeArquivo) {
        if (tipoArquivo.equalsIgnoreCase("mp3")) {
            mp3Player.playMp3(nomeArquivo);
        } else if (tipoArquivo.equalsIgnoreCase("wav")) {
            wavPlayer.playWavArquivo(nomeArquivo);
        } else {
            System.out.println("Formato não suportado.");
        }
    }
}

