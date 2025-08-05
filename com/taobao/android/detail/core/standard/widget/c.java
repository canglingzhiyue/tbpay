package com.taobao.android.detail.core.standard.widget;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class c extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int u;
    private int v;

    /* renamed from: a  reason: collision with root package name */
    private final int f9893a = 200;
    private final int b = 400;
    private final int c = 550;
    private final int d = 40;
    private final int e = 100;
    private final int f = 50;
    private final int g = 400;
    private final int h = 300;
    private final int i = 20;
    private final int j = 25;
    private final int k = 20;
    private final int l = 30;
    private final int m = 300;
    private final int n = 30;
    private final int o = 20;
    private final int p = 30;
    private final int q = 15;
    private final int r = 7;
    private final int s = 260;
    private final int t = 200;
    private float A = 1.0f;
    private final Paint w = a(Color.rgb(236, 236, 236));
    private final Paint y = a(Color.rgb(245, 245, 245));
    private final Paint x = a(Color.rgb(250, 224, 211));
    private final RectF z = new RectF();

    static {
        kge.a(1520441004);
    }

    public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
        if (str.hashCode() == -2054040210) {
            super.onBoundsChange((Rect) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -1;
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

    public c() {
        emu.a("com.taobao.android.detail.core.standard.widget.DetailPresetDesktopDrawable");
    }

    public c a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("1c5648c8", new Object[]{this, new Float(f)});
        }
        this.A = f;
        return this;
    }

    private Paint a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint) ipChange.ipc$dispatch("86f68170", new Object[]{this, new Integer(i)});
        }
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setAntiAlias(true);
        return paint;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
            return;
        }
        super.onBoundsChange(rect);
        this.v = rect.height();
        this.u = rect.width();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        canvas.drawColor(-1);
        int i = this.u;
        canvas.drawRect(0.0f, 0.0f, i, i * this.A, this.w);
        float f = this.A;
        int i2 = f == 0.0f ? this.u / 4 : (int) (this.u * f);
        canvas.save();
        canvas.translate(0.0f, i2);
        int c = c(20);
        int c2 = c(15);
        canvas.translate(c, c(30));
        RectF a2 = a(0, 0, 300, 30);
        float c3 = c(7);
        canvas.drawRoundRect(a2, c3, c3, this.x);
        canvas.translate(0.0f, c(30) + c2);
        canvas.drawRoundRect(a(0, 0, 200, 20), c3, c3, this.w);
        canvas.translate(0.0f, c(20) + c2);
        canvas.drawRoundRect(a(0, 0, 550, 25), c3, c3, this.w);
        canvas.translate(0.0f, c(25) + c2);
        canvas.drawRoundRect(a(0, 0, 400, 25), c3, c3, this.w);
        canvas.translate(c(30), c(25) + (c2 << 1));
        RectF a3 = a(0, 0, 100, 20);
        canvas.drawRoundRect(a3, c3, c3, this.w);
        canvas.translate(c(Result.ALIPAY_RSAKEY_MALLOC_FAILED), 0.0f);
        canvas.drawRoundRect(a3, c3, c3, this.w);
        canvas.translate(c(Result.ALIPAY_RSAKEY_MALLOC_FAILED), 0.0f);
        canvas.drawRoundRect(a3, c3, c3, this.w);
        canvas.restore();
        canvas.save();
        canvas.translate(c(690), c(130) + i2);
        canvas.drawRoundRect(a(0, 0, 40, 40), c3, c3, this.w);
        canvas.restore();
        for (int i3 = 0; a(i3, i2); i3++) {
            a(canvas, i3, i2);
        }
    }

    private boolean a(int i, int i2) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5c1152cc", new Object[]{this, new Integer(i), new Integer(i2)})).booleanValue() : (i2 + c(260)) + (c(200) * i) < this.v;
    }

    private void a(Canvas canvas, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a565671d", new Object[]{this, canvas, new Integer(i), new Integer(i2)});
            return;
        }
        int c = c(200);
        int c2 = c(20);
        int c3 = c(7);
        int c4 = i2 + c(260) + (c * i);
        canvas.save();
        canvas.translate(0.0f, c4);
        canvas.drawRect(0.0f, 0.0f, this.u, c(20), this.y);
        canvas.translate(c2, c(50));
        float f = c3;
        canvas.drawRoundRect(a(0, 0, 50, 25), f, f, this.w);
        canvas.translate(0.0f, c(95));
        canvas.drawRoundRect(a(0, 0, 50, 25), f, f, this.w);
        canvas.restore();
        canvas.save();
        canvas.translate(c(100), c4 + c(50));
        canvas.drawRoundRect(a(0, 0, 400, 25), f, f, this.w);
        canvas.translate(0.0f, c(95));
        canvas.drawRoundRect(a(0, 0, 300, 25), f, f, this.w);
        canvas.restore();
    }

    private RectF a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("ebae6b3f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        this.z.set(c(i), c(i2), c(i3 + i), c(i4 + i2));
        return this.z;
    }

    private int c(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("ab8b44cc", new Object[]{this, new Integer(i)})).intValue() : (int) (((this.u / 750.0f) * i) + 0.5f);
    }
}
