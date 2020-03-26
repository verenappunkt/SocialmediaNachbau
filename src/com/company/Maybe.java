package com.company;

public class Maybe<Platzhalter> {
    private boolean showValue; // true => anzeigen,
    private Platzhalter value; // nimmt einen Wert auf, der entsprechend showValue angezeigt wird;

    public Maybe(Platzhalter value, boolean showValue) {
        this.showValue = showValue;
        this.value = value;
    }

    public boolean isShowValue() {
        return showValue;
    }

    public Platzhalter getValue() {
        return value;
    }

    public void setShowValue(boolean showValue) {
        this.showValue = showValue;
    }

    public void setValue(Platzhalter value) {
        this.value = value;
    }
    public String toString() {
        if (showValue) {
            return "sichtbar: " + value;
        }
        else {
            return "verborgen";
        }
    }
}
