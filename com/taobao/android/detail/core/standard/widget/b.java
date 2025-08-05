package com.taobao.android.detail.core.standard.widget;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class b extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ORIGIN_HEIGHT = 102;
    public static final int ORIGIN_WIDTH = 750;
    private Paint m;
    private int o;
    private int p;

    /* renamed from: a  reason: collision with root package name */
    private final int f9892a = 30;
    private final int b = 20;
    private final int c = 15;
    private final int d = 12;
    private final int e = 15;
    private final int f = 58;
    private final int g = 10;
    private final int h = 35;
    private final int i = 35;
    private final int j = 20;
    private final int k = 440;
    private RectF l = new RectF();
    private Paint n = a(Color.rgb(238, 238, 238));

    static {
        kge.a(325354488);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        str.hashCode();
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

    public b() {
        emu.a("com.taobao.android.detail.core.standard.widget.DetailPresetBottomBarDrawable");
    }

    private Paint a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint) ipChange.ipc$dispatch("86f68170", new Object[]{this, new Integer(i)});
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        return paint;
    }

    private Paint a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint) ipChange.ipc$dispatch("f4381203", new Object[]{this});
        }
        int[] iArr = {Color.rgb(255, 196, 0), Color.rgb(255, 148, 1), Color.rgb(255, 124, 0), Color.rgb(255, 86, 9)};
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(new LinearGradient(0.0f, 0.0f, b(440), 0.0f, iArr, new float[]{0.0f, 0.5f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        return paint;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
            return;
        }
        this.p = rect.height();
        this.o = rect.width();
        this.m = a();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        canvas.drawColor(-1);
        float b2 = b(10);
        canvas.drawRoundRect(a(30, 20, 35, 35), b2, b2, this.n);
        canvas.drawRoundRect(a(123, 20, 35, 35), b2, b2, this.n);
        canvas.drawRoundRect(a(216, 20, 35, 35), b2, b2, this.n);
        float b3 = this.p - b(35);
        this.l.set(b(30), b3, b(65), b(20) + b);
        canvas.drawRoundRect(this.l, b2, b2, this.n);
        this.l.set(b(123), b3, b(158), b(20) + b);
        canvas.drawRoundRect(this.l, b2, b2, this.n);
        this.l.set(b(216), b3, b(251), b(20) + b);
        canvas.drawRoundRect(this.l, b2, b2, this.n);
        canvas.save();
        canvas.translate(b(Result.ALIPAY_READ_REG_INFO_FAILED), b(12));
        RectF a2 = a(0, 0, 440, 0);
        a2.bottom = this.p - (b(12) << 1);
        float f = a2.bottom / 2.0f;
        canvas.drawRoundRect(a2, f, f, this.m);
        canvas.restore();
    }

    private RectF a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("ebae6b3f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        this.l.set(b(i), b(i2), b(i3 + i), b(i4 + i2));
        return this.l;
    }

    private int b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue() : (int) (((this.o / 750.0f) * i) + 0.5f);
    }
}
