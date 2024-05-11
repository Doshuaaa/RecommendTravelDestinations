package com.doshua.objectdrawingproject;

public class Circle extends AtomCore {

    int centerX;
    int centerY;


    Circle(int left, int top, int right, int bottom) {
        super(left, top, right, bottom);
        initCircle();
    }

    private void initCircle() {

        centerX = (right - left) / 2;
        centerY  = (bottom - top) / 2;
    }
}
