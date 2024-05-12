package com.doshua.objectdrawingproject;

import android.graphics.Color;
import android.graphics.Paint;

import androidx.annotation.NonNull;

public class AtomCore implements Cloneable {

    int sizeX;
    int sizeY;
    int color = Color.BLACK;
    String type = "";

    int left, top, right, bottom;

    AtomCore(int left, int top, int right, int bottom, String type) {

        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.type = type;
        sizeX = right - left;
        sizeY = bottom - top;
    }

    public void setColor(int color) {
        this.color = color;
    }

    @NonNull
    @Override
    public AtomCore clone() {
        try {
            return (AtomCore) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
