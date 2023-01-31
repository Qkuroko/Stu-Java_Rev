package com.mikotokoruk.ex;

public class PingPongSporter extends Sporter implements SpeakEnglish{

    public PingPongSporter() {
    }

    public PingPongSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {

    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员在说英语");
    }
}
