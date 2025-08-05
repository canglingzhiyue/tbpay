package com.taobao.search.sf.newsearch.widgets;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.j;
import com.taobao.search.common.util.r;
import kotlin.TypeCastException;
import kotlin.jvm.internal.q;
import tb.kge;
import tb.rwf;

/* loaded from: classes8.dex */
public final class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Paint f19470a;
    private final float b;
    private final float c;
    private final float d;
    private boolean e;
    private boolean f;
    private float g;
    private boolean h;
    private final boolean i;
    private boolean j;
    private final int k;
    private final DecelerateInterpolator l;
    private e m;
    private final View n;

    static {
        kge.a(-1977609943);
    }

    public f(View view) {
        q.c(view, "view");
        this.n = view;
        this.f19470a = new Paint(1);
        this.b = j.a(160.0f);
        this.c = 0.4f;
        this.d = 0.7f;
        this.g = 1.0f;
        this.h = true;
        this.i = r.e("sceneHeaderMaskPerf");
        this.j = true;
        this.k = j.a(22.0f);
        this.l = new DecelerateInterpolator();
    }

    public final void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f = z;
        }
    }

    public final void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d6ac0b", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public final void a(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e02e461", new Object[]{this, eVar});
        } else {
            this.m = eVar;
        }
    }

    public final void a(int i) {
        e eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        ViewParent parent = this.n.getParent();
        if (parent == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.view.View");
        }
        int measuredHeight = ((View) parent).getMeasuredHeight();
        boolean z = this.e;
        if (i >= this.d * measuredHeight) {
            this.e = true;
        }
        if (z != this.e) {
            this.n.invalidate();
        }
        if (!a() || (eVar = this.m) == null) {
            return;
        }
        eVar.a();
    }

    public final void a(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8218858", new Object[]{this, new Float(f)});
            return;
        }
        this.h = true;
        float f2 = this.c;
        if (f > 1.0f - f2) {
            this.n.setAlpha(1.0f);
        } else {
            this.n.setAlpha(f / (1.0f - f2));
        }
        this.n.invalidate();
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (!this.h) {
        } else {
            this.h = false;
            this.g = this.l.getInterpolation(rwf.b((-this.n.getTranslationY()) / this.k, 1.0f));
            this.f19470a.setAlpha((int) (this.g * 255));
            this.f19470a.setShader(new LinearGradient(0.0f, -this.n.getTranslationY(), 0.0f, (-this.n.getTranslationY()) + this.b, Color.parseColor("#99000000"), 0, Shader.TileMode.CLAMP));
        }
    }

    public final boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.e && this.f && !this.j && this.i;
    }

    public final void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        if (!a()) {
            return;
        }
        b();
        canvas.drawRect(0.0f, -this.n.getTranslationY(), this.n.getMeasuredWidth(), (-this.n.getTranslationY()) + this.b, this.f19470a);
    }
}
