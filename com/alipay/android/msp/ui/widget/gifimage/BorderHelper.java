package com.alipay.android.msp.ui.widget.gifimage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BorderHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Path f5085a = new Path();
    private Rect b = new Rect();
    private RectF c = new RectF();
    private int d = -1;
    private GradientDrawable e = null;
    private int g = -1;
    private int f = -1;

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.d = i;
        }
    }

    public void setBorder(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7080fd5", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (i == this.g && i2 == this.f) {
            z = false;
        }
        this.g = i;
        this.f = i2;
        if (!z) {
            return;
        }
        this.e = null;
    }

    public void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        if (this.f > 0 || this.d > 0) {
            canvas.getClipBounds(this.b);
        }
        if (this.d <= 0) {
            return;
        }
        try {
            this.c.set(this.b);
            this.f5085a.addRoundRect(this.c, this.d, this.d, Path.Direction.CW);
            canvas.clipPath(this.f5085a);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
        } else if (this.f <= 0 && this.d <= 0) {
        } else {
            if (this.e == null) {
                this.e = new GradientDrawable();
                this.e.setShape(0);
                int i = this.f;
                if (i > 0) {
                    this.e.setStroke(i, this.g);
                }
                this.e.setColor(0);
                int i2 = this.d;
                if (i2 > 0) {
                    this.e.setCornerRadius(i2);
                }
            }
            this.e.setBounds(this.b);
            this.e.draw(canvas);
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.e = null;
        this.b = null;
        this.c = null;
    }
}
