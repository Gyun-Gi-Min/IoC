package com.koradit.spring.basic;

public class SamsungTv {
    private HamanSpeaker speaker;

    public SamsungTv(){
        speaker = new HamanSpeaker();
        System.out.println("--------SamsungTv Created--------");
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
