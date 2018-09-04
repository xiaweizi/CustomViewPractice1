package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice4DrawPointView extends View {
    private Paint mPaint;
    private int mWidth;
    private int mHeight;
    public Practice4DrawPointView(Context context) {
        super(context);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    }

    public Practice4DrawPointView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        mWidth = MeasureSpec.getSize(widthMeasureSpec);
        mHeight = MeasureSpec.getSize(heightMeasureSpec);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawPoint() 方法画点
//        一个圆点，一个方点
//        圆点和方点的切换使用 paint.setStrokeCap(cap)：`ROUND` 是圆点，`BUTT` 或 `SQUARE` 是方点
        mPaint.setStrokeWidth(30);
        mPaint.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint(mWidth / 4, mHeight / 2, mPaint);
        mPaint.setStrokeCap(Paint.Cap.BUTT);
        canvas.drawPoint(mWidth / 2, mHeight / 2, mPaint);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(mWidth / 4 * 3, mHeight / 2, mPaint);

        canvas.drawLine(0, mHeight / 2, 80, mHeight / 2, mPaint);
    }
}
