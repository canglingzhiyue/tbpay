package com.alipay.birdnest.util;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class BorderHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Path f5262a = new Path();
    public Rect b = new Rect();
    public RectF c = new RectF();
    public int d = -1;
    public float[] e = null;
    public GradientDrawable f = null;
    public int g = -1;
    public int h = -1;

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (i == this.g && i2 == this.h) {
            z = false;
        }
        this.g = i;
        this.h = i2;
        if (!z) {
            return;
        }
        this.f = null;
    }

    public void b(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a03d9c", new Object[]{this, canvas});
        } else if (this.h <= 0 && this.d <= 0 && this.e == null) {
        } else {
            if (this.f == null) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                this.f = gradientDrawable;
                gradientDrawable.mutate();
                this.f.setShape(0);
                int i = this.g;
                int i2 = this.h;
                if (i2 > 0) {
                    this.f.setStroke(i2, i);
                }
                this.f.setColor(0);
                int i3 = this.d;
                if (i3 > 0) {
                    this.f.setCornerRadius(i3);
                } else {
                    float[] fArr = this.e;
                    if (fArr != null) {
                        this.f.setCornerRadii(fArr);
                    }
                }
            }
            this.f.mutate();
            this.f.setBounds(this.b);
            this.f.draw(canvas);
        }
    }

    public void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        if (this.h > 0 || this.d > 0 || this.e != null) {
            canvas.getClipBounds(this.b);
        }
        if (this.d > 0) {
            try {
                this.c.set(this.b);
                this.f5262a.reset();
                Path path = this.f5262a;
                RectF rectF = this.c;
                float f = this.d;
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
                canvas.clipPath(this.f5262a);
            } catch (Throwable th) {
                FBLogger.e("FBBorderHelper", "clipPath exception", th);
            }
        } else if (this.e == null) {
        } else {
            try {
                this.c.set(this.b);
                this.f5262a.reset();
                this.f5262a.addRoundRect(this.c, this.e, Path.Direction.CW);
                canvas.clipPath(this.f5262a);
            } catch (Throwable th2) {
                FBLogger.e("FBBorderHelper", "clipPath exception", th2);
            }
        }
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f = null;
        this.b = null;
        this.c = null;
    }
}
