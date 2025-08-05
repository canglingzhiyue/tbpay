package com.taobao.homepage.view.manager;

import android.view.ViewStub;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.home.component.utils.j;
import com.taobao.homepage.utils.n;
import com.taobao.taobao.R;
import tb.kge;
import tb.ksp;
import tb.lbq;
import tb.ohv;

/* loaded from: classes7.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private lbq f17323a;
    private ViewStub b;

    static {
        kge.a(999778501);
    }

    public m(lbq lbqVar) {
        this.f17323a = lbqVar;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else if (d() || com.taobao.homepage.page.weexv2.a.d() || !this.f17323a.getHomePageManager().j().c().a()) {
        } else {
            if (this.b == null) {
                this.b = (ViewStub) this.f17323a.getRootView().findViewById(R.id.homepage_tip);
                ViewStub viewStub = this.b;
                if (viewStub == null) {
                    return;
                }
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewStub.getLayoutParams();
                layoutParams.topMargin = c();
                this.b.setLayoutParams(layoutParams);
            }
            try {
                com.taobao.android.shake.api.a.a().a(this.b);
            } catch (Exception e) {
                ksp.a("ShakeManager", "startShake ShakeHomePageService error ", e);
            }
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (d()) {
        } else {
            com.taobao.gateway.dispatch.a.b().a(new Runnable() { // from class: com.taobao.homepage.view.manager.m.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    try {
                        com.taobao.android.shake.api.a.a().b();
                    } catch (Exception e) {
                        ksp.a("ShakeManager", "stopShake ShakeHomePageService error ", e);
                    }
                }
            });
        }
    }

    private boolean d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("596b2ef", new Object[]{this})).booleanValue() : !n.o() && !j.a("enableForeignShake", false);
    }

    private int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5889b5d", new Object[]{this})).intValue();
        }
        ohv e = this.f17323a.getHomePageManager().e();
        if (e != null) {
            return e.i();
        }
        return 0;
    }
}
