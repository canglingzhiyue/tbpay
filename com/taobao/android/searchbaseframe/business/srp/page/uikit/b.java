package com.taobao.android.searchbaseframe.business.srp.page.uikit;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.jvm.internal.q;
import tb.kge;

/* loaded from: classes6.dex */
public final class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f14947a;
    private int b;
    private int c;
    private Path d;
    private final View e;

    static {
        kge.a(-709402136);
    }

    public b(View view) {
        q.c(view, "view");
        this.e = view;
    }

    public final void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
            return;
        }
        this.f14947a = i;
        b();
        this.e.invalidate();
    }

    public final void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9d66c3a", new Object[]{this, new Integer(i)});
            return;
        }
        this.b = i;
        b();
        this.e.invalidate();
    }

    public final void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    private final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.f14947a == 0 && this.b == 0) {
            this.d = null;
        } else if (this.e.getWidth() == 0 || this.e.getHeight() == 0) {
        } else {
            Path path = this.d;
            if (path == null) {
                this.d = new Path();
            } else {
                if (path == null) {
                    q.a();
                }
                path.reset();
            }
            float f = this.f14947a;
            float f2 = this.b;
            Path path2 = this.d;
            if (path2 == null) {
                q.a();
            }
            path2.addRoundRect(new RectF(0.0f, this.c, this.e.getWidth(), this.e.getHeight()), new float[]{f, f, f, f, f2, f2, f2, f2}, Path.Direction.CW);
        }
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            b();
        }
    }

    public final void a(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3f391fd", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        if (this.d == null) {
            return;
        }
        canvas.save();
        canvas.clipPath(this.d);
    }

    public final void b(Canvas canvas) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4a03d9c", new Object[]{this, canvas});
            return;
        }
        q.c(canvas, "canvas");
        if (this.d == null) {
            return;
        }
        canvas.restore();
    }
}
