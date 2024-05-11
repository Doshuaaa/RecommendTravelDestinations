package com.doshua.objectdrawingproject;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class CustomView extends FrameLayout {

    private ArrayList<AtomCore> atomList = new ArrayList<>();
    private AtomCore focusAtom = null;

    public CustomView(Context context) {
        super(context);
    }

    public CustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
//        int a = 3;
//        for(int i = 0; i < getChildCount(); i++) {
//            getChildAt(i).layout(100, 100, 300, 300);
//        }
    }

    @Override
    protected void dispatchDraw(@NonNull Canvas canvas) {

        //canvas.drawColor(Color.RED);
//        for(int i = 0; i < atomList.size(); i++) {
//
//            if(atomList.get(i) instanceof Circle) {
//                Circle circle = (Circle)atomList.get(i);
//                canvas.drawCircle(circle.centerX, circle.centerY, circle.radius, circle.paint);
//            }
//
//            else if(atomList.get(i) instanceof Rectangle) {
//
//                Rectangle rect = (Rectangle) atomList.get(i);
//                canvas.drawRect(rect.centerX - rect.halfWidth, rect.centerY - rect.halfHeight, rect.centerX + rect.halfWidth, rect.centerY + rect.halfHeight, rect.paint);
//            }
//
//            else if(atomList.get(i) instanceof Line) {
//
//                Line line = (Line) atomList.get(i);
//                canvas.drawLine(line.startX, line.centerY, line.endX, line.endY, line.paint);
//            }
//        }
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.RED);
    }
}
