package org.example.interfaces;

public class SmartPhone implements VideoPlayer,MusicPlayer{
    @Override
    public void playVideo() {
        System.out.println("O smarthPhone está exibindo o vídeo");
    }

    @Override
    public void pauseVideo() {
        System.out.println("O smarthPhone está pausado o vídeo");

    }

    @Override
    public void stopVideo() {
        System.out.println("O smarthPhone está fechando o vídeo");
    }

    @Override
    public void playMusic() {
        System.out.println("O smarthPhone está reproduzindo a música");
    }

    @Override
    public void pauseMusic() {
        System.out.println("O smarthPhone está pausando a música");

    }

    @Override
    public void stopMusic() {
        System.out.println("O smarthPhone está encerrando a música");
    }
}
