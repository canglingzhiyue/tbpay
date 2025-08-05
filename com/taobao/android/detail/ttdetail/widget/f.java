package com.taobao.android.detail.ttdetail.widget;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class f extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int c;
    private int d;

    /* renamed from: a  reason: collision with root package name */
    private final int f11030a = 260;
    private final int b = 200;
    private final RectF e = new RectF();
    private Paint f = a(Color.rgb(245, 245, 245));
    private Paint g = a(Color.rgb(230, 230, 230));
    private Paint h = a(Color.rgb(241, 241, 241));
    private Paint i = a(Color.rgb(250, 250, 250));

    static {
        kge.a(-1045421021);
    }

    public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
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
        this.d = rect.height();
        this.c = rect.width();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        int b = b(16);
        int b2 = b(32);
        int b3 = b(32);
        int b4 = b(163);
        int b5 = b(36);
        int b6 = b(18);
        canvas.drawColor(-1);
        canvas.drawRect(0.0f, 0.0f, this.c, b, this.f);
        canvas.save();
        canvas.translate(0.0f, b + b3);
        RectF a2 = a(b2, 0, b4, b5);
        float f = b6;
        canvas.drawRoundRect(a2, f, f, this.g);
        canvas.save();
        canvas.translate(0.0f, a2.bottom + b3);
        for (int i = 0; i < 3; i++) {
            a(canvas, b2, b3);
        }
    }

    private void a(Canvas canvas, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a565671d", new Object[]{this, canvas, new Integer(i), new Integer(i2)});
            return;
        }
        int b = b(16);
        int b2 = b(351);
        int b3 = b(351);
        int b4 = b(319);
        int b5 = b(32);
        int b6 = b(222);
        int b7 = b(10);
        int b8 = b(12);
        int b9 = b(16);
        RectF a2 = a(b, 0, b2, b3);
        float f = b8;
        canvas.drawRoundRect(a2, f, f, this.h);
        int i3 = b + b2 + b;
        canvas.drawRoundRect(a(i3, 0, b2, b3), f, f, this.h);
        canvas.save();
        float f2 = i2;
        canvas.translate(0.0f, a2.bottom + f2);
        RectF a3 = a(i, 0, b4, b5);
        float f3 = b9;
        canvas.drawRoundRect(a3, f3, f3, this.i);
        int i4 = i3 + b;
        canvas.drawRoundRect(a(i4, 0, b4, b5), f3, f3, this.i);
        float f4 = a3.bottom;
        float f5 = b7;
        canvas.translate(0.0f, f4 + f5);
        RectF a4 = a(i, 0, b4, b5);
        canvas.drawRoundRect(a4, f3, f3, this.i);
        canvas.drawRoundRect(a(i4, 0, b4, b5), f3, f3, this.i);
        canvas.translate(0.0f, a4.bottom + f5);
        RectF a5 = a(i, 0, b6, b5);
        canvas.drawRoundRect(a5, f3, f3, this.i);
        canvas.drawRoundRect(a(i4, 0, b6, b5), f3, f3, this.i);
        canvas.save();
        canvas.translate(0.0f, a5.bottom + f2);
    }

    private RectF a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("ebae6b3f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
        }
        this.e.set(i, i2, i3 + i, i4 + i2);
        return this.e;
    }

    private int b(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a9d66c2d", new Object[]{this, new Integer(i)})).intValue() : (int) (((this.c / 750.0f) * i) + 0.5f);
    }
}
