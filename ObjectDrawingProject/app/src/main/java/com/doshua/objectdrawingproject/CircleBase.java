package com.doshua.objectdrawingproject;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CircleBase extends AtomBase {

    Circle circle;

    public CircleBase(@NonNull Context context, Circle circle) {
        super(context, (AtomCore) circle);
        this.circle = circle;
    }

    public CircleBase(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleBase(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CircleBase(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setX(circle.left);
        setY(circle.top);
       setMeasuredDimension(circle.sizeX, circle.sizeY);
    }

    @Override
    protected void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
        canvas.drawColor(Color.BLACK);;
        paint.setColor(color);
        canvas.drawOval(circle.left, circle.top, circle.right, circle.bottom, paint);
       //canvas.drawCircle((float) circle.centerX / 2, (float)circle.centerY / 2, (float) circle.radius, paint);
    }
}
