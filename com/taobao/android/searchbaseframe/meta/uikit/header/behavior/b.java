package com.taobao.android.searchbaseframe.meta.uikit.header.behavior;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.util.t;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FrameLayout e;
    private View f;
    private int g;

    static {
        kge.a(-1295081742);
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a, tb.itj
    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("57a83dc", new Object[]{this})).intValue();
        }
        return 0;
    }

    public b(View view, d dVar) {
        super(view, false, 0, dVar);
        a(view);
    }

    public b(View view, boolean z, d dVar) {
        super(view, z, 0, dVar);
        a(view);
    }

    public b(View view, boolean z, int i) {
        super(view, z, i, d.HALF_STICKY);
        a(view);
    }

    public b(View view, boolean z, int i, d dVar) {
        super(view, z, i, dVar);
        a(view);
    }

    public void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab8b44d9", new Object[]{this, new Integer(i)});
        } else {
            this.g = i;
        }
    }

    public int i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5dd2863", new Object[]{this})).intValue() : this.g;
    }

    private void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{this, view});
            return;
        }
        this.f = view;
        this.e = a(view.getContext());
        t.a(view);
        if (view.getLayoutParams() != null) {
            this.e.addView(view);
        } else {
            this.e.addView(view, new FrameLayout.LayoutParams(-1, -2));
        }
    }

    public FrameLayout a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (FrameLayout) ipChange.ipc$dispatch("b87ee879", new Object[]{this, context}) : new FrameLayout(context);
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a
    public View d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("f7f4866d", new Object[]{this}) : this.e;
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.c
    public View j() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (View) ipChange.ipc$dispatch("b51e1df3", new Object[]{this}) : this.f;
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.c, tb.itj
    public int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        float f = this.b;
        float f2 = f - i;
        if (i < 0 && f2 > 0.0f) {
            f2 = 0.0f;
        } else if (i > 0) {
            float measuredHeight = (j().getMeasuredHeight() + f2) - this.c;
            if (!f()) {
                measuredHeight += i2;
            }
            float f3 = i2;
            if (measuredHeight < f3) {
                measuredHeight = f() ? f3 : 0.0f;
                f2 = (measuredHeight - j().getMeasuredHeight()) + this.c;
            }
            int i4 = this.g;
            if (measuredHeight < i4) {
                f2 = this.c + (i4 - j().getMeasuredHeight());
            }
        }
        this.b = (int) f2;
        if (f()) {
            a(1.0f - ((Math.abs(this.b) * 1.0f) / ((j().getMeasuredHeight() - this.c) - i2)));
        } else {
            a(1.0f - ((Math.abs(this.b) * 1.0f) / (j().getMeasuredHeight() - this.c)));
        }
        int i5 = (int) (f - f2);
        this.f.setTranslationY(this.b);
        return i5;
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a
    public int e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5a4ca5f", new Object[]{this})).intValue() : this.f.getMeasuredHeight();
    }

    @Override // com.taobao.android.searchbaseframe.meta.uikit.header.behavior.a
    public int g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("5c0f961", new Object[]{this})).intValue() : -this.b;
    }
}
