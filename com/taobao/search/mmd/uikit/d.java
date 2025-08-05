package com.taobao.search.mmd.uikit;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import tb.kge;

/* loaded from: classes7.dex */
public class d extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Paint f19183a = new Paint();
    private int b = 0;
    private RectF c = new RectF();
    private Path d = new Path();
    private int e = -24771;
    private int f = -761329;
    private boolean g = false;
    private int h = DensityUtil.dip2px(Globals.getApplication(), 1.5f);

    static {
        kge.a(1853273755);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        }
    }

    public d() {
        this.f19183a.setStyle(Paint.Style.FILL);
        this.f19183a.setColor(-1);
        this.f19183a.setAntiAlias(true);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.e = i;
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
        } else {
            canvas.drawPath(this.d, this.f19183a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
            return;
        }
        int min = Math.min(rect.width(), rect.height());
        if (!this.g) {
            i = this.h;
        }
        this.b = (min / 2) - i;
        this.c.set(rect);
        float f = i;
        this.c.inset(f, f);
        int i2 = this.b / 2;
        if (!this.g) {
            this.c.right -= i2;
        }
        this.d.reset();
        if (!this.g) {
            this.d.moveTo(this.c.right - this.b, f);
            this.d.lineTo(this.c.right + i2, rect.centerY());
            this.d.lineTo(this.c.right - this.b, f + this.c.height());
        }
        Path path = this.d;
        RectF rectF = this.c;
        int i3 = this.b;
        path.addRoundRect(rectF, i3, i3, Path.Direction.CW);
        this.d.close();
        a();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.f19183a.setShader(new LinearGradient(0.0f, 0.0f, getBounds().width(), 0.0f, this.e, this.f, Shader.TileMode.CLAMP));
        invalidateSelf();
    }
}
