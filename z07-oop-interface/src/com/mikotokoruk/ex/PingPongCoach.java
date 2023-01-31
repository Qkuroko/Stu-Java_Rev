package com.mikotokoruk.ex;

public class PingPongCoach extends Coach implements SpeakEnglish{
    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teache() {
        System.out.println("乒乓球教练在叫乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练在说英语");
    }
}
