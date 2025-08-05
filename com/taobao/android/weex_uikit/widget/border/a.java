package com.taobao.android.weex_uikit.widget.border;

import android.graphics.Path;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.weex_framework.util.c f16161a;
    private com.taobao.android.weex_framework.util.c b;
    private com.taobao.android.weex_framework.util.c c;
    private com.taobao.android.weex_framework.util.c d;
    private com.taobao.android.weex_framework.util.c e;
    private com.taobao.android.weex_framework.util.c f;

    static {
        kge.a(-818144660);
    }

    public void a(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0fea68", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.f16161a = new com.taobao.android.weex_framework.util.c(f, f2);
        }
    }

    public void b(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90f625a9", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.b = new com.taobao.android.weex_framework.util.c(f, f2);
        }
    }

    public void c(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5dc60ea", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.c = new com.taobao.android.weex_framework.util.c(f, f2);
        }
    }

    public void d(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fac29c2b", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.d = new com.taobao.android.weex_framework.util.c(f, f2);
        }
    }

    public void e(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fa8d76c", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.e = new com.taobao.android.weex_framework.util.c(f, f2);
        }
    }

    public void f(float f, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("648f12ad", new Object[]{this, new Float(f), new Float(f2)});
        } else {
            this.f = new com.taobao.android.weex_framework.util.c(f, f2);
        }
    }

    public void a(Path path) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bcd9350", new Object[]{this, path});
            return;
        }
        a();
        path.reset();
        path.moveTo(this.f16161a.a(), this.f16161a.b());
        path.lineTo(this.b.a(), this.b.b());
        path.lineTo(this.c.a(), this.c.b());
        path.lineTo(this.f.a(), this.f.b());
        path.lineTo(this.e.a(), this.e.b());
        path.lineTo(this.d.a(), this.d.b());
        path.close();
    }

    private void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (this.f16161a != null && this.b != null && this.c != null && this.d != null && this.e != null && this.f != null) {
        } else {
            throw new IllegalArgumentException("BorderClip coordinates are not enough");
        }
    }
}
