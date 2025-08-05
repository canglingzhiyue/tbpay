package com.taobao.browser.jsbridge.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.media.ExifInterface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.ali.user.mobile.app.constant.UTConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;
import tb.kge;

/* loaded from: classes6.dex */
public class LetterListView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String[] b;
    public int choose;
    public OnTouchingLetterChangedListener onTouchingLetterChangedListener;
    public Paint paint;
    public boolean showBkg;

    /* loaded from: classes6.dex */
    public interface OnTouchingLetterChangedListener {
        void onTouchingLetterChanged(String str);
    }

    static {
        kge.a(-1572137567);
    }

    public static /* synthetic */ Object ipc$super(LetterListView letterListView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != -1447998406) {
            if (hashCode != -1117127205) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
    }

    public LetterListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new String[]{"A", "B", "C", TLogTracker.LEVEL_DEBUG, "E", UTConstant.Args.UT_SUCCESS_F, "G", "H", TLogTracker.LEVEL_INFO, "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, "T", "U", "V", "W", "X", "Y", "Z"};
        this.choose = -1;
        this.paint = new Paint();
        this.showBkg = false;
    }

    public LetterListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new String[]{"A", "B", "C", TLogTracker.LEVEL_DEBUG, "E", UTConstant.Args.UT_SUCCESS_F, "G", "H", TLogTracker.LEVEL_INFO, "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, "T", "U", "V", "W", "X", "Y", "Z"};
        this.choose = -1;
        this.paint = new Paint();
        this.showBkg = false;
    }

    public LetterListView(Context context) {
        super(context);
        this.b = new String[]{"A", "B", "C", TLogTracker.LEVEL_DEBUG, "E", UTConstant.Args.UT_SUCCESS_F, "G", "H", TLogTracker.LEVEL_INFO, "J", "K", "L", "M", "N", "O", "P", "Q", "R", ExifInterface.LATITUDE_SOUTH, "T", "U", "V", "W", "X", "Y", "Z"};
        this.choose = -1;
        this.paint = new Paint();
        this.showBkg = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.showBkg) {
            canvas.drawColor(Color.parseColor("#40000000"));
        }
        int height = getHeight();
        int width = getWidth();
        int length = height / this.b.length;
        for (int i = 0; i < this.b.length; i++) {
            this.paint.setColor(-65536);
            this.paint.setTextSize((width * 3) / 5);
            this.paint.setTypeface(Typeface.DEFAULT);
            this.paint.setAntiAlias(true);
            if (i == this.choose) {
                this.paint.setColor(Color.parseColor("#3399ff"));
                this.paint.setFakeBoldText(true);
            }
            canvas.drawText(this.b[i], (width / 2) - (this.paint.measureText(this.b[i]) / 2.0f), (length * i) + length, this.paint);
            this.paint.reset();
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7bb68bd5", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        int i = this.choose;
        OnTouchingLetterChangedListener onTouchingLetterChangedListener = this.onTouchingLetterChangedListener;
        float height = y / getHeight();
        String[] strArr = this.b;
        int length = (int) (height * strArr.length);
        if (action == 0) {
            this.showBkg = true;
            if (i != length && onTouchingLetterChangedListener != null && length > 0 && length < strArr.length) {
                onTouchingLetterChangedListener.onTouchingLetterChanged(strArr[length]);
                this.choose = length;
                invalidate();
            }
        } else if (action != 1) {
            if (action == 2 && i != length && onTouchingLetterChangedListener != null && length >= 0 && length < strArr.length) {
                onTouchingLetterChangedListener.onTouchingLetterChanged(strArr[length]);
                this.choose = length;
                invalidate();
            }
        } else {
            this.showBkg = false;
            this.choose = -1;
            invalidate();
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue() : super.onTouchEvent(motionEvent);
    }

    public void setOnTouchingLetterChangedListener(OnTouchingLetterChangedListener onTouchingLetterChangedListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a91895df", new Object[]{this, onTouchingLetterChangedListener});
        } else {
            this.onTouchingLetterChangedListener = onTouchingLetterChangedListener;
        }
    }
}
