package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {
    Paint paint;
    RectF rectF;

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        rectF = new RectF();

    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);

        rectF.set(200,100,500,300);
        canvas.drawArc(rectF,-110,100,true,paint);

        canvas.drawArc(rectF,20,140,false,paint);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(rectF,180,60,false,paint);



    }
}
