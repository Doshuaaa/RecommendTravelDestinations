package com.doshua.objectdrawingproject;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import androidx.annotation.NonNull;

public class RectangleBase extends AtomBase{

    Rectangle rect;
    public RectangleBase(@NonNull Context context, Rectangle rect) {
        super(context, rect);
        this.rect = rect;
    }

    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(rect.sizeX, rect.sizeY);
    }

    @Override
    protected void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawColor(rect.color);
    }
}
