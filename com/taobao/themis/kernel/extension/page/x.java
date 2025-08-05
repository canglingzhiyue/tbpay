package com.taobao.themis.kernel.extension.page;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.container.Window;
import com.taobao.themis.kernel.extension.page.w;
import com.taobao.themis.kernel.page.ITMSPage;
import tb.kge;
import tb.qqc;

/* loaded from: classes9.dex */
public final class x implements w {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Window.Orientation f22533a;
    private final ITMSPage b;

    static {
        kge.a(-339025644);
        kge.a(1363875829);
    }

    public x(ITMSPage page) {
        kotlin.jvm.internal.q.d(page, "page");
        this.b = page;
        this.f22533a = qqc.k(this.b);
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
        } else {
            w.a.c(this);
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void c_(ITMSPage page) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f4ed18e", new Object[]{this, page});
            return;
        }
        kotlin.jvm.internal.q.d(page, "page");
        w.a.a(this, page);
    }

    @Override // com.taobao.themis.kernel.extension.page.g
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
        } else {
            w.a.b(this);
        }
    }

    @Override // com.taobao.themis.kernel.extension.page.w
    public void a(Window.Orientation orientation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87bb0eb3", new Object[]{this, orientation});
        } else if (orientation == null) {
            Window c = this.b.c().e().c();
            if (c != null) {
                c.a(this.f22533a);
            }
            b(this.f22533a);
        } else {
            Window c2 = this.b.c().e().c();
            if (c2 != null) {
                c2.a(orientation);
            }
            b(orientation);
        }
    }

    private final void b(Window.Orientation orientation) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbeda12", new Object[]{this, orientation});
            return;
        }
        int i = y.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i == 1) {
            Activity o = this.b.b().o();
            kotlin.jvm.internal.q.b(o, "page.getInstance().activity");
            o.setRequestedOrientation(1);
        } else if (i == 2) {
            Activity o2 = this.b.b().o();
            kotlin.jvm.internal.q.b(o2, "page.getInstance().activity");
            o2.setRequestedOrientation(0);
        } else if (i != 3) {
        } else {
            Activity o3 = this.b.b().o();
            kotlin.jvm.internal.q.b(o3, "page.getInstance().activity");
            o3.setRequestedOrientation(-1);
        }
    }
}
