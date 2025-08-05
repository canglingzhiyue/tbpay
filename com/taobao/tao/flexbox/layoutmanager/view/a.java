package com.taobao.tao.flexbox.layoutmanager.view;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.GravityCompat;
import android.view.Gravity;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final View c;
    private Drawable d;
    private final Rect e = new Rect();
    private final Rect f = new Rect();
    private int g = 119;

    /* renamed from: a  reason: collision with root package name */
    public boolean f20534a = true;
    public boolean b = false;

    static {
        kge.a(130038057);
    }

    public a(View view) {
        this.c = view;
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.g;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.g == i) {
        } else {
            if ((8388615 & i) == 0) {
                i |= GravityCompat.START;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.g = i;
            if (this.g == 119 && this.d != null) {
                this.d.getPadding(new Rect());
            }
            this.c.requestLayout();
        }
    }

    public boolean a(Drawable drawable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("dd037b90", new Object[]{this, drawable})).booleanValue() : drawable == this.d;
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        Drawable drawable = this.d;
        if (drawable == null) {
            return;
        }
        drawable.jumpToCurrentState();
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        Drawable drawable = this.d;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.d.setState(this.c.getDrawableState());
    }

    public void b(Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a3a68d", new Object[]{this, drawable});
            return;
        }
        Drawable drawable2 = this.d;
        if (drawable2 == drawable) {
            return;
        }
        if (drawable2 != null) {
            drawable2.setCallback(null);
            this.c.unscheduleDrawable(this.d);
        }
        this.d = drawable;
        if (drawable != null) {
            drawable.setCallback(this.c);
            if (drawable.isStateful()) {
                drawable.setState(this.c.getDrawableState());
            }
            if (this.g == 119) {
                drawable.getPadding(new Rect());
            }
        }
        this.c.requestLayout();
        this.c.invalidate();
    }

    public Drawable d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Drawable) ipChange.ipc$dispatch("23d2f6ef", new Object[]{this}) : this.d;
    }

    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else if (!z) {
        } else {
            this.b = true;
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a4ca6c", new Object[]{this});
        } else {
            this.b = true;
        }
    }

    public void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        Drawable drawable = this.d;
        if (drawable == null) {
            return;
        }
        if (this.b) {
            this.b = false;
            Rect rect = this.e;
            Rect rect2 = this.f;
            int right = this.c.getRight() - this.c.getLeft();
            int bottom = this.c.getBottom() - this.c.getTop();
            if (this.f20534a) {
                rect.set(0, 0, right, bottom);
            } else {
                rect.set(this.c.getPaddingLeft(), this.c.getPaddingTop(), right - this.c.getPaddingRight(), bottom - this.c.getPaddingBottom());
            }
            Gravity.apply(this.g, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
            drawable.setBounds(rect2);
        }
        drawable.draw(canvas);
    }
}
