package com.example.ringlibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;


public class CircleView extends View
{
    private float centerX,centerY,radius;

    private Paint paint = new Paint();


    public CircleView(Context context) {
        super(context);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs) {

        super(context, attrs);

        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.CircleView,0,0);

        try {
            centerX = a.getFloat(R.styleable.CircleView_centerX,0);
            centerY = a.getFloat(R.styleable.CircleView_centerY,0);
            radius = a.getFloat(R.styleable.CircleView_radius,0);
        }finally
        {
            a.recycle();
        }

    }



    public CircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /*public void setCircleProperties(float cX , float cY , float radius)
    {
        this.centerX = cX;

        this.centerY = cY;

        this.radius = radius;
    }*/

    /*public void draw()
    {
        invalidate();

        requestLayout();
    }*/


    @Override
    protected void onDraw(Canvas canvas)
    {
        paint.setStrokeWidth(25);

        paint.setStyle(Paint.Style.STROKE);

        paint.setColor(Color.GREEN);

        canvas.drawCircle(centerX,centerY,radius,paint);

        super.onDraw(canvas);
    }
}
