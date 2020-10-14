package com.example.myapplication;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;

import static android.graphics.Color.RED;

public class Myview extends View {
    public Myview(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        //super.onDraw(canvas);
        Paint p = new Paint();
        p.setColor(RED);
        p.setStrokeWidth(15);
        p.setStyle(Paint.Style.FILL);
        RectF rectf = new RectF();
        rectf.set(200, 200, 500, 500);
        int a;
        a = canvas.getHeight();
        int b = canvas.getWidth();
        canvas.drawArc(rectf,90,270,true, p);
    }
}
