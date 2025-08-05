package com.taobao.search.mmd.uikit.shopinfo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.search.common.util.n;
import com.taobao.search.mmd.uikit.iconlist.a;
import tb.jwy;
import tb.kge;

/* loaded from: classes7.dex */
public class e implements Drawable.Callback, a.InterfaceC0770a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static int f19190a;
    private TextPaint b;
    private boolean c;
    private int d;
    private int e;
    private int f;
    private int g;
    private com.taobao.search.mmd.uikit.iconlist.a h;
    private String i;
    private Drawable j;
    private float k;
    private String l;
    private int m;
    private Drawable n;
    private boolean o = false;
    private boolean p = false;
    private int q = 12;
    private String r;
    private Paint s;

    static {
        kge.a(1986806799);
        kge.a(-227018379);
        kge.a(-1139115842);
    }

    @Override // com.taobao.search.mmd.uikit.iconlist.a.InterfaceC0770a
    public boolean isLayoutRequested() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bb97a465", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public e(TextPaint textPaint, boolean z) {
        this.b = textPaint;
        this.c = z;
    }

    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.r = str;
        }
    }

    public void a(String str, int i, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b8603d7", new Object[]{this, str, new Integer(i), context});
            return;
        }
        int i2 = this.g - this.e;
        int i3 = f19190a;
        f19190a = i3 + 1;
        this.h = new com.taobao.search.mmd.uikit.iconlist.a(context, this, i, i2, i3);
        if ("circle".equals(this.r)) {
            this.h.a(true);
        }
        this.i = str;
    }

    public void a(String str, float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3510af5", new Object[]{this, str, new Float(f), new Integer(i)});
            return;
        }
        this.k = f;
        this.l = str;
        this.m = i;
    }

    public void a(String str, float f, int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1348c1e6", new Object[]{this, str, new Float(f), new Integer(i), new Integer(i2), new Boolean(z)});
            return;
        }
        this.k = f;
        this.l = str;
        this.m = i;
        if (i2 <= 0) {
            i2 = 12;
        }
        this.q = i2;
        this.p = z;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c16ae24", new Object[]{this, drawable});
            return;
        }
        Drawable drawable2 = this.n;
        if (drawable2 == null) {
            return;
        }
        drawable2.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4282486", new Object[]{this, drawable, runnable, new Long(j)});
            return;
        }
        Drawable drawable2 = this.n;
        if (drawable2 == null) {
            return;
        }
        drawable2.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e77f3b17", new Object[]{this, drawable, runnable});
            return;
        }
        Drawable drawable2 = this.n;
        if (drawable2 == null) {
            return;
        }
        drawable2.unscheduleSelf(runnable);
    }

    @Override // com.taobao.search.mmd.uikit.iconlist.a.InterfaceC0770a
    public void onDrawableLoaded(BitmapDrawable bitmapDrawable, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b55dc0f", new Object[]{this, bitmapDrawable, new Integer(i), str});
        } else if (bitmapDrawable == null) {
        } else {
            if (bitmapDrawable instanceof com.taobao.phenix.animate.b) {
                if (n.INSTANCE.g()) {
                    ((com.taobao.phenix.animate.b) bitmapDrawable).f();
                } else {
                    ((com.taobao.phenix.animate.b) bitmapDrawable).b();
                }
            }
            this.j = bitmapDrawable;
            this.j.setCallback(this);
            Drawable drawable = this.n;
            if (drawable == null) {
                return;
            }
            drawable.invalidateSelf();
        }
    }

    public void a(jwy jwyVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f03b8e8c", new Object[]{this, jwyVar});
            return;
        }
        this.n = jwyVar;
        com.taobao.search.mmd.uikit.iconlist.a aVar = this.h;
        if (aVar == null) {
            return;
        }
        aVar.a(this.i);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        this.j = null;
        this.n = null;
        this.o = false;
        com.taobao.search.mmd.uikit.iconlist.a aVar = this.h;
        if (aVar == null) {
            return;
        }
        aVar.c();
    }

    public void a(Canvas canvas, Typeface typeface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52e7e869", new Object[]{this, canvas, typeface});
        } else if (this.h != null) {
            Drawable drawable = this.j;
            if (drawable == null) {
                return;
            }
            if (!this.o) {
                this.o = true;
                drawable.setBounds(this.d, this.e, this.f, this.g);
            }
            this.j.setBounds(this.d, this.e, this.f, this.g);
            if ("circle".equals(this.r)) {
                c();
                int i = this.d;
                int i2 = this.f;
                canvas.drawCircle((i + i2) / 2.0f, (this.e + this.g) / 2.0f, ((i2 - i) / 2.0f) + 1.0f, this.s);
            }
            this.j.draw(canvas);
        } else {
            if (this.c && this.b.getTypeface() == null) {
                this.b.setTypeface(typeface);
            }
            TextPaint textPaint = this.b;
            int i3 = this.q;
            textPaint.setTextSize(j.b(i3 <= 0 ? 12.0f : i3));
            this.b.setFakeBoldText(this.p);
            this.b.setColor(this.m);
            canvas.drawText(this.l, this.d, this.k, this.b);
        }
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else if (this.s != null) {
        } else {
            this.s = new Paint();
            this.s.setAntiAlias(true);
            this.s.setColor(Color.parseColor("#ff0040"));
            this.s.setStyle(Paint.Style.STROKE);
            this.s.setStrokeWidth(1.0f);
        }
    }
}
