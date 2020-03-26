package com.company;

public class Main {

    public static void main(String[] args) {
	Profil susi = new Profil("susanne",38, 63.7);
	Profil max = new Profil("maxi", 42, 89.4);
	Profil john = new Profil("johnny",38,79.5);

        susi.setBestFriend(max);
        max.setBestFriend(susi);
        john.setBestFriend(susi);

        // soutv
        // hinten nochmal.toString;

        System.out.println("susi.toString() = " + susi.toString());
        System.out.println("john.toString() = " + john.toString());
        System.out.println("john.toString() = " + john.toString());

        susi.setGewichtVisibilty(true);
        System.out.println("susi.toString() = " + susi.toString());

        susi.setGewichtVisibilty(false);
        System.out.println("susi.toString() = " + susi.toString());
    }
}
