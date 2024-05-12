package com.doshua.objectdrawingproject;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class EditManager {

    FrameLayout layout;
    Context context;
    static AtomBase focusAtom = null;

    EditManager(FrameLayout layout, Context context) {
        this.layout = layout;
        this.context = context;
    }

    public AtomCore createObject(String type) {


        switch(type) {

            case "원":
                Circle circle = new Circle(50, 50, 200, 200);
                CircleBase circleBase = new CircleBase(context, circle);
                layout.addView(circleBase);
                return circle;

            case "사각형":
                Rectangle rect = new Rectangle(0,0, 200, 200);
                RectangleBase rectBase = new RectangleBase(context, rect);
                layout.addView(rectBase);
                return rect;
        }
        return null;
    }

    public void removeObject() {

        layout.removeView(focusAtom);
        focusAtom = null;
    }

    public void changeColor(int color) {

        focusAtom.atom.setColor(color);
        focusAtom.invalidate();

    }

    public void pasteAtom(float x, float y) {

        AtomCore atom = focusAtom.atom.clone();
        atom.left = (int) x;
        atom.top = (int) y;
        if(atom instanceof Circle) {
            CircleBase circleBase = new CircleBase(context, (Circle) atom);
            layout.addView(circleBase);
        }

        else if(atom instanceof Rectangle) {
            RectangleBase rectBase = new RectangleBase(context, (Rectangle) atom);
            layout.addView(rectBase);
        }
    }

    public void removeAll() {

        layout.removeAllViews();
    }

   // public void

}
