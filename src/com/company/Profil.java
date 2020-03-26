package com.company;
// bei mir beim Setter kein return -> warum?
public class Profil {

   // Attribute:
   private String userName;
    private int alter;
    private MayBeDouble gewicht;
    private  Profil bestFriend;



  // Konstruktor mit einigen Attributen als Parameter
    public Profil(String userName, int alter, double gewicht) {
        this.userName = userName;
        this.alter = alter;
        this.gewicht = new MayBeDouble(gewicht, false);
    }

    // Setter
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

       public void setBestFriend(Profil bestFriend) {
        this.bestFriend = bestFriend;


    }
    public void setGewicht(double gewicht) {
        this.gewicht.setValue(gewicht);
    }


    // Getter
    // dann Objekte im
    public String getUserName() {
        return userName;
    }

    public int getAlter() {
        return alter;
    }

    public Profil getBestFriend() {
        return bestFriend;
    }

    public double getGewicht() {
        return gewicht.getValue();
    }


    // als String ausgeben -Methode
    // bei bestFriend nur den Usernamen ausgeben => .user
    @Override
    public String toString() {
        return "Profil{" +
                "userName='" + userName + '\'' +
                ", alter=" + alter +
                ", gewicht=" + gewicht.toString() +
                ", bestFriend=" + bestFriend.userName +
                '}';
    }
    public void setGewichtVisibilty(boolean showWheight) {
        gewicht.setShowValue(showWheight);
    }
}
