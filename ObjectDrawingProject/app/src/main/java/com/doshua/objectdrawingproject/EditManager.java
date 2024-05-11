package com.doshua.objectdrawingproject;

import android.content.Context;
import android.widget.FrameLayout;

public class EditManager {

    FrameLayout layout;
    Context context;
    static AtomBase focusAtom = null;

    EditManager(FrameLayout layout, Context context) {
        this.layout = layout;
        this.context = context;
    }

    public void createObject(String type) {


        switch(type) {

            case "원":
                Circle circle = new Circle(50, 50, 200, 200);
                CircleBase circleBase = new CircleBase(context, circle);
                layout.addView(circleBase);
                break;

            case "사각형":
                Rectangle rect = new Rectangle(0,0, 200, 200);
                RectangleBase rectBase = new RectangleBase(context, rect);

                layout.addView(rectBase);
        }
    }

    public void removeObject() {

        layout.removeView(focusAtom);
        focusAtom = null;
    }

    public void changeColor(int color) {

        focusAtom.setColor(color);

    }

}
