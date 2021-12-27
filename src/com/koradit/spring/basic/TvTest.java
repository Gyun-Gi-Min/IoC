package com.koradit.spring.basic;

public class TvTest {
    public static void main(String[] args) {
        LgTv lgTv = new LgTv();
        SamsungTv samsungTv = new SamsungTv();


        for(int i=0; i<50; i++){
            lgTv.volumeUp();
        }

        System.out.println("------------------------------");

        for(int i=0; i<50; i++){
            lgTv.volumeDown();
        }

        System.out.println("------여기까지 LgTv-------");

        for(int i=0; i<50; i++){
            samsungTv.volumeUp();
        }

        System.out.println("------------------------------");

        for(int i=0; i<50; i++){
            samsungTv.volumeDown();
        }

        System.out.println("------여기까지 SamsungTv-------");


    }
}
