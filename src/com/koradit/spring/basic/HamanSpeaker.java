package com.koradit.spring.basic;

public class HamanSpeaker {
    private int volume;
    private final int maxVolume;


    public  HamanSpeaker(){
        System.out.println("--------HamanSpeaker Created--------");
        maxVolume = 50;
    }

    public void speakUp(){ //Volume 1올리면 되는데 maxVolume 보다 커지면 안된다.

        if(volume < maxVolume){
            volume++;
        }
    }

    public void speakDown(){ //volume 1내리기 0보다 작아지면 안됨.
        if(0<volume){
            volume--;
        }
    }

    public int getVolume() { //volume getter
        return volume;
    }



}
