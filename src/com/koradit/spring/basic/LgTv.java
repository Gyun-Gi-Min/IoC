package com.koradit.spring.basic;

public class LgTv {

    private AppleSpeaker speaker;

    public LgTv(){
        speaker = new AppleSpeaker();
        System.out.println("--------LgTv Created--------");
    }

    public void volumeUp(){
        speaker.speakUp();
        //소리크기 : ?
        System.out.printf("소리크기 : %d\n", speaker.getVolume());
    }

    public void volumeDown(){
        speaker.speakDown();
        //소리크기 : ?
        System.out.printf("소리크기 : %d\n", speaker.getVolume());
    }

}
