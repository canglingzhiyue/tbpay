package com.alipay.mobile.verifyidentity.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.util.AttributeSet;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class VILoopView extends View {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Bitmap f6084a;
    private Canvas b;
    private boolean c;
    private Paint d;
    private Paint e;
    private int f;
    private long g;
    private int h;

    public static /* synthetic */ Object ipc$super(VILoopView vILoopView, String str, Object... objArr) {
        if (str.hashCode() == -1117127205) {
            super.onDraw((Canvas) objArr[0]);
            return null;
        }
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    public VILoopView(Context context) {
        super(context);
        this.f6084a = null;
        this.b = null;
        this.c = false;
        this.f = 0;
        this.g = -1L;
        a(context);
    }

    public VILoopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6084a = null;
        this.b = null;
        this.c = false;
        this.f = 0;
        this.g = -1L;
        a(context);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd69fddb", new Object[]{this, canvas});
            return;
        }
        super.onDraw(canvas);
        if (this.c) {
            return;
        }
        if (System.currentTimeMillis() - this.g >= 200) {
            this.g = System.currentTimeMillis();
            float pixel = toPixel(getContext(), 4.0f);
            this.b.drawCircle(toPixel(getContext(), 4.0f), pixel, this.h, a(0));
            this.b.drawCircle(toPixel(getContext(), 20.0f), pixel, this.h, a(1));
            this.b.drawCircle(toPixel(getContext(), 36.0f), pixel, this.h, a(2));
            this.b.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            this.f = (this.f + 1) % 3;
        }
        canvas.drawBitmap(this.f6084a, 0.0f, 0.0f, new Paint());
        invalidate();
    }

    public static int toPixel(Context context, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("48f2223d", new Object[]{context, new Float(f)})).intValue();
        }
        return (int) (f * (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics().density);
    }

    private Paint a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Paint) ipChange.ipc$dispatch("86f68170", new Object[]{this, new Integer(i)});
        }
        if (this.f == i) {
            return this.d;
        }
        return this.e;
    }

    private void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{this, context});
            return;
        }
        this.d = new Paint();
        this.d.setColor(-1118482);
        this.e = new Paint();
        this.e.setColor(-7829368);
        this.h = toPixel(getContext(), 4.0f);
        this.b = new Canvas();
        this.f6084a = Bitmap.createBitmap(toPixel(context, 40.0f), toPixel(context, 8.0f), Bitmap.Config.ARGB_8888);
        this.b.setBitmap(this.f6084a);
    }

    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            this.c = true;
        }
    }
}
