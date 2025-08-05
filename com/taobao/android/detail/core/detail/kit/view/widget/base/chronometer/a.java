package com.taobao.android.detail.core.detail.kit.view.widget.base.chronometer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.android.alibaba.ip.runtime.IpChange;
import tb.epo;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class a<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f9608a;
    public Paint.FontMetrics j;
    public String k;
    public float b = 0.0f;
    public float c = 0.0f;
    public int d = com.taobao.android.detail.core.utils.c.a("#ffffff");
    public int e = com.taobao.android.detail.core.utils.c.a("#333333");
    public int f = epo.j;
    public int g = epo.e;
    public int h = epo.e;
    public RectF l = new RectF();
    public Paint i = new Paint();

    static {
        kge.a(-1704144955);
    }

    public abstract void a(Context context);

    public a(Context context) {
        this.f9608a = context;
        this.i.setAntiAlias(true);
        this.i.setColor(this.d);
        this.i.setTextSize(this.f);
        this.i.setTypeface(Typeface.DEFAULT_BOLD);
        this.i.setTextAlign(Paint.Align.CENTER);
        this.j = this.i.getFontMetrics();
        a(context);
    }

    public void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
        } else {
            canvas.drawText(this.k, this.l.right - (this.b / 2.0f), (((this.l.bottom - this.l.top) / 2.0f) - ((this.j.bottom - this.j.top) / 2.0f)) - this.j.top, this.i);
        }
    }

    public void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        RectF rectF = this.l;
        rectF.left = f;
        rectF.right = rectF.left + this.b;
    }

    public void b(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d660f7", new Object[]{this, new Float(f)});
            return;
        }
        RectF rectF = this.l;
        rectF.top = f;
        rectF.bottom = rectF.top + this.c;
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.d = i;
        this.e = i2;
        Paint paint = this.i;
        if (paint == null) {
            return;
        }
        paint.setColor(i);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.f = i;
        Paint paint = this.i;
        if (paint == null) {
            return;
        }
        paint.setTextSize(i);
        this.j = this.i.getFontMetrics();
    }

    public void b(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f78e09", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.g = i;
        this.h = i2;
    }
}
