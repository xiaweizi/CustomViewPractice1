package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    private Paint mPaint;
    private RectF rectF;

    public Practice8DrawArcView(Context context) {
        super(context);
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        rectF = new RectF();
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形
        rectF.set(100, 100, 400, 300);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(6);

        canvas.drawArc(rectF, -90, 80, true, mPaint);
        mPaint.setColor(Color.RED);
        canvas.drawArc(rectF, 0, 80, false, mPaint);
        mPaint.setColor(Color.YELLOW);
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawArc(rectF, 90, 80, true, mPaint);
        mPaint.setColor(Color.BLUE);
        canvas.drawArc(rectF, 180, 80, false, mPaint);
    }
}
