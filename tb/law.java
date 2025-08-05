package tb;

import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.application.common.a;
import com.taobao.application.common.c;
import com.taobao.homepage.view.manager.lifecycle.listener.IPageLifeCycle;
import com.taobao.homepage.view.manager.lifecycle.listener.a;
import com.taobao.homepage.view.manager.lifecycle.listener.b;
import com.taobao.homepage.view.manager.lifecycle.listener.d;
import com.uc.webview.export.media.MessageID;

/* loaded from: classes7.dex */
public class law implements IPageLifeCycle, a, b, d, tgs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private a.InterfaceC0630a d;

    /* renamed from: a  reason: collision with root package name */
    private final lax f30441a = new lax();
    private final lay b = new lay();
    private final laz c = new laz();
    private final lbb e = new lbb();
    private final ssi f = new ssi();

    static {
        kge.a(-887824236);
        kge.a(7935770);
        kge.a(1531639748);
        kge.a(200220330);
        kge.a(-612825092);
        kge.a(140381133);
    }

    public law() {
        c();
    }

    public lbe a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lbe) ipChange.ipc$dispatch("f07394f", new Object[]{this}) : this.c;
    }

    public lbc b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lbc) ipChange.ipc$dispatch("16b8de70", new Object[]{this}) : this.f30441a;
    }

    public lbg d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lbg) ipChange.ipc$dispatch("261c29aa", new Object[]{this}) : this.e;
    }

    public lbd e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (lbd) ipChange.ipc$dispatch("2dcdceac", new Object[]{this}) : this.b;
    }

    public tgt o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (tgt) ipChange.ipc$dispatch("7ac1fc0f", new Object[]{this}) : this.f;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b2e1ed", new Object[]{this});
            return;
        }
        this.f30441a.a();
        this.b.a();
        this.c.a();
        this.e.a();
        this.f.a();
        n();
    }

    @Override // com.taobao.homepage.view.manager.lifecycle.listener.a
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0f96e", new Object[]{this});
            return;
        }
        ksp.c("HomepageLifeCycleManager", "onAppToBackground");
        this.f30441a.b();
    }

    @Override // com.taobao.homepage.view.manager.lifecycle.listener.a
    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cf10ef", new Object[]{this});
            return;
        }
        ksp.c("HomepageLifeCycleManager", "onAppToFront");
        this.f30441a.c();
    }

    @Override // com.taobao.homepage.view.manager.lifecycle.listener.b
    public void a(String str, Intent intent, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24a609f9", new Object[]{this, str, intent, str2});
            return;
        }
        ksp.c("HomepageLifeCycleManager", "onOutLink");
        this.b.a(str, intent, str2);
    }

    @Override // com.taobao.homepage.view.manager.lifecycle.listener.IPageLifeCycle
    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dd2870", new Object[]{this});
            return;
        }
        ksp.c("HomepageLifeCycleManager", "onStart");
        this.c.b();
    }

    @Override // com.taobao.homepage.view.manager.lifecycle.listener.IPageLifeCycle
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        ksp.c("HomepageLifeCycleManager", "onResume,当前的类型是：" + str);
        this.c.a(str);
    }

    @Override // com.taobao.homepage.view.manager.lifecycle.listener.IPageLifeCycle
    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eb3ff1", new Object[]{this});
            return;
        }
        ksp.c("HomepageLifeCycleManager", "onLazyInit");
        this.c.c();
    }

    @Override // com.taobao.homepage.view.manager.lifecycle.listener.IPageLifeCycle
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f95772", new Object[]{this});
            return;
        }
        ksp.c("HomepageLifeCycleManager", "onPause");
        this.c.d();
    }

    @Override // com.taobao.homepage.view.manager.lifecycle.listener.IPageLifeCycle
    public void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6076ef3", new Object[]{this});
            return;
        }
        ksp.c("HomepageLifeCycleManager", MessageID.onStop);
        this.c.e();
    }

    @Override // com.taobao.homepage.view.manager.lifecycle.listener.IPageLifeCycle
    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6158674", new Object[]{this});
            return;
        }
        ksp.c("HomepageLifeCycleManager", "onWillExit");
        this.c.f();
    }

    @Override // tb.tgs
    public void a(float f, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c0ff5ab", new Object[]{this, new Float(f), new Integer(i)});
            return;
        }
        ksp.c("HomepageLifeCycleManager", "onPageScrolled");
        this.e.a(f, i);
    }

    @Override // tb.tgs
    public void a(String str, tgr tgrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4051d3e3", new Object[]{this, str, tgrVar});
            return;
        }
        ksp.c("HomepageLifeCycleManager", "selectTab: " + str);
        this.e.a(str, tgrVar);
    }

    @Override // com.taobao.homepage.view.manager.lifecycle.listener.d
    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63fccf7", new Object[]{this});
            return;
        }
        ksp.c("HomepageLifeCycleManager", "onFestivalChanged");
        this.f.b();
    }

    private void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        this.d = new lbf();
        c.a(this.d, true);
    }

    private void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6239df5", new Object[]{this});
            return;
        }
        a.InterfaceC0630a interfaceC0630a = this.d;
        if (interfaceC0630a == null) {
            return;
        }
        c.a(interfaceC0630a);
    }
}
