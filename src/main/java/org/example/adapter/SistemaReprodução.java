package org.example.adapter;

public class SistemaReprodução {
    public static void main(String[] args) {

    AudioAdapter player = new AudioAdapter();

    player.reproduzir("wav", "Musica.wav");
    player.reproduzir("mp3", "Musica.mp3");

    }
}
