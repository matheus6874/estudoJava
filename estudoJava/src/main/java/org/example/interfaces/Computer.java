package org.example.interfaces;

public class Computer implements VideoPlayer,MusicPlayer{
    @Override
    public void playVideo() {
        System.out.println("O computer está exibindo o vídeo");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O computer está pausado o vídeo");

    }

    @Override
    public void stopVideo() {
        System.out.println("O computer está fechando o vídeo");
    }

    @Override
    public void playMusic() {
        System.out.println("O computer está reproduzindo a música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O computer está pausando a música");

    }

    @Override
    public void stopMusic() {
        System.out.println("O computer está encerrando a música");
    }
}
