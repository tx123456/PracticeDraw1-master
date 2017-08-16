package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {
    RectF rectF,rectRed;
    Paint paint,paintLine;

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        rectF = new RectF();
        rectRed = new RectF();
        paint = new Paint();
        paintLine = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);

        paintLine.setAntiAlias(true);
        paintLine.setColor(Color.WHITE);
        paintLine.setStrokeWidth(1);
        paintLine.setStyle(Paint.Style.STROKE);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        int widhtCenter = getWidth()/2;
        int heightCenter = getHeight()/2;
        int radios = heightCenter/2;

        rectF.set(widhtCenter-radios,heightCenter-radios,widhtCenter+radios,heightCenter+radios);
        rectRed.set(widhtCenter-radios-10,heightCenter-radios-10,widhtCenter+radios-10,heightCenter+radios-10);

        //蓝色
        paint.setColor(Color.parseColor("#1E80F0"));
        canvas.drawArc(rectF,75,105,true,paint);

        //绿色
        paint.setColor(Color.parseColor("#118575"));
        canvas.drawArc(rectF,20,53,true,paint);

        //灰色
        paint.setColor(Color.parseColor("#8c8c8c"));
        canvas.drawArc(rectF,10,8,true,paint);

        //紫色
        paint.setColor(Color.parseColor("#830A9B"));
        canvas.drawArc(rectF,0,8,true,paint);

        //黄色
        paint.setColor(Color.parseColor("#FDB60D"));
        canvas.drawArc(rectF,300,55,true,paint);

        //背景色
        paint.setColor(Color.parseColor("#506E7A"));
        canvas.drawArc(rectF,355,5,true,paint);

        //红色
        paint.setColor(Color.parseColor("#EE2B29"));
        canvas.drawArc(rectRed,180,120,true,paint);

        Path path = new Path();
        path.moveTo(widhtCenter-0.66f*radios,heightCenter+0.66f*radios);
        path.lineTo(widhtCenter - 0.8f * radios, heightCenter + 0.8f * radios);
        path.lineTo(widhtCenter - 0.8f * radios - 60, heightCenter + 0.8f * radios);
        canvas.drawPath(path,paintLine);
        canvas.drawText("KitKat", widhtCenter - 0.8f * radios - 130, heightCenter + 0.8f * radios+5
                , paintLine);
    }
}
