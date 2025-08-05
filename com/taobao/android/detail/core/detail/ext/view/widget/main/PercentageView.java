package com.taobao.android.detail.core.detail.ext.view.widget.main;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public class PercentageView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int bgColor;
    private RectF bgRect;
    private int fgColor;
    private RectF fgRect;
    private int height;
    private Paint mPaint;
    private float percentage;
    private float radioC;
    private int width;

    static {
        kge.a(-1445301363);
    }

    public static /* synthetic */ Object ipc$super(PercentageView percentageView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public PercentageView(Context context) {
        super(context);
        this.radioC = epo.f27511a * 3.0f;
        init();
    }

    public PercentageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.radioC = epo.f27511a * 3.0f;
        init();
    }

    public PercentageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.radioC = epo.f27511a * 3.0f;
        init();
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mPaint = new Paint();
        this.mPaint.setStrokeWidth(2.0f);
        emu.a("com.taobao.android.detail.core.detail.ext.view.widget.main.PercentageView");
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c047129", new Object[]{this, new Integer(i)});
            return;
        }
        this.bgColor = i;
        invalidate();
    }

    public void setFrontgroundColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26421fa7", new Object[]{this, new Integer(i)});
            return;
        }
        this.fgColor = i;
        invalidate();
    }

    public void setPercentage(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0777cfd", new Object[]{this, new Float(f)});
            return;
        }
        this.percentage = f;
        invalidate();
    }

    public void setRadioConner(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2953aa", new Object[]{this, new Integer(i)});
        } else {
            this.radioC = i;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        if (this.mPaint != null) {
            if (this.bgRect == null) {
                this.height = getHeight();
                this.width = getWidth();
                this.bgRect = new RectF(0.0f, 0.0f, this.width, this.height);
            }
            this.mPaint.setColor(this.bgColor);
            canvas.drawRoundRect(this.bgRect, this.radioC + (epo.f27511a * 1.0f), this.radioC, this.mPaint);
            if (this.fgRect == null) {
                this.fgRect = new RectF(0.0f, 0.0f, this.width * this.percentage, this.height);
            }
            this.mPaint.setColor(this.fgColor);
            canvas.drawRoundRect(this.fgRect, this.radioC + (epo.f27511a * 1.0f), this.radioC, this.mPaint);
        }
        super.onDraw(canvas);
    }
}
