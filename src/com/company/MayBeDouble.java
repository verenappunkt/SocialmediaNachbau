package com.company;

import java.net.PortUnreachableException;

public class MayBeDouble {
    private boolean showValue; // true => anzeigen,
    private double value; // nimmt einen Wert auf, der entsprechend showValue angezeigt wird;

    public MayBeDouble(double value, boolean showValue) {
        this.showValue = showValue;
        this.value = value;
    }

    public boolean isShowValue() {
        return showValue;
    }

    public double getValue() {
        return value;
    }

    public void setShowValue(boolean showValue) {
        this.showValue = showValue;
    }

    public void setValue(double value) {
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
