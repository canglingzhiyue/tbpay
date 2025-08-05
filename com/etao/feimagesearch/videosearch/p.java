package com.etao.feimagesearch.videosearch;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public final class p extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f7088a = com.etao.feimagesearch.util.g.a(12.0f);
    private final RectF b = new RectF();
    private final Paint c = new Paint(1);

    static {
        kge.a(-430407404);
    }

    public static /* synthetic */ Object ipc$super(p pVar, String str, Object... objArr) {
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

    public p() {
        this.c.setColor(-1);
        this.c.setStyle(Paint.Style.FILL);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        kotlin.jvm.internal.q.c(canvas, "canvas");
        canvas.drawOval(this.b, this.c);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, bounds});
            return;
        }
        kotlin.jvm.internal.q.c(bounds, "bounds");
        super.onBoundsChange(bounds);
        this.b.left = (getBounds().left + (getBounds().width() / 2.0f)) - (this.f7088a / 2.0f);
        this.b.top = (getBounds().top + (getBounds().height() / 2.0f)) - (this.f7088a / 2.0f);
        RectF rectF = this.b;
        rectF.right = rectF.left + this.f7088a;
        RectF rectF2 = this.b;
        rectF2.bottom = rectF2.top + this.f7088a;
    }
}
