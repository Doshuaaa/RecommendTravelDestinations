package com.doshua.objectdrawingproject;

import android.graphics.Color;
import android.graphics.Paint;

public class AtomCore {

    int centerX;
    int centerY;
    int sizeX;
    int sizeY;

    int left, top, right, bottom;

//    AtomCore(int centerX, int centerY) {
//
//        this.centerX = centerX;
//        this.centerY = centerY;
//    }
//
    AtomCore(int left, int top, int right, int bottom) {

        this.left = left;
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        sizeX = right - left;
        sizeY = bottom - top;
    }
    
}
