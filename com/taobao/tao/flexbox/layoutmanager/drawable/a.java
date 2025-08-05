package com.taobao.tao.flexbox.layoutmanager.drawable;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.ogg;
import tb.ogl;

/* loaded from: classes8.dex */
public class a extends GradientDrawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Paint f20381a = new Paint();
    private ogl b;
    private int c;
    private int d;

    static {
        kge.a(-1041072831);
    }

    public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public a(ogl oglVar) {
        this.b = oglVar;
    }

    @Override // android.graphics.drawable.GradientDrawable, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        try {
            this.c = getBounds().width();
            this.d = getBounds().height();
            if (a(this.c, this.d)) {
                return;
            }
            a(canvas);
            b(canvas);
        } catch (OutOfMemoryError e) {
            ogg.b(e.getMessage());
        }
    }

    private void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        int a2 = a(this.b.aG.f32034a, this.c, 0);
        int a3 = a(this.b.aG.b, this.d, 0);
        int a4 = a(this.c + this.b.aG.f32034a, this.c, 0);
        int a5 = a(this.d + this.b.aG.b, this.d, 0);
        this.f20381a.setColor(this.b.aG.e);
        if (this.b.aG.c > 0) {
            this.f20381a.setMaskFilter(new BlurMaskFilter(this.b.aG.c, BlurMaskFilter.Blur.NORMAL));
        }
        canvas.drawRoundRect(new RectF(a2, a3, a4, a5), this.b.aJ, this.b.aJ, this.f20381a);
    }

    private void b(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a03d9c", new Object[]{this, canvas});
            return;
        }
        int a2 = a(-this.b.aG.f32034a, this.c, 0);
        int a3 = a(-this.b.aG.b, this.d, 0);
        int a4 = a(this.c - this.b.aG.f32034a, this.c, 0);
        int a5 = a(this.d - this.b.aG.b, this.d, 0);
        if (this.b.aE == 1) {
            return;
        }
        this.f20381a.setMaskFilter(null);
        this.f20381a.setColor(this.b.aE);
        canvas.drawRoundRect(new RectF(a2, a3, a4, a5), this.b.aJ, this.b.aJ, this.f20381a);
    }

    private int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue() : i > i2 ? i2 : Math.max(i, i3);
    }

    private boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue();
        }
        ogl oglVar = this.b;
        return oglVar == null || oglVar.aG == null || i <= (Math.abs(this.b.aG.f32034a) << 1) || i2 <= (Math.abs(this.b.aG.b) << 1) || this.b.aG.c < 0 || (this.b.aG.c == 0 && this.b.aG.f32034a == 0 && this.b.aG.b == 0);
    }
}
