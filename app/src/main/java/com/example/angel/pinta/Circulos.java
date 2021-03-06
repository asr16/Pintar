package com.example.angel.pinta;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;



public class Circulos {
    private RectF rect;
    private Paint paint;

    public Circulos(int color,float grosor,Paint.Style estilo){
        rect = new RectF();
        paint = new Paint();
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(color);
        paint.setStyle(estilo);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeWidth(grosor);
    }

    public Paint getPaint(){
        return paint;
    }
    public RectF getRect(){
        return rect;
    }
}
