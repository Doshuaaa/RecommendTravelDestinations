package com.doshua.objectdrawingproject;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class AtomBase extends FrameLayout{


    private int lastX;
    private int lastY;
    AtomCore atom;


    Paint paint;

    public AtomBase(@NonNull Context context, AtomCore atom) {
        super(context);
        this.atom = atom;
        paint = new Paint();
    }

    public AtomBase(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public AtomBase(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public AtomBase(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);

        int x = atom.left;
        int y = atom.top;

        if ((left != x || top != y) && getWidth() > 0) {
            layout(x, y, x + getWidth(), y + getHeight());
        }
//        for(int i = 0; i < getChildCount(); i++) {
//
//            AtomBase child = (AtomBase) getChildAt(i);
//            LayoutParams params = (LayoutParams) child.getLayoutParams();
//
//
//            child.setLayoutParams(params);
//        }
    }

    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                lastX = (int) event.getRawX();
                lastY = (int) event.getRawY();
                EditManager.focusAtom = this;
                showAdorner();
                break;

            case MotionEvent.ACTION_MOVE:
                int deltaX = (int)event.getRawX() - lastX;
                int deltaY = (int)event.getRawY() - lastY;
                int newX = getLeft() + deltaX;
                int newY = getTop() + deltaY;

                atom.left = newX;
                atom.top = newY;
                lastX = (int) event.getRawX();
                lastY = (int) event.getRawY();
                layout(newX, newY, newX +getWidth(), newY + getHeight());
                break;
        }

        return true;
    }

    public void showAdorner() {

    }
}
