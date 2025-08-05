package com.taobao.live.home.widget.tab;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class b extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int BOTTOM = 2;
    public static final int CENTER = 1;
    public static final int TOP = 0;
    private RectF b;
    private int e;
    private int c = -16777216;
    private int d = 0;
    private int f = 1;

    /* renamed from: a  reason: collision with root package name */
    private Paint f17774a = new Paint();

    static {
        kge.a(187424434);
    }

    public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1924089730) {
            super.setBounds(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue());
            return null;
        } else if (hashCode != -1028087344) {
            throw new InstantReloadException(String.format("String switch could not find '%s'", str));
        } else {
            return new Integer(super.getIntrinsicHeight());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        return -3;
    }

    public b(Context context) {
        this.e = a(context, 2.0f);
        this.f17774a.setColor(this.c);
        this.f17774a.setAntiAlias(true);
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f17774a.setColor(i);
        }
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
        } else if (i != 0 && i != 1 && i != 2) {
            throw new IllegalArgumentException("Gravity must be one of 0(DividerDrawable.TOP)、1(DividerDrawable.CENTER) and 2(DividerDrawable.BOTTOM)");
        } else {
            this.f = i;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        canvas.drawColor(0);
        int i = this.d;
        if (i == 0 || i >= this.b.bottom) {
            canvas.drawRect(this.b, this.f17774a);
            return;
        }
        int i2 = (int) ((this.b.bottom - this.d) / 2.0f);
        int i3 = this.f;
        if (i3 == 0) {
            canvas.drawRect(this.b.left, this.b.top, this.b.right, this.b.bottom - (i2 << 1), this.f17774a);
        } else if (i3 == 1) {
            float f = i2;
            canvas.drawRect(this.b.left, this.b.top + f, this.b.right, this.b.bottom - f, this.f17774a);
        } else if (i3 != 2) {
        } else {
            canvas.drawRect(this.b.left, this.b.top + (i2 << 1), this.b.right, this.b.bottom, this.f17774a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d50b87e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        super.setBounds(i, i2, i3, i4);
        this.b = new RectF(i, i2, i3, i4);
    }

    public void a(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c1152c8", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.e = i;
        this.d = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue() : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue() : this.e;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
        } else {
            this.f17774a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        } else {
            this.f17774a.setColorFilter(colorFilter);
        }
    }

    public int a(Context context, float f) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("258f8f53", new Object[]{this, context, new Float(f)})).intValue() : (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
