package com.taobao.tao.flexbox.layoutmanager.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.GravityCompat;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.oeb;

/* loaded from: classes8.dex */
public class d extends Drawable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private e b;
    private int e;
    private int f;
    private int g;
    private int h;

    /* renamed from: a  reason: collision with root package name */
    private boolean f20385a = false;
    private int c = 3;
    private Rect d = new Rect();

    static {
        kge.a(450635059);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65fee558", new Object[]{this, colorFilter});
        }
    }

    public void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76766bfc", new Object[]{this, eVar});
            return;
        }
        this.b = eVar;
        invalidateSelf();
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        this.b = null;
        this.f20385a = false;
        this.c = 3;
    }

    public void a(CharSequence charSequence) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("638f990c", new Object[]{this, charSequence});
            return;
        }
        e eVar = this.b;
        if (eVar == null) {
            return;
        }
        eVar.a(charSequence);
        invalidateSelf();
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else if (this.c == i) {
        } else {
            this.c = i;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8591d56e", new Object[]{this, rect});
        } else {
            this.d.set(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c2b8a1d0", new Object[]{this})).intValue();
        }
        if (!this.d.isEmpty()) {
            return this.d.bottom - this.d.top;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2990b5b1", new Object[]{this})).intValue();
        }
        if (!this.d.isEmpty()) {
            return this.d.right - this.d.left;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9cc013fa", new Object[]{this, canvas});
            return;
        }
        e eVar = this.b;
        if (eVar == null || eVar.m() == null) {
            return;
        }
        boolean i = this.b.i();
        Picture n = this.b.n();
        if (i && n == null && !this.f20385a) {
            return;
        }
        this.f20385a = true;
        canvas.save();
        int o = this.b.o();
        int p = this.b.p();
        int width = (getBounds().width() - this.e) - this.f;
        int height = (getBounds().height() - this.g) - this.h;
        int i2 = (this.c & 7) == 1 ? (width - o) / 2 : 0;
        int i3 = (this.c & 112) == 16 ? (height - p) / 2 : 0;
        if ((this.c & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK) == 8388613) {
            i2 = width - o;
        }
        canvas.translate(this.e + i2, this.g + i3);
        if (this.b.b() == null && oeb.B()) {
            p = Math.min(p, height);
        }
        canvas.clipRect(0, 0, o, p);
        this.b.a(canvas);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d144fec0", new Object[]{this, new Integer(i)});
            return;
        }
        e eVar = this.b;
        if (eVar == null) {
            return;
        }
        eVar.b(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2242c5cf", new Object[]{this})).intValue();
        }
        e eVar = this.b;
        if (eVar != null) {
            return eVar.e();
        }
        return -1;
    }

    public void a(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d162128", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        this.e = i;
        this.g = i2;
        this.f = i3;
        this.h = i4;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        e eVar = this.b;
        if (eVar == null) {
            return 1;
        }
        return eVar.f();
    }

    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        e eVar = this.b;
        if (eVar == null) {
            return;
        }
        eVar.e(i);
        invalidateSelf();
    }

    public void b(int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315a9029", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        e eVar = this.b;
        if (eVar == null) {
            return;
        }
        eVar.a(i, i2, i3, i4);
        invalidateSelf();
    }
}
